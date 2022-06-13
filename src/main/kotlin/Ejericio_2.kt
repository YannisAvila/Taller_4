
fun prom_alturas(listaAlturas: MutableList<Int>):Double{
    var sum=0
    for (alt in listaAlturas){
        sum += alt
    }
    return  (sum/listaAlturas.size).toDouble()
}

fun alt_por_debajo(listaAlturas: MutableList<Int>): Int {
    var cont=0
    var limite_alturas=cont
    for(alt in listaAlturas){
        if(alt<limite_alturas){
        }
        cont+=1
    }
    return cont
}

fun main(){

    var listaAlturas: MutableList<Int> = mutableListOf()
    println("Ingrese la altura de una persona")
    var alt = readLine()!!.toDouble()

    while(alt>=0 && alt >=2){
    listaAlturas.add(alt.toInt())
    println("Ingrese la altura de una persona")
    alt= readLine()!!.toDouble()
    }

    var prom = prom_alturas(listaAlturas)
    println("El promedio de las alturas es $prom")
    println("Se tiene ${alt_por_debajo(listaAlturas)} ")
}


