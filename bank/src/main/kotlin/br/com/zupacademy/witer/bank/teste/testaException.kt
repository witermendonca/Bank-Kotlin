package br.com.zupacademy.witer.bank.teste

fun testaException() {

//    try {
//        10 / 0
//    } catch (e: ArithmeticException) {
//        e.printStackTrace()
//    }

    val entrada: String = "1.8"

//    val valor = entrada.toDoubleOrNull()
//    try {
//        val valor = entrada.toDouble()
//        println(valor)
//    }catch (e: NumberFormatException){
//        println("Problema na conversão")
//        e.printStackTrace()
//    }

    //try-expression
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    //if-expression
    val valorComTaxa: Double? = if (valor != null) {
        valor + 0.1
    } else {
        null
    }

    //when-expression
    val valorComTaxaWhen: Double? = when {
        valor != null -> {
            valor + 0.1
        }
        else -> {
            null
        }
    }

    if (valorComTaxa != null) {
        println("Valor Recebido $valorComTaxa")
    } else {
        println("Valor Inválido $valorComTaxa")
    }

    if (valorComTaxaWhen != null) {
        println("Valor Recebido $valorComTaxaWhen")
    } else {
        println("Valor Inválido $valorComTaxaWhen")
    }


}