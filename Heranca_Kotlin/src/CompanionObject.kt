class Matematica(){
    companion object M {//Escopo Class
        val PI = 3.1415
        fun add(){
        }
    }
    object obj01{
        val euler = 3.1415
        fun add(){
        }
    }
    object  obj2{
        val gold = 3.1415
        fun add(){
        }
    }

}

fun main() {
    println(Matematica.PI)
    var m:Matematica = Matematica()

    println("Acessando objeto 01 ${Matematica.obj01.euler}")
    println("Acessando objeto 01 ${Matematica.obj2.gold}")


}
