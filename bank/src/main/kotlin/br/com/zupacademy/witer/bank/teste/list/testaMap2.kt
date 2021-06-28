package br.com.zupacademy.witer.bank.teste.list

fun testaMap2() {

    val pedidos = listOf(
        Pedidos(1, 500.0),
        Pedidos(2, 40.0),
        Pedidos(3, 100.0),
        Pedidos(4, 20.0),
        Pedidos(5, 350.0)
    )
    println(pedidos)

    val pedidosFreteGratis: Map<Pedidos, Boolean> = pedidos.associateWith { pedido -> pedido.valor > 50.0} //Bollean valores maoir que 50.0
    println(pedidosFreteGratis)

    val pedidosFreteGratisExistentes = pedidos.groupBy { pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratisExistentes[true])
}

data class Pedidos(val numeroPedido: Int, val valor: Double)