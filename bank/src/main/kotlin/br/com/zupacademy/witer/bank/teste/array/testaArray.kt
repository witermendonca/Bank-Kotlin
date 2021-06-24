package br.com.zupacademy.witer.bank.teste.array

fun testaIntroArrays() {

    val idades: IntArray = intArrayOf(22, 33, 11, 5, 40)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) maiorIdade = idade
    }
    println("Maior idade $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade -> if (idade < menorIdade) menorIdade = idade }
    println("Menor idade: $menorIdade")

    val salarios: DoubleArray = doubleArrayOf(2000.0, 5000.0, 1500.0, 4000.0)


    val aumento = 1.1
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println("Aumento salarios For: ${salarios.contentToString()}")

    salarios.forEachIndexed { index, salario -> salarios[index] = salario * aumento }
    println("Aumento salarios ForEachIndexed: ${salarios.contentToString()}")


}