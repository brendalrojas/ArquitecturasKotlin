package com.blrp.architectures.ui.view.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String,
) {
    data object Home : BottomNavItem("home", Icons.Default.Home, "Home")
    data object Favorite : BottomNavItem("search", Icons.Default.Search, "Search")
    data object Promo : BottomNavItem("promo", Icons.Default.Search, "Promo")
    data object Profile : BottomNavItem("profile", Icons.Default.Person, "Profile")
}