class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha : String){
        if(autenticavel.autentica(senha)){
            println("Autenticação realizada com sucesso.")
        }else {
            println("Falha na Autenticação.")
        }
    }
}