package com.blrp.architectures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.blrp.architectures.ui.theme.ArchitecturesTheme
import com.blrp.architectures.view.MainViewScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArchitecturesTheme {
                MainViewScreen()
            }
        }
    }
}

