
fun prom_curso(listaNotas: MutableList<Int>):Double{
    var sum=0
    for (notas in listaNotas){
        sum += notas
    }
    return  (sum/listaNotas.size).toDouble()
}

fun est_perdieron(listaNotas: MutableList<Int>): Int {
    var cont=0
    var perdieron=0
    for (notas in listaNotas){
        if(notas<3.0){
            perdieron+=1
        }
        cont+= notas
    }
    return perdieron
}

fun est_ganaron(listaNotas: MutableList<Int>): Int {
    var cont=0
    var ganaron=0
    for (notas in listaNotas){
        if(notas>3.0){
        ganaron+=1
        }
        cont+= notas
    }
    return ganaron
}

fun main(){

    println("Registre cuantos estudiantes pertenecen al curso")
    var nest= readln().toInt()
    var listaNotas: MutableList<Int> = mutableListOf()

    repeat(nest){
    println("Ingrese las notas de los estudiantes hasta 5.0")
    var notas = readLine()!!.toDouble()
    listaNotas.add(notas.toInt())
    }

    var prom= prom_curso(listaNotas)
    println("El promedio de las notas del curso es: $prom")
    println("Perdieron el curso ${est_perdieron(listaNotas)}")
    println("Ganaeron el curso ${est_ganaron(listaNotas)}")
}











