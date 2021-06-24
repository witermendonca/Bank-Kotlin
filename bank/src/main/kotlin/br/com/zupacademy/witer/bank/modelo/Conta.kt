package br.com.zupacademy.witer.bank.modelo

import br.com.zupacademy.witer.bank.exception.FalhaAutenticacaoException
import br.com.zupacademy.witer.bank.exception.SaldoInsuficienteException

////Property global
//var totalConta = 0
//    private set

abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) : Autenticavel by titular { //delegação de implementação
    var saldo = 0.0
        protected set

    //Object Declarations singleton
    companion object ContadorContasCriadas {
        var totalContas = 0
            private set
    }

    init {
        println("Criando Conta.")
        totalContas++
    }


//    fun getSaldo(): Double {
//        return saldo
//    }

//    fun setSaldo(saldo: Double) {
//        this.saldo = saldo
//    }

    fun depositar(valor: Double) {
        this.saldo += valor
        println("Deposito conta: ${titular.nome}")
        println("Valor deposito: $valor")
        println("Saldo Conta $saldo")
    }

    abstract fun sacar(valor: Double)

    fun tranferir(valor: Double, contaDestino: Conta, senha: String) {

        if (!autentica(senha)) {
            throw  FalhaAutenticacaoException()
        }
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "Saldo Insuficiente. Saldo Atual: $saldo")
        }

        sacar(valor)
        println("Transferencia conta debitada: ${titular.nome}")
        println("Valor transferencia: $valor")
        println("Saldo Conta $saldo")
        contaDestino.depositar(valor)
        println("Conta destino tranferencia: ${contaDestino.titular.nome}")
    }
    
//    //delegação de implementação
//    override fun autentica(senha: String): Boolean {
//        return titular.autentica(senha)
//    }

    override fun toString(): String {
        return "Conta(titular=${titular.toString()}, numeroConta=$numeroConta, saldo=$saldo)"
    }
}

//class br.com.zupacademy.witer.bank.modelo.Conta {
//    var titular = ""
//    var numeroConta = 0
//    var saldo = 0.0
//        private set
//
//
////    fun getSaldo(): Double {
////        return saldo
////    }
//
////    fun setSaldo(saldo: Double) {
////        this.saldo = saldo
////    }
//
//    fun depositar(valor: Double) {
//        this.saldo += valor
//        println("Deposito conta: ${titular}")
//        println("Valor deposito: $valor")
//        println("Saldo br.com.zupacademy.witer.bank.modelo.Conta ${saldo}")
//    }
//
//    fun sacar(valor: Double) {
//        this.saldo -= valor
//        println("Saque conta: ${titular}")
//        println("Valor saque: $valor")
//        println("Saldo br.com.zupacademy.witer.bank.modelo.Conta ${saldo}")
//    }
//
//    fun tranferir(valor: Double, conta: br.com.zupacademy.witer.bank.modelo.Conta) {
//        this.saldo -= valor
//        println("Transferencia conta debitada: ${titular}")
//        println("Valor transaferenia: $valor")
//        println("Saldo br.com.zupacademy.witer.bank.modelo.Conta ${saldo}")
//        conta.depositar(valor)
//        println("br.com.zupacademy.witer.bank.modelo.Conta destino tranferencia: ${conta.titular}")
//    }
//}
