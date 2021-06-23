package br.com.zupacademy.witer.bank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
) : FuncionarioAdimin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    val plr: Double = salario * 0.2

    override fun bonificacao(): Double = salario * 0.3

    override fun salarioTotal(): Double = this.salario + bonificacao() + plr
}