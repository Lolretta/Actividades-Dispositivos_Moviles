package com.example.actividades_tareas.parcial_2.Ejercicio_6.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.AudioModel
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.ComputacionModel
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.InstrumentosModel
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.TelefoniaModel
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.VideojuegoModel

@Composable
fun TelefonoView(telefonia: TelefoniaModel) {

    Row (modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp)) {
        Image(
            painter = painterResource(id = telefonia.image),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp),
            contentScale = ContentScale.Crop
        )
        Column (modifier = Modifier.weight(1f)) {
            Text(text = telefonia.nombre, fontWeight = FontWeight.Bold,fontSize = 20.sp, modifier = Modifier.padding(bottom = 10.dp))

            if (telefonia.descuento == null) {
                Text(
                    text = " $ ${telefonia.precio} USD",
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            } else {
                Text(text = "Descuento del ${(telefonia.descuento)*100} %", modifier = Modifier.padding(bottom = 5.dp), fontWeight = FontWeight.Bold)
                Row (modifier = Modifier.padding(bottom = 5.dp)) {
                    Text(
                        text = "$ ${telefonia.precio} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        style = TextStyle(
                            textDecoration = TextDecoration.LineThrough
                        ),
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(
                        text = "$ ${(telefonia.precio * (1 - telefonia.descuento))} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            if (telefonia.envio == true) {
                Text(
                    text = "Envió gratuito en 2 días",
                    fontSize = 14.sp,
                    color = Color(0xFF17911F)
                )
            } else {
                Text(
                    text = "Envío no gratuito",
                    fontSize = 14.sp,
                    color = Color(0xFF911717)
                )
            }
        }
    }

}

@Composable
fun ComputacionView(computacion: ComputacionModel) {

    Row (modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp)) {
        Image(
            painter = painterResource(id = computacion.image),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp),
            contentScale = ContentScale.Crop
        )
        Column (modifier = Modifier.weight(1f)) {
            Text(text = computacion.nombre, fontWeight = FontWeight.Bold,fontSize = 20.sp, modifier = Modifier.padding(bottom = 10.dp))

            if (computacion.descuento == null) {
                Text(
                    text = " $ ${computacion.precio} USD",
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            } else {
                Text(text = "Descuento del ${(computacion.descuento)*100} %", modifier = Modifier.padding(bottom = 5.dp), fontWeight = FontWeight.Bold)
                Row (modifier = Modifier.padding(bottom = 5.dp)) {
                    Text(
                        text = "$ ${computacion.precio} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        style = TextStyle(
                            textDecoration = TextDecoration.LineThrough
                        ),
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(
                        text = "$ ${(computacion.precio * (1 - computacion.descuento))} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            if (computacion.envio == true) {
                Text(
                    text = "Envió gratuito en 2 días",
                    fontSize = 14.sp,
                    color = Color(0xFF17911F)
                )
            } else {
                Text(
                    text = "Envío no gratuito",
                    fontSize = 14.sp,
                    color = Color(0xFF911717)
                )
            }
        }
    }

}

@Composable
fun AudioView(audio: AudioModel) {

    Row (modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp)) {
        Image(
            painter = painterResource(id = audio.image),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp),
            contentScale = ContentScale.Crop
        )
        Column (modifier = Modifier.weight(1f)) {
            Text(text = audio.nombre, fontWeight = FontWeight.Bold,fontSize = 20.sp, modifier = Modifier.padding(bottom = 10.dp))

            if (audio.descuento == null) {
                Text(
                    text = " $ ${audio.precio} USD",
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            } else {
                Text(text = "Descuento del ${(audio.descuento)*100} %", modifier = Modifier.padding(bottom = 5.dp), fontWeight = FontWeight.Bold)
                Row (modifier = Modifier.padding(bottom = 5.dp)) {
                    Text(
                        text = "$ ${audio.precio} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        style = TextStyle(
                            textDecoration = TextDecoration.LineThrough
                        ),
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(
                        text = "$ ${(audio.precio * (1 - audio.descuento))} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            if (audio.envio == true) {
                Text(
                    text = "Envió gratuito en 2 días",
                    fontSize = 14.sp,
                    color = Color(0xFF17911F)
                )
            } else {
                Text(
                    text = "Envío no gratuito",
                    fontSize = 14.sp,
                    color = Color(0xFF911717)
                )
            }
        }
    }

}

@Composable
fun InstrumentoView(instrumento: InstrumentosModel) {

    Row (modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp)) {
        Image(
            painter = painterResource(id = instrumento.image),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp),
            contentScale = ContentScale.Crop
        )
        Column (modifier = Modifier.weight(1f)) {
            Text(text = instrumento.nombre, fontWeight = FontWeight.Bold,fontSize = 20.sp, modifier = Modifier.padding(bottom = 10.dp))

            if (instrumento.descuento == null) {
                Text(
                    text = " $ ${instrumento.precio} USD",
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            } else {
                Text(text = "Descuento del ${(instrumento.descuento)*100} %", modifier = Modifier.padding(bottom = 5.dp), fontWeight = FontWeight.Bold)
                Row (modifier = Modifier.padding(bottom = 5.dp)) {
                    Text(
                        text = "$ ${instrumento.precio} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        style = TextStyle(
                            textDecoration = TextDecoration.LineThrough
                        ),
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(
                        text = "$ ${(instrumento.precio * (1 - instrumento.descuento))} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            if (instrumento.envio == true) {
                Text(
                    text = "Envió gratuito en 2 días",
                    fontSize = 14.sp,
                    color = Color(0xFF17911F)
                )
            } else {
                Text(
                    text = "Envío no gratuito",
                    fontSize = 14.sp,
                    color = Color(0xFF911717)
                )
            }
        }
    }

}

@Composable
fun VideojuegoView(videojuego: VideojuegoModel) {

    Row (modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp)) {
        Image(
            painter = painterResource(id = videojuego.image),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp),
            contentScale = ContentScale.Crop
        )
        Column (modifier = Modifier.weight(1f)) {
            Text(text = videojuego.nombre, fontWeight = FontWeight.Bold,fontSize = 20.sp, modifier = Modifier.padding(bottom = 10.dp))

            if (videojuego.descuento == null) {
                Text(
                    text = " $ ${videojuego.precio} USD",
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            } else {
                Text(text = "Descuento del ${(videojuego.descuento)*100} %", modifier = Modifier.padding(bottom = 5.dp), fontWeight = FontWeight.Bold)
                Row (modifier = Modifier.padding(bottom = 5.dp)) {
                    Text(
                        text = "$ ${videojuego.precio} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        style = TextStyle(
                            textDecoration = TextDecoration.LineThrough
                        ),
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(
                        text = "$ ${(videojuego.precio * (1 - videojuego.descuento))} USD",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            if (videojuego.envio == true) {
                Text(
                    text = "Envió gratuito en 2 días",
                    fontSize = 14.sp,
                    color = Color(0xFF17911F)
                )
            } else {
                Text(
                    text = "Envío no gratuito",
                    fontSize = 14.sp,
                    color = Color(0xFF911717)
                )
            }
        }
    }

}