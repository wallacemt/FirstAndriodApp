fun main(){
    var str:String? = null
    //str = "Wallace"

    if(str == null){
        println("A Variavel e nula")
    }else{
        println(str)
    }

    //Operador Elvis
    println(str ?: "Nula") // Operador Elvis - lembra o operador ternário

}