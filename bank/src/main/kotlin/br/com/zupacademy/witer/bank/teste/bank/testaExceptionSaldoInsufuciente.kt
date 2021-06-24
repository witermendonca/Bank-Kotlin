package br.com.zupacademy.witer.bank.teste

import br.com.zupacademy.witer.bank.exception.FalhaAutenticacaoException
import br.com.zupacademy.witer.bank.exception.SaldoInsuficienteException
import br.com.zupacademy.witer.bank.modelo.Cliente
import br.com.zupacademy.witer.bank.modelo.ContaCorrente
import br.com.zupacademy.witer.bank.modelo.ContaPoupanca

fun testaExceptionSaldoInsuficiente() {

    var clienteWiter = Cliente("Witer Mendonça", "444.444.444-44", "123456")
    var clienteJoao = Cliente("João José", "555.444.444-44", "123456")

    var contaWiter = ContaPoupanca(clienteWiter, 1)
    var contaJoao = ContaCorrente(clienteJoao, 2)
    contaWiter.depositar(600.0)

    try {
        contaWiter.tranferir(200.0, contaJoao, "123456")
    } catch (e: FalhaAutenticacaoException) {
        e.printStackTrace()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
    } catch (e: Exception) {
        e.printStackTrace()
    }


}