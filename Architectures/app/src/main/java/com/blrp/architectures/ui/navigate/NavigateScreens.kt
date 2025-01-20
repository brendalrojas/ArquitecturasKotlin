package com.blrp.architectures.ui.navigate

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.blrp.architectures.ui.view.data.BottomNavItem
import com.blrp.architectures.ui.view.screens.FavoriteScreen
import com.blrp.architectures.ui.view.screens.HomeScreen
import com.blrp.architectures.ui.view.screens.ProfileScreen
import com.blrp.architectures.ui.view.screens.PromosScreen

@Composable
fun NavigateScreens(modifier: Modifier, navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.route
    ) {
        composable("home") { HomeScreen(navController) }
        composable("promo") { PromosScreen(navController) }
        composable("favorite") { FavoriteScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
    }

}