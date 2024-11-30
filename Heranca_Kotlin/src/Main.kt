//Private, Public, Protected

//Estará somente disponivel no arquivo
private  class F(){
    var teste = "Class F"
}


open class Eletronico(marca:String){
    private fun ativarCorrente(){

    }

    protected fun relogio(){ //Disponivel a classe que estão herdada
        println("Função relogio")
    }

    fun ligar(){
        println("Está Ligado")
    }
    fun desligar(){
        println("Está Desligado")
    }
}


class Computador(marca:String):Eletronico(marca){
   fun InstalarSoftware(){
       println("Instalando software no PC")
       relogio()
   }

    fun Varredura(){
        println("Executando varedura no PC")
    }
}


fun main() {
    var c:Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.InstalarSoftware()
    c.Varredura()
}