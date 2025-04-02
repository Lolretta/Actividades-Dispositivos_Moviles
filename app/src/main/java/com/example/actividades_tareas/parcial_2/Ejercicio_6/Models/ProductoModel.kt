package com.example.actividades_tareas.parcial_2.Ejercicio_6.Models

import androidx.annotation.DrawableRes

data class VideojuegoModel(

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)

data class AudioModel(

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)

data class InstrumentosModel(

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)

data class TelefoniaModel(

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)

data class ComputacionModel(

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)
