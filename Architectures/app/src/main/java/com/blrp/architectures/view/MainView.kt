package com.blrp.architectures.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blrp.architectures.R
import com.blrp.architectures.data.SportEvent
import com.blrp.architectures.data.getResultEventsInRealtime
import com.blrp.architectures.ui.theme.ArchitecturesTheme


@Composable
fun MainViewScreen(results: List<SportEvent.ResultSuccess>) {


    LazyColumn {
        items(results) { result ->
            ItemView(
                sportEvent = SportEvent.ResultSuccess(
                    sportKey = result.sportKey,
                    sportName = result.sportName,
                    results = result.results
                )
            )
        }
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val results = listOf(
        SportEvent.ResultSuccess(
            sportKey = 1,
            sportName = "Fútbol",
            results = listOf("Italia", "Perú", "Corea del Sur")
        )
    )

    ArchitecturesTheme {
        MainViewScreen(results)
    }
}