package br.com.zupacademy.witer.bank.teste.list

fun testaCollectionBancoDeNomes() {

    val bancoDeNomes = BancoDeNomes()
    
    val nomesSalvos: Collection<String> = bancoDeNomes.nomes
    println(nomesSalvos)

    bancoDeNomes.salvaNome("João")
    println(bancoDeNomes.nomes)
    
//    val nomesSalvos: MutableList<String> = bancoDeNomes.nomes as MutableList<String>
//    nomesSalvos.add("Tiago")
}

class BancoDeNomes {

    val nomes: Collection<String> get() = Companion.dados.toList()

    fun salvaNome(nome: String) {
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }

}
