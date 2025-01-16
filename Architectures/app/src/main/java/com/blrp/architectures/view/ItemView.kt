package com.blrp.architectures.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.blrp.architectures.data.SportEvent

@Composable
fun ItemView(
    sportEvent: SportEvent.ResultSuccess,
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
                text = "${sportEvent.sportKey}. ${sportEvent.sportName}",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            sportEvent.results?.forEach { results ->
                Text(
                    text = results,
                    fontSize = 14.sp
                )
            }
        }
        Image(
            painter = painterResource(id = sportEvent.getImgRest),
            contentDescription = null,
            modifier = Modifier.size(50.dp)
        )
    }

}