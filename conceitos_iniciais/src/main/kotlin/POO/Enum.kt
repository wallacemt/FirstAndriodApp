enum class Prioridade(){
    Media, Alta, Baixa
}

enum class Prioridade_2(val v:Int){
    B(0), M(7), A(10)
}

enum class  Animais(){
    gato, cachorro, tucano, papagaio, leopardo
}

enum class Prioridade_3(val v:Int){
    A(10){
        override fun toString(): String {
            return "Prioridade Alta com o valor ${v}"
        }
    },
    M(5){
        override fun toString(): String {
            return "Prioridade Media com o valor ${v}"
        }
    },
    B(0){
        override fun toString(): String {
            return "Prioridade Baixa com o valor ${v}"
        }
    }
}


fun x(p:Prioridade){

}


fun main() {
    x(Prioridade.Alta)//Forma de acessar um valor de uma class do tipo Enum
    for(p in Prioridade.entries){
        println("${p} - ")
    }
    println()
    for(p in Animais.values()){
        println("${p} - ")
    }
    println()
    for(p in Prioridade_2.entries){
        println("${p} - ")
    }
    println()
    for(p in Prioridade_3.entries){
        println("${p}")
    }
}