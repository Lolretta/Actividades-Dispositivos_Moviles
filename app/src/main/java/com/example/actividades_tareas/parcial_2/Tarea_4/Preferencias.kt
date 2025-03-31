package com.example.actividades_tareas.parcial_2.Tarea_4

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class Preferencias(private val context: Context) {
    companion object { //para que sea singleton el acceso al archivo
        val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")
        val NAME = stringPreferencesKey("nombre")
        val AGE = intPreferencesKey("edad")
        val HEIGHT = floatPreferencesKey("altura")
        val MONEY = floatPreferencesKey("dinero")
    }

    //Flow parte de las corrutinas para transmiti(recibir) el flujo de datos tipo String de forma asincrona
    val name: Flow<String> = context.dataStore.data.map  {preferences ->
        preferences[NAME] ?: "" } //me pidio cambiarlo a Any

    //Flow parte de las corrutinas para transmiti(recibir) el flujo de datos tipo Entero de forma asincrona
    val age: Flow<Int> = context.dataStore.data.map { preferences -> // No type safety.
        preferences[AGE] ?: 0 }

    val height: Flow<Float> = context.dataStore.data.map { preferences ->
        preferences[HEIGHT]?.toFloat() ?: 0f }

    val money: Flow<Float> = context.dataStore.data.map { preferences ->
        preferences[MONEY]?.toFloat() ?: 0f }

    suspend fun savePersonData(personName: String, personAge: Int, personHeight: Float, personMoney: Float){
        context.dataStore.edit { settings ->
            settings[AGE]= personAge
            settings[NAME]= personName
            settings[HEIGHT]= personHeight
            settings[MONEY]= personMoney
        }
    }

    suspend fun compraComida(personMoney: Float) {
        context.dataStore.edit { settings ->
            settings[MONEY]= personMoney
        }
    }

    suspend fun clearData(){
        context.dataStore.edit { preferences ->
            preferences.remove(AGE)
            preferences.remove(NAME)
            preferences.remove(HEIGHT)
            preferences.remove(MONEY)
        }
    }

}