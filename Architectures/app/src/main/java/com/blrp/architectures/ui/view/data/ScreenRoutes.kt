package com.blrp.architectures.ui.view.data

sealed class ScreenRoutes(val route: String) {
    data object Home : ScreenRoutes("home")
    data object Favorite : ScreenRoutes("favorite")
    data object Promo : ScreenRoutes("promo")
    data object Profile : ScreenRoutes("profile")
    data object Login : ScreenRoutes("login")
    //Graph Routes
    data object SecondNav : ScreenRoutes(route = "SECOND_NAV_GRAPH")
    data object FirstNav : ScreenRoutes(route = "FIRST_NAV_GRAPH")
}