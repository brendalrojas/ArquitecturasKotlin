package com.blrp.architectures.ui.navigate

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.blrp.architectures.ui.view.data.ScreenRoutes
import com.blrp.architectures.ui.view.screens.LoginScreen

fun NavGraphBuilder.secondNav(
    navController: NavHostController,
) {
    navigation(
        startDestination = ScreenRoutes.Login.route,
        route = ScreenRoutes.SecondNav.route
    ) {
        composable(route = ScreenRoutes.Login.route) {
            LoginScreen(navController = navController)
        }
        // vistas que no tienen bottom bar
    }
}