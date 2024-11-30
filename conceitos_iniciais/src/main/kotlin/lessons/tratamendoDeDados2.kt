import kotlin.math.sqrt

fun main(){

    try {
        var s:String? = null
        s = "Wallace"
        println("O Tamanho da string é ${s!!.length}")

        var a =  10/2
        println("O resultado da divisão é: ${a}")

        var b = 9.0
        var c = sqrt(b)
        if(b < 0){
            throw IllegalArgumentException()
        }

        var x = 11
        if(x == 1){
            throw Exception("X nao pode ser 1")
        }


    }catch (e:NullPointerException){
        println("A variável está vazia")
    }catch (e: ArithmeticException){
        println("Não existe divisão por zero")
    }catch(e:IllegalArgumentException){
        println("Não existe raiz de numero negativo!")
    }catch (e: Exception){
        println("Exceção mais geral")
        println(e.message)
    }finally {
        println("Executando o tratamento de dados!")
    }
}