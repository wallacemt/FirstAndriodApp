class Pessoa_(val ano_nas:Int, var nome:String) {
    var idade = 2024 - ano_nas

    fun saldacao(){
        println("Seja bem vindo ${this.nome}")
    }

    fun acorda(x: Boolean = true){
        if(x == true){
            println("${this.nome} Está Acordado!")
        }else{
            println("${this.nome} Está dormindo")
        }

    }
}

fun main() {
    println("Digite o ano que você nasceu: ")
    var x = readlnOrNull()?.toInt() ?:0

    println("Digite seu nome Completo: ")
    var y = readln()

    println("Você está acordado? ")
    var d = readln()


    var pessoa: Pessoa_ = Pessoa_(x, y)

    println(pessoa.ano_nas)
    println(pessoa.nome)
    println("Você tem ${pessoa.idade} anos")

    if(d.toUpperCase() == "SIM"){
        pessoa.acorda(true)
    }else if(d.toUpperCase() == "NAO"){
        pessoa.acorda(false)
    }

}
