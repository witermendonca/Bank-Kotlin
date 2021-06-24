package br.com.zupacademy.witer.bank.exception

import java.lang.Exception

class SaldoInsuficienteException(mensagem: String = "Saldo Insuficiente."): Exception(mensagem) {
}