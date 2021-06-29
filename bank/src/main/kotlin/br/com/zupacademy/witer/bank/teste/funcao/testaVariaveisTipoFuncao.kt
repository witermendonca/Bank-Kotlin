package br.com.zupacademy.witer.bank.teste.funcao

fun testaVariaveisTipoFuncao() {

    //Implementação por referencia.
    val minhaFuncao = ::teste
    println(minhaFuncao())

    //Implementação por classe.
    val minhaFuncaoClasse = Teste()
    println(minhaFuncaoClasse())

    //Função Lambda
    val minhaFuncaoLambda = { println("Executa Teste Lambda.") }
    println(minhaFuncaoLambda())

    //Função Anônima
    val minhaFuncaoAnonima = fun() { println("Executa Teste Função Anônima.") }
    println(minhaFuncaoAnonima())

}

fun teste() {
    println("Executa Teste.")
}

class Teste {
    operator fun invoke() {
        println("Executa invoke do Teste.")
    }
}