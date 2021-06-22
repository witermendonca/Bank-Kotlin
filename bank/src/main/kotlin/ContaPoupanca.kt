class ContaPoupanca(
    titular: String,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun sacar(valor: Double) {
        this.saldo -= valor
        println("Saque conta: $titular")
        println("Valor saque: $valor")
        println("Saldo Conta $saldo")
    }

}