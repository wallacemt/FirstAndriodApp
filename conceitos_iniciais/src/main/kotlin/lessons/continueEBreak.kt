package main.kotlin.lessons

fun main() {
    var i = 0
    while(i < 1000){
        print(" ${i} ")
        i++
        if(i == 20){
            println("Saindo...")
            break
        }
    }
    println("\n")

    var str = "Teste de perfil"

    var j = 0

    while( j < str.length){
        if(str[j] == 'p'){
            break
        }
        print(" ${str[j]} ")
        j++
    }
    println("\n")

    for(i in 0..20){
        if(i%2==1){
            continue
        }
        print(" ${i} ")
    }

    var str2 = "Teste de perfil"

    for(i in 0..(str2.length -1)){
        if(str2[i] == 'i' || str2[i] == 'e'){
            continue
        }
        print(" ${str[i]} ")
    }

}