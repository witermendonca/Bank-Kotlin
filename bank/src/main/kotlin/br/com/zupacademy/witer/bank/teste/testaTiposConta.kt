import br.com.zupacademy.witer.bank.modelo.Cliente
import br.com.zupacademy.witer.bank.modelo.ContaCorrente
import br.com.zupacademy.witer.bank.modelo.ContaPoupanca
import br.com.zupacademy.witer.bank.modelo.Endereco

fun testaTiposConta() {

    val contaCorrente = ContaCorrente(Cliente("Witer Mendonça", "444.444.444-44", "123456"), 1001)

    val contaPoupanca = ContaPoupanca(
        Cliente(
            "João José",
            "555.444.444-44",
            "123456",
            Endereco(
                "Rua Xico Santeiro",
                7777,
                "Jd. Bertino",
                "Americana",
                "São Paulo"
            )
        ), 1002
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

    println("Endereço titular Conta Poupança: ${contaPoupanca.titular.endereco.rua}, " +
            "${contaPoupanca.titular.endereco.numero}, ${contaPoupanca.titular.endereco.bairro}, " +
            "${contaPoupanca.titular.endereco.cidade}, ${contaPoupanca.titular.endereco.estado}")

}
