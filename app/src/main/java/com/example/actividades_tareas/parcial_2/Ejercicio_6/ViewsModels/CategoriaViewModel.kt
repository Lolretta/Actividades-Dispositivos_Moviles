package com.example.actividades_tareas.parcial_2.Ejercicio_6.ViewsModels

import androidx.lifecycle.ViewModel
import com.example.actividades_tareas.R
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.CategoriaModel

class CategoriaViewModel(): ViewModel() {

    fun obtenerCategorias(): List<CategoriaModel> {

        val videojuegos = CategoriaModel(
            image = R.drawable.videojuegos,
            nombre = "Videojuegos"
        )

        val audio = CategoriaModel(
            image = R.drawable.audio,
            nombre = "Audio"
        )

        val computacion = CategoriaModel(
            image = R.drawable.computacion,
            nombre = "Computacion"
        )

        val telefonia = CategoriaModel(
            image = R.drawable.telefonia,
            nombre = "Telefonia"
        )

        val instrumentos = CategoriaModel(
            image = R.drawable.teclado,
            nombre = "Instrumentos"
        )

        val CategoriasList = listOf<CategoriaModel>(
            videojuegos, audio, computacion, telefonia, instrumentos
        )

        return CategoriasList

    }

}