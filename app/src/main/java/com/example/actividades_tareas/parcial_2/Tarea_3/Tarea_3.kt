package com.example.actividades_tareas.parcial_2.Tarea_3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Tarea3_View (navegar: NavController) {

    var nombre by remember { mutableStateOf("") }
    var id by remember { mutableStateOf("") }

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        TextField(value = nombre, onValueChange = {nombre = it}, label = { Text("Nombre") })
        TextField(value = id, onValueChange = {id = it}, label = { Text("ID") })

        SmallFloatingActionButton(
            modifier = Modifier.padding(10.dp),
            onClick = {navegar.navigate("Resultado?nombre=$nombre&id=$id")}
        ) {
            Icon(imageVector = Icons.Default.ArrowForward,
                contentDescription = "icono",
                modifier = Modifier
                    .size(90.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun Tarea3_Preview () {
    val nav = rememberNavController()
    Tarea3_View(nav)
}