/*
fun siglo(list: MutableList<Int>):Pair<Int,Double>{
    var siglo_pasado=0
    var suma=0.0
    for (edad in list){
        if (edad>=22){
            siglo_pasado++
        }
        suma+=edad
    }
    var promedio=suma/list.size
    return siglo_pasado to promedio
}

fun main(){
    var lista.MutableList<Int> = mutableListOf()
    print("Ingrese la edad: ")
    var edad= readLine()!!.toInt()
    while (edad>0){
        print("Ingrese la edad")
        var edad= readLine()!!.toInt()
        lista.add(edad)
        print(lista)
    }
    var (siglo_pasado,promedio)= siglo(lista)
    println("Hay $siglo_pasado estudiante del siglo pasado")
    println("El promedio de edad de la Universidad es $promedio ")
}*/