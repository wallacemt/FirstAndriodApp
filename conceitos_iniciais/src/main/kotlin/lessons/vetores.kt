package main.kotlin.lessons

fun vetorDeInteiros() {
    var numeros = intArrayOf(1, 2, 3, 4, 5, 6)
    for(i in 0..(numeros.size -1)){
        print(" ${numeros[i]} ")
    }
    println("\n")
}

fun vetorDeInteiros_2() {
    var n = Array(10, {i->i})

    for(i in n){
        print(" ${n[i]} ")
    }
    println("\n")
}


fun main() {
    vetorDeInteiros()
    vetorDeInteiros_2()
}