package com.example.laboratorio_01

import org.junit.Test

data class Computadora (
    var sistemaOperativo : String,
    var procesador : String,
    var RAM : Int,
    var almacenamiento : Int,
    var tarjetaGrafica : String,
    var resolucion : String,
    var estadoDeLaComputadora : Boolean = false
) {
    fun encender() {
        estadoDeLaComputadora = true
        println("Computadora encendida.")
    }

    fun apagar() {
        estadoDeLaComputadora = false
        println("Computadora apagada.")
    }
}

class Ejercicio_1 {
    @Test
    fun main() {

        val miComputadora = Computadora("Windows 11", "Intel Ultra 7", 32, 1024, "Nvidia RTX 5070", "2560x1440")
        miComputadora.encender()

        val programasInstalados = listOf(
            "Microsoft Office 2021",
            "Adobe Photoshop 2026",
            "Google Chrome 2025",
            "Visual Studio Code 2026",
            "Spotify 2024",
            "Zoom 2025",
            "Slack 2026",
            "Discord 2024",
            "Notion 2026",
            "Facebook 2024"
        )

        val añoActual = "2026"
        val programasEsteAño = programasInstalados.filter { it.contains(añoActual) }

        println("\n--- Información de la Computadora ---")
        println(miComputadora)
        
        println("\n--- Programas Instalados en $añoActual ---")
        programasEsteAño.forEach { println("- $it") }

        miComputadora.apagar()
    }
}
