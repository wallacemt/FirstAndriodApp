fun converterHorasMinutos(totalMinutos: Int) {
    val horas = totalMinutos / 60
    val minutos = totalMinutos % 60
    println("$totalMinutos minutos é igual a $horas horas e $minutos minutos.")
}

fun converterParaMinutos(horas: Int, minutos: Int) {
    val totalMinutos = horas * 60 + minutos
    println("$horas horas e $minutos minutos é igual a $totalMinutos minutos.")
}

fun main(){
    /*
    Crie um algoritmo que converte horas em horas e minutos e
    minutos para horas e minutos. Atribua os valores a variáveis do tipo
    inteiras.
    */
    converterHorasMinutos(110)
    converterParaMinutos(44, 10)
}