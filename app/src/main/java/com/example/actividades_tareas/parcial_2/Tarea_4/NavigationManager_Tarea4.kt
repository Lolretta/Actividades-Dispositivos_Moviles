package com.example.actividades_tareas.parcial_2.Tarea_4

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.actividades_tareas.parcial_2.Tarea_4.Views.ListFoodView

@Preview(showBackground = true)
@Composable
fun NavigationManager_Tarea4() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Inicio") {
        composable(route = "Inicio") {
            HomeView_Tarea4(navController)
        }
        composable(route = "Store") {
            ListFoodView()
        }

    }

}