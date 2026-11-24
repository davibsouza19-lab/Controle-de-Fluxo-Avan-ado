fun main() {
    val alvo = 29
    var ehPrimo = true

    for (numero in 2..alvo - 1){
        if (alvo % numero == 0) {
            ehPrimo = false
            break
        }
    }
     println(ehPrimo)
}