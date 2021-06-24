package br.com.zupacademy.witer.bank.teste.array

import java.math.BigDecimal
import java.math.RoundingMode

fun testaArrayBigDecimal() {

    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00", "8000.00")

    val aumento = "1.1".toBigDecimal() //aumento de 10%
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println("Salarios: ${salarios.contentToString()}")
    println("Salarios Com aumento: ${salariosComAumento.contentToString()}")


    println(intArrayOf(1, 2, 3).sum())//método de soma de intArray

    println("Soma de todos os salarios no mes: ${salariosComAumento.sumBigDecimal()}")

    val meses = 6.toBigDecimal()
    val somaTotalSeteMeses = salariosComAumento.fold(salariosComAumento.sumBigDecimal()) { acomulador, salario ->
        acomulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Soma total dos salarios em 7 meses: $somaTotalSeteMeses")

    //método de soma de intArray pelos maoires 3 salarios
    println(intArrayOf(1, 26, 3, 5, 5).sorted().takeLast(3).sum())

    //método de soma de intArray pelos menores 3 salarios
    println(intArrayOf(1, 26, 3, 5, 5).sorted().take(3).sum())


    val mediaMaioresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println("Média dos 3 maiores salarios: $mediaMaioresSalarios")

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println("Média dos 3 menosres salarios: $mediaMenoresSalarios")

}

//salários maiores que R$ 5000,00 recebem um aumento de 10% e salários menores recebem um aumento fixo de R$ 500,00
private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
        : BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}