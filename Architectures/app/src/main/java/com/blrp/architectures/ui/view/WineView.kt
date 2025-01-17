package com.blrp.architectures.ui.view

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun WineView(

) {
    Scaffold(
        topBar = {},
        bottomBar = {},
    ) { paddingValues ->

        LoginView(paddingValues)
    }
}