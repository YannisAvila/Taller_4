import java.util.Collections

/*
6. Desarrolle la siguiente función y programa
a. Escriba un función que reciba una lista de pares (el primer
elemento es el nombre de un estudiante, y el segundo es el
año de nacimiento) y que retorne el nombre del estudiante más
viejo de toda la lista.
b. Escriba el programa que lea el nombre y año de nacimiento de
N estudiantes de la universidad, almacene cada par en una
lista, y luego de terminar la lectura, y usando la función
anterior, imprima el nombre del estudiante más viejo
 */

fun main() {

    print("Ingresar cuantos estudiantes desea?  ")
    val num_est = readln().toInt()
    val lista_est: MutableList<Pair<String, Int>> = mutableListOf()


    var fechNac: Int
    var nombre: String

    repeat(num_est) {
        println("Como es el nombre del estudiante :  ")
        nombre = readln()
        println("Cual es el año de nacimiento :  ")
        fechNac = readLine()!!.toInt()

        lista_est.add(Pair(nombre, fechNac))
    }

    println("El estudiante mas viejo de la clase es: ${est_viejo(lista_est)}")
}

fun est_viejo(lista_est: MutableList<Pair<String, Int>>): String {

    val listaEdades: MutableList<Int> = mutableListOf()

    for (estudiante in lista_est) {
        val edad = 2022 - estudiante.second
        listaEdades.add(edad)
    }

    val mayorEdad = Collections.max(listaEdades)

    for (estudiante in lista_est) {
        val edad = 2022 - estudiante.second
        if (edad == mayorEdad) return estudiante.first
    }

    return ""
}