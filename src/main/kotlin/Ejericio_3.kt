
fun verbos(list:MutableList<String>):Int{
    var cont=0
    for (palabra in list){
        if(palabra.endsWith("ar")||palabra.endsWith("er")||palabra.endsWith("ir")){
            cont++
        }
    }
    return cont
}

fun main(){
    var num: Int
    print("Cuentas personas desea ingresar")
    num= readLine()!!.toInt()
    var lista: MutableList<String> = mutableListOf()
    repeat(num){
        print("Ingrese una palabra")
        var palabra= readLine()!!
        lista.add(palabra)
    }
    print("de las $num ")
}

