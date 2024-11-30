/*
interface dev{//Interface
    var salario:Float
    fun bonus():Float
}

class mobile(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.7f
    }
}

class games(override  var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.6f
    }
}

class back(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.5f
    }
}

*/

/*
//Sem polimorfismo
fun mostrar_bonus(m:mobile){
    println(m.bonus())
}

fun mostrar_bonus(g:games){
    println(g.bonus())
}
fun mostrar_bonus(b:back){
    println(b.bonus())
}


//Com Polimorfismo
fun mostrar_bonus(d:dev){
    println(d.bonus())
}
*/
fun main() {
    mostrar_bonus(back(1000f))
    mostrar_bonus(games(1000f))
    mostrar_bonus(mobile(1000f))
}


abstract class dev(var salario:Float){//Abstract
    abstract fun bonus():Float
}

class mobile(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.7f
    }
}

class games(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.6f
    }
}

class back(salario:Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.5f
    }
}

fun mostrar_bonus(d:dev){
    println(d.bonus())
}