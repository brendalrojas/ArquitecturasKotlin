package com.blrp.architectures.ui.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.blrp.architectures.ui.navigate.HomeNavGraph
import com.blrp.architectures.ui.view.data.BottomNavItem
import com.blrp.architectures.ui.viewModel.WineViewModel

@Composable
fun PrincipalScreen(
    wineViewModel: WineViewModel,
    logout: () -> Unit,
) {
    val wineList by wineViewModel.wineData.collectAsState()
    val navController = rememberNavController()

    val items = mutableListOf(
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
                items = items
            )
        },
    ) { paddingValues ->
        HomeNavGraph(
            modifier = Modifier.padding(paddingValues),
            navController = navController,
            wineViewModel = wineViewModel
        )
    }
}