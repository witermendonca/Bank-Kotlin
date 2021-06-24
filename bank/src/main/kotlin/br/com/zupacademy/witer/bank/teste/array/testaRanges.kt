package br.com.zupacademy.witer.bank.teste.array

fun testaRanges() {

    //Ranges

    for (numerosPares in 0..100 step 2) {
        //imprime numeros pares de 0 à 100
        println(numerosPares)
    }

    //imprime numeros pares de 0 à 100 reverso
    val numerosPares = 100 downTo 0 step 2
    numerosPares.forEach { println(it) }

    //De a até p minusculo.
    val alfabeto = "a".."p"
    println("M" in alfabeto) //false
    println("m" in alfabeto) //true
    println("z" in alfabeto) //false

    val idades: IntArray = intArrayOf(22, 33, 11, 5, 40)
    println("Maior Idade: ${idades.maxOrNull()}")
    println("Menor Idade: ${idades.minOrNull()}")
    println("Média das Idades: ${idades.average()}")

    //Para identificar se todos ou qualquer um dos elementos de uma lista se adequam a determinada condição
    println("Existe Idades maoires que 18? ${idades.any{it > 18}}") //any() Boolean = true
    println("Todas Idades São maoires que 18? ${idades.all{it > 18}}") //all() Boolean = false

    //filtrar valores
    //retorna uma lista
    println("Idades maoires que 18: ${idades.filter{it > 18}}")
    //retorna um IntArray
    println("Idades maoires que 18: ${idades.filter{it > 18}.toIntArray().contentToString()}")
    println("Idade igual à 22: ${idades.find{it == 22}}") //busca pela idade 22, caso não tenha retorna null
    println("Idade igual à 18: ${idades.contains(18)}") //false





}