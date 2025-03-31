package com.example.actividades_tareas.parcial_2.Tarea_4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.actividades_tareas.parcial_2.Actividad_5.Actividad5_Inicio_View
import kotlinx.coroutines.launch

@Composable
fun HomeView_Tarea4(navegar: NavController) {

    val context = LocalContext.current
    val preferencias = Preferencias(context)
    val corroutine = rememberCoroutineScope()

    var name by remember { mutableStateOf("...") }
    var age by remember { mutableStateOf("0") }
    var height by remember { mutableStateOf("0") }
    var money by remember { mutableStateOf("0") }

    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("Ingrese su información personal")
        TextField(value = name, onValueChange = {name = it}, label = { Text("Nombre") })
        TextField(value = age, onValueChange = {age= it}, label = { Text("Edad") })
        TextField(value = height, onValueChange = {height = it}, label = { Text("Altura") })
        TextField(value = money, onValueChange = {money= it}, label = { Text("Dinero") })

        var checked by remember { mutableStateOf(true) }

        Switch(
            checked = checked,
            onCheckedChange = {
                checked = it
            }
        )

        Button(onClick = {
            if (checked == true) {
                corroutine.launch {
                    preferencias.savePersonData(name, age.toInt(), height.toFloat(), money.toFloat())
                }
            }
            navegar.navigate("Store")
        }) {
            Text("Iniciar Compras")
        }

        Button(onClick = { corroutine.launch { preferencias.clearData() }},
            modifier = Modifier.padding(vertical = 10.dp))
        {
            Text("Borrar Información Previa")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview_Tarea4 () {
    val nav = rememberNavController()
    HomeView_Tarea4(nav)
}