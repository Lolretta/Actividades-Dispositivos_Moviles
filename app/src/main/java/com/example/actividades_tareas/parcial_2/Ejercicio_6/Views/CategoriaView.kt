package com.example.actividades_tareas.parcial_2.Ejercicio_6.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.CategoriaModel

@Composable
fun CategoriaView(categoria: CategoriaModel, navegar: NavController) {

    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable {
                navegar.navigate("productos?nombre=${categoria.nombre}")
            },
        elevation = CardDefaults.cardElevation(4.dp),

    ) {
        Column (modifier = Modifier.widthIn(0.dp, 150.dp).heightIn(0.dp, 150.dp)) {
            Text(
                text = categoria.nombre,
                fontSize = 12.sp,
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 5.dp, bottom = 5.dp)
            )

            Image(
                painter = painterResource(id = categoria.image),
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
        }
    }
}
