fun main(){
    /*
    Crie uma matriz 4x4 do tipo Float, imprima as seguintes informações:
    o Quantidade de colunas, através de comandos da matriz;
    o Quantidade de linhas, através de comandos da matriz;
    o Os elementos que compõe a matriz.
    */
    val matriz = Array(4) { IntArray(4) }
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            matriz[i][j] = (i + j).toInt()
        }
    }

    println("Quantidade de colunas: ${matriz[0].size}")
    println("Quantidade de linhas: ${matriz.size}")
    println("Elementos da matriz:")
    for (linha in matriz) {
        for (elemento in linha) {
            print("$elemento ")
        }
        println()
    }

}