class Robo(){
    lateinit var nome:String
    fun ligar(){
        nome = ""
    }
    fun inicio_tardio(){
        if(this::nome.isInitialized){
            nome = "Inicializando tardeamente..."
            println(nome)
        }
    }

}

fun main() {
    var bot:Robo = Robo()
    //println(bot.ligar())
    bot.inicio_tardio()

}