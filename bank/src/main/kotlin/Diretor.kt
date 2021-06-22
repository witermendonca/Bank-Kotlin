class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double = salario * 0.2
) : Funcionario(
    nome,
    cpf,
    salario
) {

    override fun bonificacao(): Double = salario * 0.3

    override fun salarioTotal(): Double = this.salario + bonificacao() + plr
}