class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double = salario * 0.2,
    cargo: String = "Diretor"
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
    cargo = cargo
) {

    override fun bonificacao(): Double = salario * 0.3

    override fun salarioTotal(): Double = this.salario + bonificacao() + plr
}