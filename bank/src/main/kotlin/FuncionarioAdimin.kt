abstract class FuncionarioAdimin(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
) {

    abstract fun autentica(senha: String): Boolean
}