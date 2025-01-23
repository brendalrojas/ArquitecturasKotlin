package com.blrp.architectures.ui.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.blrp.architectures.ui.navigate.RootNav
import com.blrp.architectures.ui.theme.ArchitecturesTheme
import com.blrp.architectures.ui.viewModel.WineViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val wineViewModel: WineViewModel by viewModels()


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        contentApp()
    }

    private fun contentApp() {
        setContent {
            ArchitecturesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    RootNav(wineViewModel = wineViewModel)
                }
            }
        }
    }

}

