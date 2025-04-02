package com.example.actividades_tareas.parcial_2.Ejercicio_6.Views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.actividades_tareas.parcial_2.Ejercicio_6.ViewsModels.ProductoViewModel


@Composable
fun ListVideojuegosView() {

    val videojuegosViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(videojuegosViewModel.obtenerVideojuegos()) { product ->
                VideojuegoView(product)
            }
        }
    }
}

@Composable
fun ListAudioView() {

    val audioViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(audioViewModel.obtenerAudio()) { product ->
                AudioView(product)
            }
        }
    }
}

@Composable
fun ListTelefoniaView() {

    val telefoniaViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(telefoniaViewModel.obtenerTelefonia()) { product ->
                TelefonoView(product)
            }
        }
    }
}

@Composable
fun ListInstrumentosView() {

    val instrumentosViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(instrumentosViewModel.obtenerInstrumentos()) { product ->
                InstrumentoView(product)
            }
        }
    }
}

@Composable
fun ListComputacionView() {

    val computacionViewModel: ProductoViewModel = ProductoViewModel()

    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {
        LazyColumn {
            items(computacionViewModel.obtenerComputacion()) { product ->
                ComputacionView(product)
            }
        }
    }
}

@Composable
fun ProductoView (nombre: String) {

    if (nombre == "Videojuegos") {
        ListVideojuegosView()
    }
    if (nombre == "Audio") {
        ListAudioView()
    }
    if (nombre == "Computacion") {
        ListComputacionView()
    }
    if (nombre == "Instrumentos") {
        ListInstrumentosView()
    }
    if (nombre == "Telefonia") {
        ListTelefoniaView()
    }


}