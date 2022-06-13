
fun existe_ciudad(lista_ciudades: MutableList<Int>, buscar_ciudad: String): Boolean {
    for (ciu in lista_ciudades) {
        if (ciu.equals(buscar_ciudad)){
            return true
        }
    }
    return false
}

fun main(){

    var listaciudades: MutableList<Int> = mutableListOf()
    println("Ingrese las ciudades del pais que desea agregar")
    var ciudades = readLine()!!.toString()

    while(!ciudades.isEmpty()){
        listaciudades.add(ciudades.toInt())
        println("Ingrese una ciudad")
        ciudades= readLine()!!.toString()
    }

    println("Ingrese la ciudad a buscar dentro de la lista: ")
    println(" ${encontrar_ciudad(listaciudades)}")

}

fun encontrar_ciudad(lista_ciudades: MutableList<Int>):String{
    var buscar_ciudad = readln()
    if (existe_ciudad(lista_ciudades, buscar_ciudad)) {
        println("Esta ciudad ya existe")
    } else {
        println("Esta ciudad no existe")
    }
    return buscar_ciudad
}
