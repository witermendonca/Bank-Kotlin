fun testaFuncionario() {
    val funcionario = Funcionario(
        "Witer Mendonça",
        "392.934.323-00",
        2500.0
    )

    println("Funcionario: ${funcionario.nome}")
    println("Bonificação: ${funcionario.bonificacao()}")
    println("Salario Total: ${funcionario.salarioTotal()}")


    val gerente = Gerente(
        "Tiago",
        "392.934.323-11",
        12500.0
    )

    println("Gerente: ${gerente.nome}")
    println("Bonificação: ${gerente.bonificacao()}")
    println("Salario Total: ${gerente.salarioTotal()}")

    val diretor = Diretor(
        "Viny",
        "392.934.323-99",
        22500.0
    )

    println("Diretor: ${diretor.nome}")
    println("Bonificação: ${diretor.bonificacao()}")
    println("PLR: ${diretor.plr}")
    println("Salario Total: ${diretor.salarioTotal()}")

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(funcionario)
    calculadoraBonificacao.registra(gerente)
    calculadoraBonificacao.registra(diretor)

    println("Total Bonificações: ${calculadoraBonificacao.total}")
}