package com.example.actividades_tareas.parcial_2.Actividad_5

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.actividades_tareas.R

@Composable
fun Actividad5_Resultado_View (anio: Int) {

    val anio_actual = 2025
    val edad = anio_actual - anio

    val ninio = R.drawable.ninio
    val joven = R.drawable.joven
    val viejo = R.drawable.viejo

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        when {
            edad <= 14 -> Resultado_Preview(ninio, "Menor de edad")
            edad == 15 -> Resultado_Preview(joven, "Mayor de edad en Indonesia pero no en México")
            edad == 16 -> Resultado_Preview(joven, "Mayor de edad en Cuba pero no en México")
            edad == 17 -> Resultado_Preview(
                joven, "Mayor de edad en Corea del Norte pero no en México"
            )
            edad == 18 -> Resultado_Preview(
                joven,
                "Mayor de edad en México y gran parte de Latinoamérica"
            )
            edad == 19 -> Resultado_Preview(joven, "Mayor de edad en Corea del Sur")
            edad == 20 -> Resultado_Preview(joven, "Mayor de edad en Japón")
            edad >= 21 && edad < 60 -> Resultado_Preview(
                joven, "Mayor de edad en USA y probablemente en todo el mundo"
            )
            edad >= 60 && edad < 64 -> Resultado_Preview(viejo, "Eres de la tercera edad")
            edad >= 65 -> Resultado_Preview(viejo, "Ya te puedes jubilar")
        }
    }
}

@Composable
fun Resultado_Preview(img: Int, Texto: String) {
        Card {

            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = img),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }
                Column(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(Texto)
                }
            }

        }
}
