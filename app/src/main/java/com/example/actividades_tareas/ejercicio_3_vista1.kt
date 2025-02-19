package com.example.actividades_tareas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview (showBackground = true)
@Composable
fun MatematicasView(){

    var num1 by remember {
        mutableStateOf("")
    }
    var num2 by remember {
        mutableStateOf("")
    }
    var resultado by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text= "Número 1")
        TextField(
            value = num1,
            placeholder = {Text(text = "Aquí escribe tu primer número")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange ={
                num1 = it
            },
            modifier = Modifier.padding(bottom = 15.dp)
        )

        Text(text= "Número 2")
        TextField(
            value = num2,
            placeholder = {Text(text = "Aquí escribe tu segundo número")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

            onValueChange ={
                num2 = it
            },
            modifier = Modifier.padding(bottom = 15.dp)
        )

        Button(onClick = {
            resultado = (num1.toInt() + num2.toInt()).toString()

        }, modifier = Modifier.fillMaxWidth().padding(horizontal = 120.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            )) {
            Text(text = "Sumar")
        }

        OutlinedButton(onClick = {
            resultado = (num1.toInt() - num2.toInt()).toString()
        }, modifier = Modifier.fillMaxWidth().padding(horizontal = 120.dp)
        ) {
            Text(text = "Restar")
        }

        IconButton(onClick = {
            resultado = (num1.toInt() * num2.toInt()).toString()

        },  modifier = Modifier.fillMaxWidth().padding(horizontal = 120.dp)
        ) {
            Text(text = "Multiplicar")
        }

        Image(painter = painterResource(id = R.drawable.gordito),
            contentDescription = "dividir",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(100.dp)
                .padding(5.dp)
                .clickable{ resultado = (num1.toInt() / num2.toInt()).toString()})

        Text(text = "Resultado: $resultado", fontSize = 15.sp, color = Color.Blue)
    }

}
