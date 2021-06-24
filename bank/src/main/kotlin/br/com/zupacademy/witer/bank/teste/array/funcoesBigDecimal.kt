package br.com.zupacademy.witer.bank.teste.array

import java.math.BigDecimal

//função para criar o array de BigDecimal
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

// extension function para os arrays do tipo BigDecimal, utilizando a função reduce
fun Array<BigDecimal>.sumBigDecimal(): BigDecimal {
    //reduz todos valores do array somados a um valor só.
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

//extension function para os arrays do tipo BigDecimal para calcular a média simples entre os valores do array
fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.sumBigDecimal() / this.size.toBigDecimal()
    }
}