package com.example.actividades_tareas.parcial_2.Actividad_5

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun NavigationManager_Actividad5 () {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Inicio") {

        composable(route = "Inicio") {
            Actividad5_Inicio_View(navController)
        }

        composable(route = "Resultado?anio={anio}",
            arguments = listOf(
                navArgument("anio") {
                    type = NavType.IntType
                    defaultValue = 0
                }
            )
        ) {
                parametros ->
            val anio = parametros.arguments?.getInt("anio") ?: 0
            Actividad5_Resultado_View(anio)
        }

    }

}