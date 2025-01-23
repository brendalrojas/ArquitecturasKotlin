package com.blrp.architectures.ui.view.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.blrp.architectures.ui.viewModel.WineViewModel

@Composable
fun HomeScreen(navController: NavHostController, modifier: Modifier, wineViewModel: WineViewModel) {
    Column {
        Text("home")
    }
}