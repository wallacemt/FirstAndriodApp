import java.util.Scanner

fun ler_int(){
    val scanner = Scanner(System.`in`)
    println("Digite um número Inteiro: ")
    val num = scanner.nextInt()
    println("Você Digitou: ${num}")
}

fun ler_double(){
    val scanner = Scanner(System.`in`)
    println("Digite um número Double: ")
    val num = scanner.nextDouble()
    println("Você Digitou: ${num}")
}

fun ler_float(){
    val scanner = Scanner(System.`in`)
    println("Digite um número Float: ")
    val num = scanner.nextFloat()
    println("Você Digitou: ${num}")
}

fun ler_string(){
    val scanner = Scanner(System.`in`)
    println("Digite um nome: ")
    val num = scanner.next()
    println("Você Digitou: ${num}")
}

fun ler_boolean(){
    val scanner = Scanner(System.`in`)
    println("Digite um Boolean: ")
    val num = scanner.nextBoolean()
    println("Você Digitou: ${num}")
    scanner.close()
}

fun main(){
    ler_int()
    ler_double()
    ler_float()
    ler_string()
    ler_boolean()
}