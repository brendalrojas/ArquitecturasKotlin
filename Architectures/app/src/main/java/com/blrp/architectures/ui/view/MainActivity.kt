package com.blrp.architectures.ui.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.blrp.architectures.ui.navigate.RootNav
import com.blrp.architectures.ui.theme.ArchitecturesTheme

class MainActivity : ComponentActivity() {

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
                    RootNav()
                }
            }
        }
    }
}

