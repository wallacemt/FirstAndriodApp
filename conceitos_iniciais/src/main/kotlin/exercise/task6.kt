fun numerosNaturais() {
    println("Chamando função de números naturais.")
}

fun numerosInteiros() {
    println("Chamando função de números inteiros.")
    numerosNaturais()
}

fun numerosRacionais() {
    println("Chamando função de números racionais.")
    numerosInteiros()
}

fun numerosReais() {
    println("Chamando função de números reais.")
    numerosRacionais()
}

fun main(){
    /*
    Crie um programa que contenha funções chamando outras
    funções seguindo a ordem hierárquica de classificação dos números:
    o Números reais contêm os números racionais, os racionais
    contêm os números inteiros, os números inteiros contêm os
    números naturais. (Uma função chamando a outra nessa
    ordem).
    o Imprima mensagens de sequenciamento para identificar e lhe
    dar a certeza que uma função chamou a outra com sucesso.
     */
    numerosReais()
}