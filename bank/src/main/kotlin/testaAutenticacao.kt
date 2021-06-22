fun testaAutenticacao() {

    val gerente = Gerente(
        "José",
        "111.111.111-11",
        33333.0,
        "123456"
    )

    val diretora = Diretor(
        "Ana",
        "222.222.222-22",
        11333.0,
        "123456"
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(gerente, "654321")
    sistemaInterno.entra(diretora, "123456")
}