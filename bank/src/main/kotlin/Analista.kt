class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    cargo: String = "Analista"
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
    cargo = cargo
) {
    override fun bonificacao(): Double = salario * 0.1

    override fun salarioTotal(): Double = this.salario + bonificacao()
}
