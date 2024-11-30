fun verificarPrimo(numero: Int) {
    if (ehPrimo(numero)) {
        println("$numero é primo")
    } else {
        println("$numero não é primo")
    }
}
fun ehPrimo(numero: Int): Boolean {
    if (numero <= 1) return false
    for (i in 2 until numero) {
        if (numero % i == 0) return false
    }
    return true
}

fun main(){
    /*
    *Crie uma função que leia uma variável do tipo inteira, verifique
    se essa variável contém um número primo ou não.
    */
    verificarPrimo(10)

}