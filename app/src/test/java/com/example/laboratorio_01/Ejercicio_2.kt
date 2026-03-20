package com.example.laboratorio_01

import org.junit.Test

class Calculadora(val marca: String,
                  val añosDeVida: Int,
                  var precio: Double
) {
    fun sumar(a: Double, b: Double): Double {
        val res = a + b
        println("$a + $b = $res")
        return res
    }

    fun restar(a: Double, b: Double): Double {
        val res = a - b
        println("$a - $b = $res")
        return res
    }

    fun multiplicar(a: Double, b: Double): Double {
        val res = a * b
        println("$a * $b = $res")
        return res
    }

    fun dividir(a: Double, b: Double): Double {
        return if (b != 0.0) {
            val res = a / b
            println("$a / $b = $res")
            res
        } else {
            println("No puedes dividir por cero")
            0.0
        }
    }
}

class Ejercicio_2 {
    @Test
    fun main() {
        val miCalculadora = Calculadora("Casio", 8, 25.0)

        println("Calculadora: ${miCalculadora.marca} - Años de vida: ${miCalculadora.añosDeVida} - Precio: $${miCalculadora.precio}")

        miCalculadora.sumar(10.0, 5.0)
        miCalculadora.restar(20.0, 9.5)
        miCalculadora.multiplicar(4.0, 3.0)
        miCalculadora.dividir(10.0, 2.0)
    }
}