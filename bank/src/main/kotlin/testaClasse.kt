fun testaClasse() {

    var contaWiter = ContaPoupanca("Witer Mendonça", 1)
//    contaWiter.titular = "Witer Mendonça"
//    contaWiter.numeroConta = 1
    contaWiter.depositar(300.0)

    println("Numero da conta: ${contaWiter.numeroConta}, Titular: ${contaWiter.titular}, Saldo: ${contaWiter.saldo}")

    contaWiter.depositar(300.0)
    contaWiter.sacar(200.0)

    var conta2 = ContaCorrente("João José", 1)
//    conta2.titular = "João José"
//    conta2.numeroConta = 2
    conta2.depositar(300.0)

    println("Numero da conta: ${conta2.numeroConta}, Titular: ${conta2.titular}, Saldo: ${conta2.saldo}")


    contaWiter.tranferir(100.0, conta2)

    println("Conta ${conta2.titular} Saldo depois da Transferencia: ${conta2.saldo}")
}

//fun deposita(conta : Conta, valor : Double){
//    conta.saldo += valor
//    println("Deposito conta: ${conta.titular}")
//    println("Valor deposito: $valor")
//    println("Saldo Conta ${conta.saldo}")
//}