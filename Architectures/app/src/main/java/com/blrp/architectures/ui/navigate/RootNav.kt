package com.blrp.architectures.ui.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.blrp.architectures.ui.view.PrincipalScreen
import com.blrp.architectures.ui.view.data.ScreenRoutes

@Composable
fun RootNav() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.SecondNav.route
    ) {
        secondNav(navController)
        composable(route = ScreenRoutes.FirstNav.route) {
            PrincipalScreen(
                logout = {
                    navController.navigate(ScreenRoutes.SecondNav.route) {
                        popUpTo(0) {}
                    }
                }
            )
        }
    }

}