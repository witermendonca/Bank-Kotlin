package br.com.zupacademy.witer.bank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
) {
    override fun bonificacao(): Double = salario * 0.1

    override fun salarioTotal(): Double = this.salario + bonificacao()
}
