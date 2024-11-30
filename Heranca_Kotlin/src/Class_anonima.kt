interface Evento{
    fun ok(){

    }
}

class Programa{
    fun salvar(e:Evento){
        println("Abrindo Arquivos")
        println("Salvando Valores")
        println("Salvando Arquivos")
        println("Conexões Realizadas")
        e.ok()
    }
}

/*
class Event():Evento{
    override fun ok() {
        println("O Programa está OK")
    }
}
*/

fun main(){
    val p:Programa = Programa()
    //val e:Event = Event()
    p.salvar(object : Evento{
        override fun ok() {
            println("O programa está OK")
        }
    })
}