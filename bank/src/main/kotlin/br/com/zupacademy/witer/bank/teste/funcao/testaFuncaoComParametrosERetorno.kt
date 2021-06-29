package br.com.zupacademy.witer.bank.teste.funcao

fun testaFuncaoComParametrosERetorno() {

    //Implementação por referencia.
    val funcaoDeSoma = ::soma
    println(funcaoDeSoma(10, 8))

    //Implementação por classe.
    val funcaoDeSomaClasse = Soma()
    println(funcaoDeSomaClasse(22, 33))

    //Função Lambda
    val funcaoDeSomaLambda = { a: Int, b: Int ->
        a + b
    }
    println(funcaoDeSomaLambda(44, 77))

    //Função Anônima
    val funcaoDeSomaAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(funcaoDeSomaAnonima(2, 8))

    //Função Lambda
    val calculaBonificacao: (salario: Double) -> Double = retorno@{ salario ->
        if (salario > 1000.0) {
            return@retorno salario + 50.0
        }
        return@retorno salario + 100.0
    }
    println(calculaBonificacao(1000.6))

    //Função Anônima
    val calculaBonificacaoAnonima = fun(salario: Double): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1000.0))

}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b

}