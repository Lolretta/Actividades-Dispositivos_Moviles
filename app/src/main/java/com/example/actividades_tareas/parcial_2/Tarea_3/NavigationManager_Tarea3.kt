package com.example.actividades_tareas.parcial_2.Tarea_3

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun NavigationManager_Tarea3 () {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Inicio") {

        composable(route = "Inicio") {
            Tarea3_Inicio_View(navController)
        }

        composable(route = "Tarea") {
            Tarea3_View(navController)
        }

        composable(route = "Resultado?nombre={nombre}&id={id}",
            arguments = listOf(
                navArgument("nombre") {
                    type = NavType.StringType
                    nullable = true
                    defaultValue = "-"
                },
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = 0
                }
            )
        ) {
            parametros ->
            val Name = parametros.arguments?.getString("nombre") ?: "*"
            val Id = parametros.arguments?.getInt("id") ?: 0
            Tarea3_Resultado_View(Name, Id)
        }

    }

}