package com.blrp.architectures.ui.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.blrp.architectures.R
import com.blrp.architectures.ui.view.data.ScreenRoutes
import com.blrp.architectures.utils.navigateAndReplaceStartRoute

@Composable
fun LoginScreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFf6f5fc)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Icon(
                painter = painterResource(id = R.drawable.user),
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth()
                    .padding(16.dp),
                contentDescription = null,
                tint = Color(0xFF7b65d1)
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                shape = RoundedCornerShape(16.dp),
                value = "",
                onValueChange = { },
                label = {
                    Text(
                        text = "Usuario",
                        fontFamily = FontFamily(Font(R.font.raleway_medium)),
                        fontSize = 14.sp
                    )
                }
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 16.dp),
                shape = RoundedCornerShape(16.dp),
                value = "",
                onValueChange = { },
                label = {
                    Text(
                        text = "Contraseña",
                        fontFamily = FontFamily(Font(R.font.raleway_medium)),
                        fontSize = 14.sp
                    )
                }
            )
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 4.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF7b65d1)),
                shape = RoundedCornerShape(24.dp),
                onClick = {
                    navController.navigateAndReplaceStartRoute(ScreenRoutes.FirstNav.route)
                })
            {
                Text(
                    text = "Ingresar",
                    fontFamily = FontFamily(Font(R.font.raleway_semibold)),
                    color = Color.White,
                    fontSize = 14.sp,
                )
            }

            Text(
                text = "¿Olvidaste tu contraseña?",
                fontFamily = FontFamily(Font(R.font.raleway_medium)),
                color = Color(0xFF7b65d1),
                fontSize = 12.sp,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 0.dp)
            )
        }
    }

}