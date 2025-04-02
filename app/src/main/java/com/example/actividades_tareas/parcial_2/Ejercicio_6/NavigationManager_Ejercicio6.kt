package com.example.actividades_tareas.parcial_2.Ejercicio_6

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Views.ListCategoriasViews
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Views.ProductosView

@Preview(showBackground = true)
@Composable
fun NavigationManager_Ejercicio6() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Inicio") {

        composable(route = "Inicio") {
            ListCategoriasViews(navController)
        }

        composable(route = "productos?id={id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = 0
                }
            )
        ) {
            parametros ->
            val id = parametros.arguments?.getInt("id") ?: 0
            ProductosView(id, navController)
        }

    }
}