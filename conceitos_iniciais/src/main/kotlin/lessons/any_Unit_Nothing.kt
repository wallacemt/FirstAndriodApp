fun main(){
    //Any, Unit, Nothing
    a(10.8565)
    b()
}

fun a(valor: Any){
    println("Imprimindo o valor: ${valor}")
}

fun b():Unit{
    println("Função sem retorno (void)")
}

fun c():Nothing{
    TODO("Função ainda a ser completada")
}