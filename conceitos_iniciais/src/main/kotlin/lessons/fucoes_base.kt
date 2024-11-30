package main.kotlin.lessons
fun impressao(){ //Função Void
    println("Função sem parâmetro e sem retorno")
}

fun soma(a:Int, b:Int):Int{
    return a + b
}

fun soma_2(a:Int, b:Int) {
    println(" A soma das variáveis são ${a+b}")
}

fun main(){
    impressao()
    print(soma(5, 5))
    soma_2(11,23)
}
