fun main() {
    val senhasDigitadas = listOf("123", "456", "789")
    val  senhaCorreta = "987"

    var tentativaAtual = 1


    for (senha in senhasDigitadas){
        if (senha == senhaCorreta){
            println("Acesso concedido!")
            break
        }else{
            println("Senha errada!")
        }
        if (tentativaAtual == 3 ){
            println("Cofre travado administrativamente")
            break
        }

        tentativaAtual = tentativaAtual + 1
    }
}