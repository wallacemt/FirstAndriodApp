package main.kotlin.lessons

fun main() {
    for(i in 1..20){//Estrutura de Repetição FOR Crescente de 1 em 1
        print("${i}-")
    }
    println("\n")

    for(i in 20 downTo 1){ //Estrutura de Repetição FOR Decrescente de 1 em 1
        print("${i}-")
    }
    println("\n")
    val str = "Criação de aplicativos Android"

    for(i in str) {
        print("${i} ")
    }
    println("\n")

    for(i in 1..20 step 2){//Estrutura de Repetição FOR Crescente de 2 em 2
        print("${i}-")
    }


}
