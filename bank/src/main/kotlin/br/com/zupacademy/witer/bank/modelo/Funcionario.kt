package br.com.zupacademy.witer.bank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
//    open fun bonificacao(): Double {
//        return salario * 0.1
//    }

    abstract fun bonificacao(): Double

    abstract fun salarioTotal(): Double
}