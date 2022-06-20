import kotlin.time.Duration.Companion.seconds

fun area_triangulo(base:Double, altura: Double):Double{
    val area_total = (base * altura) / 2
    return area_total
}

fun area_mayor(lista_tripletas: List<Triple<String,Double,Double>>):String{
    var triang_mayor_area = lista_tripletas[0]
    var mayor_area = area_triangulo(lista_tripletas[0].second, lista_tripletas[0].third)
    var area:Double
    for(i in 1..lista_tripletas.size -1){
            area = area_triangulo(lista_tripletas[i].second, lista_tripletas[i].third)
            if (mayor_area < area){
                triang_mayor_area=lista_tripletas[i]
                mayor_area=area
            }
        }
    return triang_mayor_area.first
    }

fun buscar_nombre_triangulo(lista_tripletas:List<Triple<String,Double,Double>>,buscar_triangulo:String ):Double{
    for (triangulo in lista_tripletas){
        if(triangulo.first.equals(buscar_triangulo)){
            return area_triangulo(triangulo.second,triangulo.third)
        }
    }
    return -1.0
}
fun main(){

    var number:Int
    var lista_tripletas: MutableList<Triple<String,Double,Double>> = mutableListOf()
    println("Cuantos triangulos desea ingresar")
    number = readln()!!.toInt()

    var name:String
    var base:Double
    var altura:Double

    repeat(number){
        println("Registre el nombre del triangulo: ")
        name = readln()!!.toString()
        println("Registre la base del triangulo: ")
        base = readln()!!.toDouble()
        println("Registre la altura del triangulo: ")
        altura = readln()!!.toDouble()
        lista_tripletas.add(Triple(name,base,altura))
    }

    var triangulo_mayor_area = area_mayor(lista_tripletas)
        println("El triangulo con mayor área es: $triangulo_mayor_area")
        println("El área del triangulo $triangulo_mayor_area es ${buscar_nombre_triangulo(lista_tripletas,triangulo_mayor_area)}")
    }



