fun main() {
    var ret:Retangulo = Retangulo(10, 20)
    var ret2: Retangulo = Retangulo(10, 20)
    //Equals, toString, hashCode
    println(ret.equals(ret2))
    //Variaveis -> endereço de memoria

    var ret3:RetanguloData = RetanguloData(10, 20)
    var ret4: RetanguloData = RetanguloData(10, 20)
    println(ret3.equals(ret4))
}

class Retangulo(var a:Int, var b:Int){
    override fun equals(other: Any?): Boolean {
        return if (other is Retangulo) {
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }
}

data class  RetanguloData(var a:Int, var b:Int){

}
data class Info(val rua:String, val num:Int, val bairro:String, val cep:Int, val cidade:String){}

fun endereco(e:Info){}