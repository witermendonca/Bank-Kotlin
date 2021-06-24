import br.com.zupacademy.witer.bank.modelo.Cliente
import br.com.zupacademy.witer.bank.modelo.ContaCorrente
import br.com.zupacademy.witer.bank.modelo.ContaPoupanca

fun testaClasse() {

    var clienteWiter = Cliente("Witer Mendonça", "444.444.444-44", "123456")
    var clienteJoao = Cliente("João José", "555.444.444-44", "123456")

    var contaWiter = ContaPoupanca(clienteWiter, 1)
    contaWiter.depositar(300.0)

    println("Numero da conta: ${contaWiter.numeroConta}, Titular: ${contaWiter.titular.nome}, Saldo: ${contaWiter.saldo}")

    contaWiter.depositar(300.0)
    contaWiter.sacar(200.0)

    var conta2 = ContaCorrente(clienteJoao, 2)
    conta2.depositar(300.0)

    println("Numero da conta: ${conta2.numeroConta}, Titular: ${conta2.titular.nome}, Saldo: ${conta2.saldo}")


    contaWiter.tranferir(100.0, conta2, "123456")

    println("Conta ${conta2.titular.nome} Saldo depois da Transferencia: ${conta2.saldo}")
}
