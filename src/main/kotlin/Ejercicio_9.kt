
fun main(){
    var numero:Int
    println("Cuantos puntos desea ingresar")
    numero= readLine()!!.toInt()

    var x:Double
    var y:Double

    repeat(numero){
        println("Ingresar coordenada del punto x")
        x= readln()!!.toDouble()
        println("Ingresar coordenada del punto y")
        y= readln()!!.toDouble()
    }
}