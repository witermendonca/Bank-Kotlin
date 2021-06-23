package br.com.zupacademy.witer.bank.modelo

interface Autenticavel {
    fun autentica(senha: String) : Boolean
}