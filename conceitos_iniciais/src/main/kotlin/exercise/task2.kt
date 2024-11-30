fun calculaMedia(n1:Float, n2:Float, n3:Float, n4:Float) {
    var media:Float = (n1 + n2 + n3 + n4) / 4

    if(media >= 7) {
        return println("Media ${media} -> Aprovado")
    }else if(media >= 4 && media <= 7) {
        return println("Media ${media} -> Recuperação")
    }else{
        return println("Media ${media} -> Reprovado")
    }

}

fun main(){
    /* Crie um programa que retorne a situação de um aluno,
    baseado em uma função que calcula a média de 4 notas (parâmetros)
    e verifique se essa média está:
    - Se uma nota for digitada acima de 10 ou menor que 0, imprima
    uma mensagem de erro (“Nota inexistente”) ao usuário e pare
    a execução do programa.

    - Aprovado: Maior ou igual a 7,0.

    - Recuperação: Maior ou igual a 4 e menor que 7.

    - Reprovado: Menor que 4.
     */
    calculaMedia(10f, 10f, 5f, 9f)

}