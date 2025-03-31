package com.example.actividades_tareas.parcial_2.Tarea_4.Views

import androidx.compose.material3.AlertDialog
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividades_tareas.parcial_2.Tarea_4.Preferencias
import com.example.actividades_tareas.parcial_2.Tarea_4.ViewsModels.FoodViewModel

@Composable
fun InfoPersona() {
    val context = LocalContext.current
    val preferencias = Preferencias(context)
    val savedNombre = preferencias.name.collectAsState(initial = "---")
    val savedAge = preferencias.age.collectAsState(initial = -1)
    val savedHeight = preferencias.height.collectAsState(initial = 0.0f)
    val savedMoney = preferencias.money.collectAsState(initial = 0.0f)

    var openDialog by remember { mutableStateOf(false) }

    if (openDialog) {
        AlertDialog(
            onDismissRequest = { openDialog = false },
            title = { Text("Información Guardada del Cliente") },
            text = {
                Column {
                    Text("Nombre: ${savedNombre.value}")
                    Text("Edad: ${savedAge.value}")
                    Text("Altura: ${savedHeight.value}")
                    Text("Dinero: ${savedMoney.value}")
                }
            },
            confirmButton = {
                Button(onClick = { openDialog = false }) {
                    Text("Cerrar")
                }
            }
        )
    }

    Button(onClick = { openDialog = true }) {
        Text("Consultar Información")
    }
}


@Preview(showBackground = true)
@Composable
fun ListFoodView() {

    val context = LocalContext.current
    val preferencias = Preferencias(context)
    val savedMoney = preferencias.money.collectAsState(initial = 0.0f)

    val comidaViewModel: FoodViewModel = FoodViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(top = 16.dp)) {
        Text("Dinero: ${savedMoney.value}", fontSize = 20.sp, modifier = Modifier.padding(5.dp))
        LazyColumn {
            items(comidaViewModel.obtenerComida()) { product ->
                FoodView(producto = product)
            }
            item {
                InfoPersona()
            }
        }
    }
}
