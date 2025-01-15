package com.blrp.architectures

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.blrp.architectures.data.SportEvent
import com.blrp.architectures.data.getResultEventsInRealtime
import com.blrp.architectures.ui.EventBus
import com.blrp.architectures.ui.theme.ArchitecturesTheme
import com.blrp.architectures.view.MainViewScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private val results = listOf<SportEvent.ResultSuccess>()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setUpSubscribers()

        setContent {
            ArchitecturesTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MainViewScreen(results)
                }
            }
        }
    }

    private fun setUpSubscribers() {
        lifecycleScope.launch {
            EventBus.instance().subscribe<SportEvent> { event ->
                when (event) {
                    is SportEvent.ResultSuccess -> results.plus(event)
                    else -> {}
                }
            }
        }
    }

    private fun getEvents() {
        lifecycleScope.launch {
            val events = getResultEventsInRealtime()
            events.forEach {
                delay(someTime())
                EventBus.instance().publish(it)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        getEvents()
    }

    private fun someTime(): Long = Random.nextLong(500, 2_000)
}

