fun pesquisarElemento(vetor: DoubleArray, elemento: Double) {
    for (i in vetor) {
        if (i == elemento) {
            println("Elemento $elemento achado")
            return
        }
    }
    println("Elemento $elemento não achado")
}

fun main() {
    /*
     Crie um programa que lê um vetor de Double de 10 elementos
    e pesquisa um número dentro desse vetor. Retorne “Elemento x achado”
    caso pertença ao vetor ou “Elemento x não achado” caso não pertença ao
    vetor
     */

    val vetor = DoubleArray(10)

    for (i in vetor.indices) {
        println("Digite o elemento ${i + 1}:")
        vetor[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }
    println("Digite o número a ser pesquisado no vetor:")
    val elementoPesquisado = readLine()?.toDoubleOrNull() ?: 0.0
    pesquisarElemento(vetor, elementoPesquisado)
}
