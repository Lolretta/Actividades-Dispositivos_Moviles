package com.example.actividades_tareas.parcial_2.Ejercicio_6.Models

import androidx.annotation.DrawableRes

data class CategoriaModel(

    val id_cat: Int,

    @DrawableRes val image: Int,
    val nombre: String

)
