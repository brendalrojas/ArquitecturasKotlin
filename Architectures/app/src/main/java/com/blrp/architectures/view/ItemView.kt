package com.blrp.architectures.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.blrp.architectures.R
import com.blrp.architectures.data.SportEvent

@Composable
fun ItemView(
    sportEvent: SportEvent.ResultSuccess
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "sportName",
                    fontWeight = FontWeight.Bold
                )
                LazyColumn {
                    item {
                        Text(text = "1 sportKey")
                        Text(text = "2 sportKey")
                        Text(text = "3 sportKey")
                    }
                }
            }
            Image(
                painter = painterResource(id = R.drawable.ic_rugby),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
        }
    }
}