package com.example.actividades_tareas.parcial_2.Ejercicio_6.Views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.actividades_tareas.parcial_2.Ejercicio_6.ViewsModels.CategoriaViewModel

@Composable
fun ListCategoriasViews(navegar: NavController) {

    val categoriaViewModel: CategoriaViewModel = CategoriaViewModel()

    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp)) {
        LazyRow {
            items(categoriaViewModel.obtenerCategorias()) {product ->
                CategoriaView(product, navegar)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaPreview () {
    val nav = rememberNavController()
    ListCategoriasViews(nav)
}

