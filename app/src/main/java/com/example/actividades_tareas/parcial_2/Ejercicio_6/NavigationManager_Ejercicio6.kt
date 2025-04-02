package com.example.actividades_tareas.parcial_2.Ejercicio_6

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Views.ListCategoriasViews
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Views.ProductoView

@Preview(showBackground = true)
@Composable

fun NavigationManager_Ejercicio6() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Inicio") {

        composable(route = "Inicio") {
            ListCategoriasViews(navController)
        }

        composable(route = "producto?nombre={nombre}",
            arguments = listOf(
                navArgument("nombre") {
                    type = NavType.StringType
                    nullable = true
                    defaultValue = "-"
                }
            )
        ) {
                parametros ->
            val name = parametros.arguments?.getString("nombre") ?: "*"
            ProductoView(name)
        }

    }
}