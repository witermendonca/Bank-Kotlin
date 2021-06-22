fun testaLacos() {

//    for (i in 1..3) {
//        println("Bem vindo ao bytebank")
//
//        val titular = "Witer Mendonça $i"
//        val numeroConta = i + 1000
//        var saldo = i + 20.00
//        saldo += i + 20
//        println("Titular: $titular, Numero da conta: $numeroConta, saldo: $saldo , Status Saldo: ${condicaoSaldo(saldo)}")
//    }

    for (i in 1..3) {

        if (i == 2) break

        println("Bem vindo ao bytebank")
        val titular = "Witer Mendonça $i"
        val numeroConta = i + 1000
        var saldo = i + 20.00
        saldo += i + 20
        println("Titular: $titular, Numero da conta: $numeroConta, saldo: $saldo , Status Saldo: ${condicaoSaldo(saldo)}")
    }

//    for (i in 5 downTo 1 step 3) {
//        println("Bem vindo ao bytebank")
//
//        val titular = "Witer Mendonça $i"
//        val numeroConta = i + 1000
//        var saldo = i + 20.00
//        saldo += i + 20
//        println("Titular: $titular, Numero da conta: $numeroConta, saldo: $saldo , Status Saldo: ${condicaoSaldo(saldo)}")
//    }

    var i = 0
    while (i < 5) {
        println("Bem vindo ao bytebank")

        val titular = "Witer Mendonça $i"
        val numeroConta = i + 1000
        var saldo = i + 20.00
        saldo += i + 20
        println("Titular: $titular, Numero da conta: $numeroConta, saldo: $saldo , Status Saldo: ${condicaoSaldo(saldo)}")
        i++
    }


}