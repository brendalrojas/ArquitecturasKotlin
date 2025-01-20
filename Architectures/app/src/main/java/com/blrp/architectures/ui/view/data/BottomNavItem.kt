package com.blrp.architectures.ui.view.data

import com.blrp.architectures.R

sealed class BottomNavItem(
    val route: String,
    val icon: Int,
    val title: String,
) {
    data object Home : BottomNavItem("home", R.drawable.home, "Inicio")
    data object Favorite : BottomNavItem("favorite", R.drawable.bookmark, "Favoritos")
    data object Promo : BottomNavItem("promo", R.drawable.promotion, "Promociones")
    data object Profile : BottomNavItem("profile", R.drawable.profile, "Perfil")
}