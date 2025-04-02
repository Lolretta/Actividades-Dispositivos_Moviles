package com.example.actividades_tareas.parcial_2.Ejercicio_6.ViewsModels

import androidx.lifecycle.ViewModel
import com.example.actividades_tareas.R
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.AudioModel
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.ComputacionModel
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.InstrumentosModel
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.TelefoniaModel
import com.example.actividades_tareas.parcial_2.Ejercicio_6.Models.VideojuegoModel

class ProductoViewModel(): ViewModel() {

    fun obtenerVideojuegos(): List<VideojuegoModel> {

        val prod_1 = VideojuegoModel(
            id_cat = 1,
            nombre = "PlayStation 5",
            envio = true,
            descuento = 0.05f,
            image = R.drawable.ps,
            precio = 799.0f
        )
        val prod_2 = VideojuegoModel(
            id_cat = 1,
            nombre = "PlayStation 5",
            envio = true,
            descuento = null,
            image = R.drawable.ps,
            precio = 799.0f
        )
        val prod_3 = VideojuegoModel(
            id_cat = 1,
            nombre = "PlayStation 5",
            envio = true,
            descuento = 0.50f,
            image = R.drawable.ps,
            precio = 799.0f
        )
        val prod_4 = VideojuegoModel(
            id_cat = 1,
            nombre = "PlayStation 5",
            envio = true,
            descuento = null,
            image = R.drawable.ps,
            precio = 799.0f
        )
        val prod_5 = VideojuegoModel(
            id_cat = 1,
            nombre = "PlayStation 5",
            envio = true,
            descuento = 15.0f,
            image = R.drawable.ps,
            precio = 799.0f
        )

        val VideojuegosList = listOf<VideojuegoModel>(
            prod_1, prod_2, prod_3, prod_4, prod_5
        )

        return VideojuegosList

    }

    fun obtenerAudio(): List<AudioModel> {

        val prod_1 = AudioModel(
            id_cat = 2,
            nombre = "Beats Studio",
            envio = true,
            descuento = 0.05f,
            image = R.drawable.audio,
            precio = 799.0f
        )
        val prod_2 = AudioModel(
            id_cat = 2,
            nombre = "Beats Studio",
            envio = true,
            descuento = null,
            image = R.drawable.audio,
            precio = 799.0f
        )
        val prod_3 = AudioModel(
            id_cat = 2,
            nombre = "Beats Studio",
            envio = true,
            descuento = 0.50f,
            image = R.drawable.audio,
            precio = 799.0f
        )
        val prod_4 = AudioModel(
            id_cat = 2,
            nombre = "Beats Studio",
            envio = true,
            descuento = null,
            image = R.drawable.audio,
            precio = 799.0f
        )
        val prod_5 = AudioModel(
            id_cat = 2,
            nombre = "Beats Studio",
            envio = true,
            descuento = 15.0f,
            image = R.drawable.audio,
            precio = 799.0f
        )

        val AudioList = listOf<AudioModel>(
            prod_1, prod_2, prod_3, prod_4, prod_5
        )

        return AudioList

    }

    fun obtenerComputacion(): List<ComputacionModel> {

        val prod_1 = ComputacionModel(
            id_cat = 3,
            nombre = "MacBook Air M1",
            envio = true,
            descuento = 0.05f,
            image = R.drawable.mac,
            precio = 799.0f
        )
        val prod_2 = ComputacionModel(
            id_cat = 3,
            nombre = "MacBook Air M1",
            envio = true,
            descuento = null,
            image = R.drawable.mac,
            precio = 799.0f
        )
        val prod_3 = ComputacionModel(
            id_cat = 3,
            nombre = "MacBook Air M1",
            envio = true,
            descuento = 0.50f,
            image = R.drawable.mac,
            precio = 799.0f
        )
        val prod_4 = ComputacionModel(
            id_cat = 3,
            nombre = "MacBook Air M1",
            envio = true,
            descuento = null,
            image = R.drawable.mac,
            precio = 799.0f
        )
        val prod_5 = ComputacionModel(
            id_cat = 3,
            nombre = "MacBook Air M1",
            envio = true,
            descuento = 15.0f,
            image = R.drawable.mac,
            precio = 799.0f
        )

        val ComputacionList = listOf<ComputacionModel>(
            prod_1, prod_2, prod_3, prod_4, prod_5
        )

        return ComputacionList

    }

    fun obtenerInstrumentos(): List<InstrumentosModel> {

        val prod_1 = InstrumentosModel(
            id_cat = 4,
            nombre = "Guitarra acústica",
            envio = true,
            descuento = 0.05f,
            image = R.drawable.guitar,
            precio = 799.0f
        )
        val prod_2 = InstrumentosModel(
            id_cat = 4,
            nombre = "Guitarra acústica",
            envio = true,
            descuento = null,
            image = R.drawable.guitar,
            precio = 799.0f
        )
        val prod_3 = InstrumentosModel(
            id_cat = 4,
            nombre = "Guitarra acústica",
            envio = true,
            descuento = 0.50f,
            image = R.drawable.guitar,
            precio = 799.0f
        )
        val prod_4 = InstrumentosModel(
            id_cat = 4,
            nombre = "Guitarra acústica",
            envio = true,
            descuento = null,
            image = R.drawable.guitar,
            precio = 799.0f
        )
        val prod_5 = InstrumentosModel(
            id_cat = 4,
            nombre = "Guitarra acústica",
            envio = true,
            descuento = 15.0f,
            image = R.drawable.guitar,
            precio = 799.0f
        )

        val InstrumentosList = listOf<InstrumentosModel>(
            prod_1, prod_2, prod_3, prod_4, prod_5
        )

        return InstrumentosList

    }

    fun obtenerTelefonia(): List<TelefoniaModel> {

        val prod_1 = TelefoniaModel(
            id_cat = 5,
            nombre = "Iphone 16 Pro Max",
            envio = true,
            descuento = 0.05f,
            image = R.drawable.iphone,
            precio = 799.0f
        )
        val prod_2 = TelefoniaModel(
            id_cat = 5,
            nombre = "Iphone 16 Pro Max",
            envio = true,
            descuento = null,
            image = R.drawable.iphone,
            precio = 799.0f
        )
        val prod_3 = TelefoniaModel(
            id_cat = 5,
            nombre = "Iphone 16 Pro Max",
            envio = true,
            descuento = 0.50f,
            image = R.drawable.iphone,
            precio = 799.0f
        )
        val prod_4 = TelefoniaModel(
            id_cat = 5,
            nombre = "Iphone 16 Pro Max",
            envio = true,
            descuento = null,
            image = R.drawable.iphone,
            precio = 799.0f
        )
        val prod_5 = TelefoniaModel(
            id_cat = 5,
            nombre = "Iphone 16 Pro Max",
            envio = true,
            descuento = 15.0f,
            image = R.drawable.iphone,
            precio = 799.0f
        )

        val TelefoniaList = listOf<TelefoniaModel>(
            prod_1, prod_2, prod_3, prod_4, prod_5
        )

        return TelefoniaList

    }

}