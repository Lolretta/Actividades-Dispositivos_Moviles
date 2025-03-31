package com.example.actividades_tareas.parcial_2.Tarea_4.Models

import androidx.annotation.DrawableRes

data class FoodModel(

    val id: Int,
    val name: String,
    val description: String?,
    val price: Float,
    @DrawableRes val image: Int

)
