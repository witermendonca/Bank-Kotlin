abstract class FuncionarioAdimin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
), Autenticavel {
    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}