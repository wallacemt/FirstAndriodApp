fun main() {
    /*
    *  Crie um programa que armazene um vetor de 10 nomes de
    * */
    val nomes = listOf("João", "Maria", "Pedro", "Ana", "Felipe", "Rafael", "Sofia", "Guilherme", "Leticia", "Luiza")

    for (i in nomes.indices) {
        println("Nome na posição ${i + 1}: ${nomes[i]}")
    }
}
