package main.kotlin.lessons

fun main(){
    // Classifique as pessoas através da faixa etária
    // Idoso - 60 anos acima | Adulto entre 21 e 59 anos | Jovem entre 13 a 20 anos | Criança 12 anos ou abaixo
    var idade:Int = 15

    if(idade >= 60){
        println("Pessoa Idosa")
    }else if(idade <= 59 && idade >= 21){
        println("Pessoa Adulta")
    }else if(idade <= 20 && idade>= 13){
        println("Pessoa Jovem")
    }else{
        println("Essa pessoa é uma criança")
    }
}