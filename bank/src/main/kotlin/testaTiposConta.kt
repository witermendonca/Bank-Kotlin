fun testaTiposConta() {
    val contaCorrente = ContaCorrente(
        "Witer Mendonça",
        1001
    )

    val contaPoupanca = ContaPoupanca(
        "João José",
        1002
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("Saldo depois do deposito Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo depois do deposito Conta Poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(200.0)
    contaPoupanca.sacar(200.0)

    println("Saldo depois do saque Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo depois do saque Conta Poupança: ${contaPoupanca.saldo}")


    contaCorrente.tranferir(200.0, contaPoupanca)

    println("Saldo depois da transferencia Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo depois da transferencia Conta Poupança: ${contaPoupanca.saldo}")
}
