package com.example.actividades_tareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actividades_tareas.parcial_2.Ejercicio_6.NavigationManager_Ejercicio6
import com.example.actividades_tareas.ui.theme.Actividades_TareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividades_TareasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //NavigationManager_Tarea3()
                    //NavigationManager_Tarea4()
                    NavigationManager_Ejercicio6()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Actividades_TareasTheme {
        Greeting("Android")
    }
}