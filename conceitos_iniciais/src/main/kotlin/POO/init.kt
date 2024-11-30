class Animal(var especie:String){
    var fala:String = ""

    init{
        fala = if(especie.lowercase() == "cachorro"){
            "auau"
        }else if(especie.lowercase() == "gato"){
            "miaumiau"
        }else{
            ""
        }
    }
    init {
        println(fala)
    }
    fun falar(){
        println(fala)
    }

}


fun main() {
    val animal = Animal("cachorro")

    Animal("Gato").falar()
    Animal("Cachorro").fala

}