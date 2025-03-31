package com.example.actividades_tareas.parcial_2.Tarea_4.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividades_tareas.R
import com.example.actividades_tareas.parcial_2.Tarea_4.Models.FoodModel
import com.example.actividades_tareas.parcial_2.Tarea_4.Preferencias
import kotlinx.coroutines.launch

@Preview(showBackground = true)
@Composable
fun FoodPreview () {
    val product = FoodModel(
        id = 1,
        name = "Boneless 200 gr.",
        description = null,
        price = 90.0f,
        image = R.drawable.boneless
    )
    FoodView(product)
}

@Composable
fun FoodView(producto: FoodModel) {
    val context = LocalContext.current
    val preferencias = Preferencias(context)
    val corroutine = rememberCoroutineScope()
    val savedMoney by preferencias.money.collectAsState(initial = 0f)

    fun comprar() {
        if (savedMoney >= producto.price) {
            val newSavedMoney = savedMoney - producto.price
            corroutine.launch {
                preferencias.compraComida(newSavedMoney)
            }
        }
    }

    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = producto.image),
                contentDescription = "",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )

            Column() {
                Text(producto.name, fontSize = 18.sp)
                Text(
                    text = producto.description ?: "Sin descripcion",
                    fontSize = 10.sp,
                    color = Color.DarkGray
                )

                Text(
                    "$ ${producto.price} MXN",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(top = 7.dp)
                )

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    if (savedMoney >= producto.price) {
                        Button(onClick = { comprar() }, enabled = savedMoney >= producto.price)
                        { Text("Comprar") }
                    } else {
                        Text("Dinero insuficiente", color = Color.Red, fontSize = 10.sp)
                    }
                }

            }
        }
    }
}
