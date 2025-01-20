package com.blrp.architectures.ui.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.blrp.architectures.ui.navigate.NavigateScreens
import com.blrp.architectures.ui.view.data.BottomNavItem

@Composable
fun WineView(

) {
    val navController = rememberNavController()
    val listItems = listOf(
        BottomNavItem.Home,
        BottomNavItem.Favorite,
        BottomNavItem.Promo,
        BottomNavItem.Profile
    )

    Scaffold(
        topBar = {},
        bottomBar = {
            BottomNavigationBar(
                navController = navController,
                items = listItems
            )
        },
    ) { paddingValues ->
        NavigateScreens(
            modifier = Modifier.padding(paddingValues),
            navController = navController
        )
    }
}