package main.kotlin.lessons

fun main() {
    var carge:String = "Presidente"

    when(carge){
        "Presidente" -> println(6000f)
        "Gerente" -> println(4500f)
        "Coordernador" -> println(3000f)
        "Analista" -> println(2500f)
        "Estagiario" -> println(1600f)
        else -> println("Cargo não encontrado!")
    }

    var imc:Float = 30f

    when(imc){
        10f -> println("IMC está 10 ou v")
        20f -> println("IMC está 20 ou mair que 11")
        30f -> println("IMC está 30 ou maior que 21")
        50f -> println("IMC está 50 ou maior que 11")
        else -> println("IMC Está acima do normal")
    }
}