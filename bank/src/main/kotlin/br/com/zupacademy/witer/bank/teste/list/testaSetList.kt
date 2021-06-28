package br.com.zupacademy.witer.bank.teste.list

fun testaSetList() {

    val alunosCursoJava = listOf<String>("André", "João", "Maria", "Ana", "Bete")
    val alunosCursoKotlin = listOf<String>("André", "Raquel", "Ana")

    val alunosAmbosCursos = alunosCursoJava + alunosCursoKotlin
    println(alunosAmbosCursos)
    println(alunosAmbosCursos.distinct())

    val alunosCursoJavaSet: List<String> = listOf<String>("André", "João", "Maria", "Ana", "Bete")
    val alunosCursoKotlinSet: Set<String> = setOf<String>("André", "Raquel", "Ana")

//    val alunosAmbosCursosSet =  alunosCursoKotlinSet + alunosCursoJavaSet
    println(alunosCursoKotlinSet union alunosCursoJavaSet)

//    val alunosAmbosCursosSetSub = alunosCursoKotlinSet - alunosCursoJavaSet
    println(alunosCursoKotlinSet subtract alunosCursoJavaSet)

    println(alunosCursoKotlinSet intersect alunosCursoJavaSet) //comum entre os dois

    val alunosAmbosCursosSet = mutableSetOf<String>()
    alunosAmbosCursosSet.addAll(alunosCursoJavaSet)
    alunosAmbosCursosSet.addAll(alunosCursoKotlinSet)
    alunosAmbosCursosSet.add("Pedro")
    alunosAmbosCursosSet.add("Pedro")

    println(alunosAmbosCursosSet)


}