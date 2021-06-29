package br.com.zupacademy.witer.bank.teste.funcao

import br.com.zupacademy.witer.bank.modelo.Cliente
import br.com.zupacademy.witer.bank.modelo.Endereco

fun testaFuncoesEscopo() {

    //higher order function

    //let
    Endereco("Xico Santeiro", 44).let { endereco ->
        "${endereco.rua}, ${endereco.numero}".toUpperCase()
    }.let(::println)

    //let List
    listOf(Endereco("Av.Barsil"), Endereco(), Endereco("Av.Tiradentes"))
        .filter { endereco -> endereco.rua.isNotEmpty() }
        .let(::println)

    somaResultado(4, 7, resultado = (::println))

    //testa run
    Endereco("Xico Santeiro", 44).run {
        "$rua, $numero".toUpperCase()
    }.let(::println)


    //testa with
    with(Endereco()) {
        rua = "Av.Brasil"
        numero = 777
        bairro = "Parque Das Nações"
        cidade = "Americana"
        estado = "São Paulo"
        cep = "143.8747-00"
        pais = "Brasil"
        complemento = "Apartamento"
        toString()
    }.let(::println)
}

fun somaResultado(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}