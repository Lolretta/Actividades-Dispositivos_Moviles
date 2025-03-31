package com.example.actividades_tareas.parcial_2.Tarea_3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Tarea3_Resultado_View(name: String, id: Int){

    var TextoNombre by remember { mutableStateOf("") }
    var TextoEntrada by remember { mutableStateOf("") }

    val alumnos = intArrayOf(22000, 22001, 22002, 22003, 22004,22005, 22006, 22007, 22008, 22009, 22010, 22620)
    val alumnosIntercambio = intArrayOf(22180)

    if (id >= 1 && id <= 10) {
        TextoNombre = "Bienvenido al Laboratorio de ISND estimado Coordinador $name"
        TextoEntrada = "Coordinador $name autorizado para el uso del laboratorio"
    }
    if (id >= 11 && id <= 100) {
        TextoNombre = "Permiso autorizado para el profesor $name"
        TextoEntrada = "Profesor $name autorizado para el uso del laboratorio"
    }
    if (id >= 101 && id <= 19000) {
        TextoNombre = "Acceso denegado a egresados que no son de sistemas"
        TextoEntrada = "Este laboratorio es de uso exclusivo para la carrera de ISND"
    }
    if (id >= 19001 && id <= 23000) {
        TextoNombre = "Bienvenido $name es un gusto verlo aquí"
        TextoEntrada = "Este laboratorio es de uso exclusivo para la carrera de ISND"
        for (alumno in alumnos) {
            if (id == alumno) {
                TextoEntrada = "Alumno $name autorizado para el uso del laboratorio"
                break
            }
        }
        for (intercambio in alumnosIntercambio) {
            if (id == intercambio) {
                TextoNombre = "Alumno en intercambio, no es posible que esté en el IEST"
                break
            }
        }
    }

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = TextoNombre)
        Text(text = TextoEntrada)
    }
    
}