package br.com.zupacademy.witer.bank.modelo

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun sacar(valor: Double) {
        val valorTaxa = valor + 0.1
        this.saldo -= valorTaxa
        println("Saque conta: ${titular.nome}")
        println("Valor saque: $valor")
        println("Saldo Conta $saldo")
    }
}