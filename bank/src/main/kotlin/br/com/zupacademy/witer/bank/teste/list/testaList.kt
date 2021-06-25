package br.com.zupacademy.witer.bank.teste.list

import br.com.zupacademy.witer.bank.modelo.Cliente

fun testaList() {

    val clienteMaria = Cliente("Maria", "333.333.333-37", "123456")

    val clienteJose = Cliente("José", "111.333.333-11", "123456")

    val clientePedro = Cliente("Pedro", "444.333.333-33", "123456")

    val clienteAna = Cliente("Ana", "355.333.333-33", "123456")

    val clientes = mutableListOf<Cliente>(clienteMaria, clienteJose, clientePedro, clienteAna)

    clientes.add(Cliente("Tiago", "399.999.999-99", "098765"))

    clientes.formataImpressao()

    clientes.remove(clienteJose)

    clientes.formataImpressao()

    //Ordena Clientes por ordem alfabetica dos nomes.
    clientes.sortedBy { it.nome }.formataImpressao()

    //Filtra pelo cpf informado
    clientes.filter { it.cpf == "399.999.999-99" }.formataImpressao()

    //Filtra pelos cpfs com inicio 3
    clientes.filter { it.cpf.startsWith("3") }.formataImpressao()


    val listaClientesComNullos =
        mutableListOf<Cliente?>(clienteMaria, null, clienteJose, clientePedro, null, clienteAna)

    println("#### Lista de Clientes Com Null ####")
    listaClientesComNullos.formataImpressao()

}

fun List<Cliente?>.formataImpressao() {
    val formatacaoDaImpressao = this.filterNotNull().joinToString(separator = "\n") {
        "Cliente nome: ${it.nome}, cpf: ${it.cpf}"
    }
    println("#### Lista de Clientes #### \n$formatacaoDaImpressao")
}