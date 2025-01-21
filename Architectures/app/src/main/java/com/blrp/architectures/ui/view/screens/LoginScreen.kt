package com.blrp.architectures.ui.view.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.navigation.NavHostController
import com.blrp.architectures.R
import com.blrp.architectures.ui.view.data.ScreenRoutes
import com.blrp.architectures.utils.navigateAndReplaceStartRoute

@Composable
fun LoginScreen(navController: NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize(),
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
                painter = painterResource(id = R.drawable.wine),
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
                    .padding(16.dp),
                contentDescription = null,
                tint = Color(0xFF7b65d1)
            )

            Text(
                text = "Ingresa a tu cuenta",
                fontFamily = FontFamily(Font(R.font.raleway_medium))
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                onValueChange = { },
                label = {
                    Text(
                        text = "Usuario",
                        fontFamily = FontFamily(Font(R.font.raleway_medium))
                    )
                }
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                onValueChange = { },
                label = {
                    Text(
                        text = "Contraseña",
                        fontFamily = FontFamily(Font(R.font.raleway_medium))
                    )
                }
            )
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color(0xFF7b65d1)),
                shape = RoundedCornerShape(5.dp),
                onClick = {
                    navController.navigateAndReplaceStartRoute(ScreenRoutes.FirstNav.route)
                })
            {
                Text("Ingresar")
            }
        }
    }

}