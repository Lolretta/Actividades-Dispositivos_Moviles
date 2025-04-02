package com.example.actividades_tareas.parcial_2.Ejercicio_6.Views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.actividades_tareas.parcial_2.Ejercicio_6.ViewsModels.ProductoViewModel

@Composable
fun ListVideojuegosView(navegar: NavController) {

    val videojuegosViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(videojuegosViewModel.obtenerVideojuegos()) { product ->
                VideojuegoView(product)
            }
        }
        Button(onClick = {navegar.popBackStack()}, modifier = Modifier.padding(5.dp)) { Text("Regresar")}
    }
}

@Composable
fun ListAudioView(navegar: NavController) {

    val audioViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(audioViewModel.obtenerAudio()) { product ->
                AudioView(product)
            }
        }
        Button(onClick = {navegar.popBackStack()}, modifier = Modifier.padding(5.dp)) { Text("Regresar")}
    }
}

@Composable
fun ListTelefoniaView(navegar: NavController) {

    val telefoniaViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(telefoniaViewModel.obtenerTelefonia()) { product ->
                TelefonoView(product)
            }
        }
        Button(onClick = {navegar.popBackStack()}, modifier = Modifier.padding(5.dp)) { Text("Regresar")}
    }
}

@Composable
fun ListInstrumentosView(navegar: NavController) {

    val instrumentosViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(instrumentosViewModel.obtenerInstrumentos()) { product ->
                InstrumentoView(product)
            }
        }
        Button(onClick = {navegar.popBackStack()}, modifier = Modifier.padding(5.dp)) { Text("Regresar")}
    }
}

@Composable
fun ListComputacionView(navegar: NavController) {

    val computacionViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(computacionViewModel.obtenerComputacion()) { product ->
                ComputacionView(product)
            }
        }
        Button(onClick = {navegar.popBackStack()}, modifier = Modifier.padding(5.dp)) { Text("Regresar")}
    }
}

@Composable
fun ProductosView (id: Int, navegar: NavController) {

    if (id == 1) {
        ListVideojuegosView(navegar)
    }
    if (id == 2) {
        ListAudioView(navegar)
    }
    if (id == 3) {
        ListComputacionView(navegar)
    }
    if (id == 5) {
        ListInstrumentosView(navegar)
    }
    if (id == 4) {
        ListTelefoniaView(navegar)
    }

}