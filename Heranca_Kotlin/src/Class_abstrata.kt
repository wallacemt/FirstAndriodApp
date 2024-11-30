
interface Selvagem{
    fun atacar(){
        println("O animal está prestes a atacar!")
    }
}

interface quatro_patas{
    fun andar(){
        println("O animal Anda em quatro patas")
    }
}

abstract class Mamifero(var nome:String){//Classe abstrata serve somente para herdar a outras classes

    abstract fun habitat()
    abstract fun  acordado()
    abstract fun fala()
    abstract  fun alimentacao()
    fun tempo(){
        println("tempo de vida do mamifero")
    }
}

class dog(nome: String):Mamifero(nome), Selvagem, quatro_patas{
    override fun habitat() {
        println("Casa do cachorro")
    }

    override fun alimentacao() {
        println("Ração")
    }

    override fun acordado() {
        println("Cachorro está acordado")
    }

    override fun fala() {
        println("Auau")
    }

    override fun atacar() {
        println("O cachorro esta atacando")
    }

    override fun andar() {
        println("O Cachorro anda em quatro patas")
    }

}


fun main() {
    var c:dog = dog("Cachorro")
    c.fala()
    c.alimentacao()
    c.habitat()
    c.acordado()
    c.tempo()
    c.atacar()
    c.andar()
}