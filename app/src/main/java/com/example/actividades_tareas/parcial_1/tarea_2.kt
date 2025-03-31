package com.example.actividades_tareas.parcial_1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividades_tareas.R

@Composable
fun FilaVista (mes: String, ingresos: Int, egresos: Int, neto: Int) {

    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                mes,
                color = Color.White,
                modifier = Modifier
                    .width(100.dp)
                    .background(color = Color(0xFF17911F))
            )
            Text(
                "$ingresos",
                color = cambioColoresGanancias(mes),
                fontWeight = modificacionTexto(mes),
                modifier = Modifier
                    .width(100.dp)
                    .background(color = Color.White)
            )
            Text(
                "$egresos",
                color = Color.Black,
                modifier = Modifier
                    .width(100.dp)
                    .background(color = Color.White)
            )
            Text(
                "$neto",
                color = cambioColoresNeto(neto),
                modifier = Modifier
                    .width(100.dp)
                    .background(color = Color.White)
            )
        }
    }
}

@Composable
fun cambioColoresNeto (neto: Int): Color {

    var colorLetra by remember {
        mutableStateOf(Color.White)
    }

    if (neto == 0) {
        colorLetra = Color.White
    }
    if (neto < 0) {
        colorLetra = Color.Red
    }
    if (neto > 0) {
        colorLetra = Color.Black
    }
    return colorLetra
}

@Composable
fun cambioColoresGanancias (mes: String): Color {

    var colorLetra by remember {
        mutableStateOf(Color.Black)
    }

    if (mes == "Diciembre") {
        colorLetra = Color.Blue
    }
    return colorLetra
}

@Composable
fun modificacionTexto (mes: String): FontWeight {

    var negritas by remember {
        mutableStateOf(FontWeight.Normal)
    }

    if (mes == "Enero" || mes == "Abril" || mes == "Julio" || mes == "Diciembre") {
        negritas = FontWeight.Bold
    }
    return negritas
}

@Preview(showBackground = true)
@Composable
fun ContabilidadView () {

    val eneroIngresos = 2000
    val febreroIngresos = 2000
    val marzoIngresos = 2000
    val abrilIngresos = 4000
    val mayoIngresos = 4000
    val junioIngresos = 4000
    val julioIngresos = 8000
    val agostoIngresos = 8000
    val septiembreIngresos = 8000
    val octubreIngresos = 12000
    val noviembreIngresos = 12000
    val diciembreIngresos = 25000

    val eneroEgresos = 500
    val febreroEgresos = 500
    val marzoEgresos = 500
    val abrilEgresos = 4500
    val mayoEgresos = 1200
    val junioEgresos = 3000
    val julioEgresos = 4500
    val agostoEgresos = 4500
    val septiembreEgresos = 4650
    val octubreEgresos = 6000
    val noviembreEgresos = 6000
    val diciembreEgresos = 75000

    var eneroNeto by remember {
        mutableIntStateOf(0)
    }
    var febreroNeto by remember {
        mutableIntStateOf(0)
    }
    var marzoNeto by remember {
        mutableIntStateOf(0)
    }
    var abrilNeto by remember {
        mutableIntStateOf(0)
    }
    var mayoNeto by remember {
        mutableIntStateOf(0)
    }
    var junioNeto by remember {
        mutableIntStateOf(0)
    }
    var julioNeto by remember {
        mutableIntStateOf(0)
    }
    var agostoNeto by remember {
        mutableIntStateOf(0)
    }
    var septiembreNeto by remember {
        mutableIntStateOf(0)
    }
    var octubreNeto by remember {
        mutableIntStateOf(0)
    }
    var noviembreNeto by remember {
        mutableIntStateOf(0)
    }
    var diciembreNeto by remember {
        mutableIntStateOf(0)
    }

    var bandera by remember {
        mutableIntStateOf(R.drawable.banderaale)
    }

    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Image(painter = painterResource(id = bandera),
                contentDescription = "bandera",
                modifier = Modifier.size(70.dp)
            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Contabilidad de Alfonso Estudiante",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        // Columnas
        Column {
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text("Blanco",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                )
                Text("Ingresos",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text("Egresos",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text("Neto",
                    color = Color.White,
                    modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
            }
        }
        FilaVista("Enero", eneroIngresos, eneroEgresos, eneroNeto)
        FilaVista("Febrero", febreroIngresos, febreroEgresos, febreroNeto)
        FilaVista("Marzo", marzoIngresos, marzoEgresos, marzoNeto)
        FilaVista("Abril", abrilIngresos, abrilEgresos, abrilNeto)
        FilaVista("Mayo", mayoIngresos, mayoEgresos, mayoNeto)
        FilaVista("Junio", junioIngresos, junioEgresos, junioNeto)
        FilaVista("Julio", julioIngresos, julioEgresos, julioNeto)
        FilaVista("Agosto", agostoIngresos, agostoEgresos, agostoNeto)
        FilaVista("Septiembre", septiembreIngresos, septiembreEgresos, septiembreNeto)
        FilaVista("Octubre", octubreIngresos, octubreEgresos, octubreNeto)
        FilaVista("Noviembre", noviembreIngresos, noviembreEgresos, noviembreNeto)
        FilaVista("Diciembre", diciembreIngresos, diciembreEgresos, diciembreNeto)

        Button(onClick = {

            eneroNeto = eneroIngresos - eneroEgresos
            febreroNeto = febreroIngresos- febreroEgresos
            marzoNeto = marzoIngresos - marzoEgresos
            abrilNeto = abrilIngresos - abrilEgresos
            mayoNeto = mayoIngresos - mayoEgresos
            junioNeto = junioIngresos - junioEgresos
            julioNeto = julioIngresos - julioEgresos
            agostoNeto = agostoIngresos - agostoEgresos
            septiembreNeto = septiembreIngresos - septiembreEgresos
            octubreNeto = octubreIngresos - octubreEgresos
            noviembreNeto = noviembreIngresos - noviembreEgresos
            diciembreNeto = diciembreIngresos - diciembreEgresos

            bandera = R.drawable.banderamex

        }, modifier = Modifier.fillMaxWidth()) {
            Text("Calcular resultados")
        }

    }
}
