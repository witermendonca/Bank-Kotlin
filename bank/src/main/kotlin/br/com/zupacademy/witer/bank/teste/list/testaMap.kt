package br.com.zupacademy.witer.bank.teste.list

fun testaMap() {

    val pedidos: MutableMap<Int, Double> = mutableMapOf(Pair(1, 200.0), 2 to 300.0, Pair(3, 50.0), 4 to 80.0)
    println(pedidos)

    val pedido: Double? = pedidos[2]
    pedido.let {
        println("Pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido: ${p.key} , Valor: ${p.value}")
    }

    pedidos[5] = 10.0
    pedidos.put(6, 555.0)
    pedidos[1] = 100.0
    pedidos.put(2, 20.0)
    println(pedidos) //pedidos atualizados

    pedidos.remove(6)
    println(pedidos) //pedidos atualizados pós remover 6

    println(pedidos.getValue(5))
    println(pedidos.getOrElse(6, { 0.0 }))

    println(pedidos.keys)
    println(pedidos.values)

    println(pedidos.filter { (chave, valor) -> chave % 2 == 0 && valor > 50.0}) //4 = 80.0

    println(pedidos.filterValues { valor -> valor > 50.0}) //1= 100.0 , 4 = 80.0

    println(pedidos.filterKeys { chave -> chave % 2 == 0}) //2= 20.0 , 4 = 80.0





}