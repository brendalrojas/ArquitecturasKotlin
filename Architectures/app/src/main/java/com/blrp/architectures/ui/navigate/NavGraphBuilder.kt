package com.blrp.architectures.ui.navigate

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.blrp.architectures.ui.view.data.ScreenRoutes
import com.blrp.architectures.ui.view.screens.LoginScreen
import com.blrp.architectures.ui.viewModel.WineViewModel

fun NavGraphBuilder.secondNav(
    navController: NavHostController,
    wineViewModel: WineViewModel,
) {
    navigation(
        startDestination = ScreenRoutes.Login.route,
        route = ScreenRoutes.SecondNav.route
    ) {
        composable(route = ScreenRoutes.Login.route) {
            LoginScreen(navController = navController, wineViewModel)
        }
        // views without bottom bar
    }
}