class SistemaInterno {

    fun entra(adimin: FuncionarioAdimin, senha : String){
        if(adimin.autentica(senha)){
            println("Autenticação realizada com sucesso.")
        }else {
            println("Falha na Autenticação. ${adimin.nome}")
        }
    }
}