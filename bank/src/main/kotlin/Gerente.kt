class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double = salario * 0.2

    override fun salarioTotal(): Double = this.salario + bonificacao()
}