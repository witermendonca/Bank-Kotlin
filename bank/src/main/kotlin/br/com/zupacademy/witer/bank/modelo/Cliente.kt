package br.com.zupacademy.witer.bank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: String,
    var endereco: Endereco = Endereco()  //Assim não é necessario de imediato implementação de endereço.
) : Autenticavel {

    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}