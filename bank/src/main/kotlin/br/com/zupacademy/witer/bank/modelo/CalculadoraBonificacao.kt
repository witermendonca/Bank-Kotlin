package br.com.zupacademy.witer.bank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

//    fun registra(gerente: br.com.zupacademy.witer.bank.modelo.Gerente) {
//        this.total += gerente.bonificacao()
//    }
//
//    fun registra(diretor: br.com.zupacademy.witer.bank.modelo.Diretor) {
//        this.total += diretor.bonificacao()
//    }
}