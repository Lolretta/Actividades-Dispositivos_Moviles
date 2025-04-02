package com.example.actividades_tareas.parcial_2.Ejercicio_6.Models

import androidx.annotation.DrawableRes

data class VideojuegoModel(

    val id_cat: Int,

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)

data class AudioModel(

    val id_cat: Int,

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)

data class InstrumentosModel(

    val id_cat: Int,

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)

data class TelefoniaModel(

    val id_cat: Int,

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)

data class ComputacionModel(

    val id_cat: Int,

    @DrawableRes val image: Int,
    val precio: Float,
    val nombre: String,
    val envio: Boolean,
    val descuento: Float?

)
