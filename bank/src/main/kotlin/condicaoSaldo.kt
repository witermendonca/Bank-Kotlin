//if, else , when
fun condicaoSaldo(saldo: Double): String {

//        if(saldo > 0.0){
//        var statusSaldo = "Positivo"
//        println("Saldo $statusSaldo")
//    }else if(saldo < 0.0){
//        var statusSaldo = "Negativo"
//        println("Saldo $statusSaldo")
//    }else{
//        println("Saldo $statusSaldo")
//    }

    var statusSaldo = "Neutro"
    when {
        saldo > 0.0 -> statusSaldo = "Positivo"
        saldo < 0.0 -> statusSaldo = "Negativo"
        else -> statusSaldo = statusSaldo
    }
    return statusSaldo
}