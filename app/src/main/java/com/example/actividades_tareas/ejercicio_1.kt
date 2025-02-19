package com.example.holamundo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BarrasView() {

        Column (
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.5.dp)
                ) {
                    HorizontalDivider(thickness = 110.dp, color = Color(0xFF001E54))
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.5.dp)
                ) {
                    HorizontalDivider(thickness = 110.dp, color = Color(0xFF72DC74))
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.5.dp)
                ) {
                    HorizontalDivider(thickness = 110.dp, color = Color(0xFF001E54))
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxHeight(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                ) {
                    VerticalDivider(thickness = 120.dp, color = Color(0xFF001E54))
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                ) {
                    VerticalDivider(thickness = 120.dp, color = Color(0xFF5D96FF))
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                ) {
                    VerticalDivider(thickness = 120.dp, color = Color(0xFF001E54))
                }
            }
        }
}