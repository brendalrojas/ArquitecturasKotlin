package com.blrp.architectures.ui.navigate

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.blrp.architectures.ui.view.data.ScreenRoutes
import com.blrp.architectures.ui.view.screens.FavoriteScreen
import com.blrp.architectures.ui.view.screens.HomeScreen
import com.blrp.architectures.ui.view.screens.ProfileScreen
import com.blrp.architectures.ui.view.screens.PromosScreen
import com.blrp.architectures.ui.viewModel.WineViewModel

@Composable
fun HomeNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    wineViewModel: WineViewModel,
) {
    NavHost(
        navController = navController,
        route = ScreenRoutes.FirstNav.route,
        startDestination = ScreenRoutes.Home.route
    ) {
        composable(route = ScreenRoutes.Home.route) {
            HomeScreen(navController = navController, modifier = modifier, wineViewModel)
        }

        composable(route = ScreenRoutes.Favorite.route) {
            FavoriteScreen(navController = navController, modifier = modifier, wineViewModel)
        }

        composable(route = ScreenRoutes.Promo.route) {
            PromosScreen(navController = navController, modifier = modifier, wineViewModel)
        }

        composable(route = ScreenRoutes.Profile.route) {
            ProfileScreen(navController = navController, modifier = modifier, wineViewModel)
        }

    }
}