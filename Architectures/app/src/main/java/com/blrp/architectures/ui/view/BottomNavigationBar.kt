package com.blrp.architectures.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.blrp.architectures.R
import com.blrp.architectures.ui.theme.raleway
import com.blrp.architectures.ui.view.data.BottomNavItem

@Composable
fun BottomNavigationBar(navController: NavController, items: List<BottomNavItem>) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Box(
        modifier = Modifier
            .background(Color(0xFFf6f5fc)),
        contentAlignment = Alignment.Center
    ) {
        BottomNavigation(
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp),
            backgroundColor = Color(0xFFf6f5fc),
            elevation = 0.dp,
        ) {
            items.forEach { item ->
                BottomNavigationItem(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color(0xFFf6f5fc)),
                    selected = currentRoute == item.route,
                    onClick = {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = item.icon),
                            modifier = Modifier
                                .height(23.dp),
                            contentDescription = null,
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            fontFamily = FontFamily(Font(R.font.raleway_medium)),
                        )
                    },
                    selectedContentColor = Color(0xFF7b65d1),
                    unselectedContentColor = Color(0xFF939398)
                )
            }
        }
    }


}