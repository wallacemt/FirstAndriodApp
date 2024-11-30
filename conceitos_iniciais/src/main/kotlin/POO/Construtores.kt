class  Silvestre(var nome:String){

    var atk: Int = 0
    constructor(nome:String, atk:Int): this(nome){
        this.atk = atk
    }

    fun ap(){
        println("Meu animal silvestre é ${this.nome} é seu ataque é ${this.atk}")
    }

}

fun main() {
    val s1 = Silvestre("Àguia")
    val s2 = Silvestre("Serpente", 1000)
    s1.ap()
    s2.ap()

}