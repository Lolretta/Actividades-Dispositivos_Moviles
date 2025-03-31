package com.example.actividades_tareas.parcial_2.Tarea_4.ViewsModels

import androidx.lifecycle.ViewModel
import com.example.actividades_tareas.R
import com.example.actividades_tareas.parcial_2.Tarea_4.Models.FoodModel

class FoodViewModel() : ViewModel() {

    fun obtenerComida() : List<FoodModel> {

        val Comida_1 = FoodModel(
            id = 1,
            name = "Boneless",
            description = "100 gramos",
            price = 90.0f,
            image = R.drawable.boneless
        )

        val Comida_2 = FoodModel(
            id = 2,
            name = "Ramen",
            description = "Bowl chico",
            price = 100.0f,
            image = R.drawable.ramen
        )

        val Comida_3 = FoodModel(
            id = 3,
            name = "Tacos Cecina",
            description = "4 tacos de cecina",
            price = 60.0f,
            image = R.drawable.cecina
        )

        val Comida_4 = FoodModel(
            id = 4,
            name = "Boneless",
            description = "200 gramos",
            price = 120.0f,
            image = R.drawable.boneless
        )

        val Comida_5 = FoodModel(
            id = 5,
            name = "Ramen",
            description = "Bowl mediano",
            price = 150.0f,
            image = R.drawable.ramen
        )

        val Comida_6 = FoodModel(
            id = 6,
            name = "Tacos Cecina",
            description = "6 tacos de cecina",
            price = 100.0f,
            image = R.drawable.cecina
        )

        val Comida_7 = FoodModel(
            id = 7,
            name = "Boneless",
            description = "300 gramos",
            price = 150.0f,
            image = R.drawable.boneless
        )

        val Comida_8 = FoodModel(
            id = 8,
            name = "Ramen",
            description = "Bowl grande",
            price = 200.0f,
            image = R.drawable.ramen
        )

        val Comida_9 = FoodModel(
            id = 9,
            name = "Tacos Cecina",
            description = "8 tacos de cecina",
            price = 120.0f,
            image = R.drawable.cecina
        )

        val Comida_10 = FoodModel(
            id = 10,
            name = "Boneless",
            description = "400 gramos",
            price = 180.0f,
            image = R.drawable.boneless
        )

        val FoodList = listOf<FoodModel>(
            Comida_1, Comida_2, Comida_3, Comida_4, Comida_5, Comida_6, Comida_7, Comida_8,
            Comida_9, Comida_10
        )

        return FoodList

    }

}