package com.example.actividades_tareas.parcial_2.Actividad_5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Person
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
fun Actividad5_Inicio_View (navegar: NavController) {

    var anio by remember { mutableStateOf("") }

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        TextField(value = anio, onValueChange = {anio = it}, label = { Text("Año de nacimiento") })

        SmallFloatingActionButton(
            modifier = Modifier.padding(10.dp),
            onClick = {navegar.navigate("Resultado?anio=$anio")}
        ) {
            Icon(imageVector = Icons.Default.Person,
                contentDescription = "icono",
                modifier = Modifier
                    .size(90.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun Actividad5_Inicio_Preview () {
    val nav = rememberNavController()
    Actividad5_Inicio_View(nav)
}