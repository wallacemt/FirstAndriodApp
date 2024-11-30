
open class eletronicos(var marca:String){
    private fun corrente(ativo:Boolean){
    }
    open fun ligar(){
        corrente(true)
    }
    open fun desligar(){
        corrente(false)
    }

}

class PC(marca:String):eletronicos(marca){
    fun salvar(){}

    override fun desligar() {
        salvar()
        super.desligar()
    }

    override fun ligar() {
        super.ligar()
    }

}

class SmartTv(marca: String):eletronicos(marca){
    override fun desligar() {
        super.desligar()
    }

    override fun ligar() {
        super.ligar()
    }
}


fun main() {
    var pc:PC = PC("Asus")
}