package com.blrp.architectures.ui.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
                WineView()
            }
        }
    }
}

