fun main(){
    /*
    * Crie um programa em Kotlin que verifique se um número é primo (Estruturas de repetição)
    */

    print("Digite um número: ")
    var numero = readLine()!!.toInt()

    var primo = true
    for(i in 2..(numero/2)){
        if(numero % i == 0){
            primo = false
            break
        }
    }

    if(primo){
        println("$numero é um número primo")
    }else{
        println("$numero não é um número primo")
    }

}