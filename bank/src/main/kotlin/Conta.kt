open class Conta(
    val titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set


//    fun getSaldo(): Double {
//        return saldo
//    }

//    fun setSaldo(saldo: Double) {
//        this.saldo = saldo
//    }

    fun depositar(valor: Double) {
        this.saldo += valor
        println("Deposito conta: $titular")
        println("Valor deposito: $valor")
        println("Saldo Conta $saldo")
    }

    open fun sacar(valor: Double) {
        this.saldo -= valor
        println("Saque conta: $titular")
        println("Valor saque: $valor")
        println("Saldo Conta $saldo")
    }

    fun tranferir(valor: Double, conta: Conta) {
        sacar(valor)
        println("Transferencia conta debitada: $titular")
        println("Valor transaferenia: $valor")
        println("Saldo Conta $saldo")
        conta.depositar(valor)
        println("Conta destino tranferencia: ${conta.titular}")
    }
}

//class Conta {
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
//        println("Saldo Conta ${saldo}")
//    }
//
//    fun sacar(valor: Double) {
//        this.saldo -= valor
//        println("Saque conta: ${titular}")
//        println("Valor saque: $valor")
//        println("Saldo Conta ${saldo}")
//    }
//
//    fun tranferir(valor: Double, conta: Conta) {
//        this.saldo -= valor
//        println("Transferencia conta debitada: ${titular}")
//        println("Valor transaferenia: $valor")
//        println("Saldo Conta ${saldo}")
//        conta.depositar(valor)
//        println("Conta destino tranferencia: ${conta.titular}")
//    }
//}
