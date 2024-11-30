class Pessoa(val ano_nas:Int, var nome:String) {
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
    var pessoa: Pessoa = Pessoa(1993, "Max")

    println(pessoa.ano_nas)
    println(pessoa.nome)
    println("Você tem ${pessoa.idade} anos")
    pessoa.saldacao()
    pessoa.acorda()
    pessoa.acorda(false)
}
