fun testaFuncionario() {
    val analista = Analista(
        "Witer Mendonça",
        "392.934.323-00",
        2500.0
    )

    println("Analista: ${analista.nome}")
    println("Bonificação: ${analista.bonificacao()}")
    println("Salario Total: ${analista.salarioTotal()}")


    val gerente = Gerente(
        "Tiago",
        "392.934.323-11",
        12500.0,
        "123456"
    )

    println("Gerente: ${gerente.nome}")
    println("Bonificação: ${gerente.bonificacao()}")
    println("Salario Total: ${gerente.salarioTotal()}")

    val diretor = Diretor(
        "Viny",
        "392.934.323-99",
        22500.0,
        "123456"
    )

    println("Diretor: ${diretor.nome}")
    println("Bonificação: ${diretor.bonificacao()}")
    println("PLR: ${diretor.plr}")
    println("Salario Total: ${diretor.salarioTotal()}")

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(analista)
    calculadoraBonificacao.registra(gerente)
    calculadoraBonificacao.registra(diretor)

    println("Total Bonificações: ${calculadoraBonificacao.total}")

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(gerente, "123456")
    sistemaInterno.entra(diretor, "654321")
}