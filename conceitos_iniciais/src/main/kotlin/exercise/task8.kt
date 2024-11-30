fun fibonacci() {
    var a = 0
    var b = 1
    println("Sequência de Fibonacci:")
    for (i in 1..8) {
        print("- ${b} - ")
        val temp = a
        a = b
        b += temp
    }
}

fun main(){
    /*
    Crie uma função que imprima os 8 primeiros números da
    sequência de Fibonacci (inicie pelo número 1). Contemple a lógica dessa
    sequência no algoritmo.
    */
    fibonacci()
}