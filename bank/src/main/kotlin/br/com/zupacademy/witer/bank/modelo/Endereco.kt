package br.com.zupacademy.witer.bank.modelo

class Endereco(
    var rua: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var pais: String = "",
    var complemento: String = ""
) {
    //To raw string literal.
    override fun toString(): String {
        return """
            |Endereco:
            |rua='$rua', 
            |numero=$numero, 
            |bairro='$bairro', 
            |cidade='$cidade', 
            |estado='$estado', 
            |cep='$cep', 
            |pais='$pais', 
            |complemento='$complemento'""".trimMargin()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (cep != other.cep) return false

        return true
    }

    override fun hashCode(): Int {
        return cep.hashCode()
    }


}
