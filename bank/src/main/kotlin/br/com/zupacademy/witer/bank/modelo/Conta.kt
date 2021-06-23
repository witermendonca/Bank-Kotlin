package br.com.zupacademy.witer.bank.modelo

abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) {
    var saldo = 0.0
        protected set


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

    fun tranferir(valor: Double, conta: Conta) {
        sacar(valor)
        println("Transferencia conta debitada: ${titular.nome}")
        println("Valor transaferenia: $valor")
        println("Saldo Conta $saldo")
        conta.depositar(valor)
        println("Conta destino tranferencia: ${conta.titular.nome}")
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
