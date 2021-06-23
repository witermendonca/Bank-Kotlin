package br.com.zupacademy.witer.bank.modelo

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun sacar(valor: Double) {
        this.saldo -= valor
        println("Saque conta: ${titular.nome}")
        println("Valor saque: $valor")
        println("Saldo Conta $saldo")
    }

}