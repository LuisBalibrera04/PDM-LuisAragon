package com.example.laboratorio_01

import org.junit.Test

data class Estudiante(
    val nombre: String,
    val carnet: String,
    val materia: String
)

class Ejercicio_3 {
    @Test
    fun main() {
        val Ciclo01 = listOf(
            // Programación de Dispositivos Móviles
            Estudiante("Juan Martinez", "00012322", "Programación de Dispositivos Móviles"),
            Estudiante("María Cruz", "00045621", "Programación de Dispositivos Móviles"),
            Estudiante("Carlos Rodas", "00078923", "Programación de Dispositivos Móviles"),
            
            //Análisis Numérico
            Estudiante("Ana Gomez", "00112120", "Análisis numérico"),
            Estudiante("Luis Torres", "00222223", "Análisis numérico"),
            Estudiante("Elena Torres", "00333324", "Análisis numérico"),
            Estudiante("Roberto Guillen", "00444422", "Análisis numérico")
        )

        val materiaInteres = "Programación de Dispositivos Móviles"

        val estudiantesMoviles = Ciclo01.filter { it.materia == materiaInteres }

        println("--- Estudiantes en $materiaInteres ---")
        estudiantesMoviles.forEach { 
            println("Nombre: ${it.nombre} | Carnet: ${it.carnet}")
        }
    }
}
