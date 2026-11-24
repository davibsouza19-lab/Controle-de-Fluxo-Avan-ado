fun main() {
    var saldo = 1000

    while (true) {
        if (saldo >= 150) {
            saldo = saldo - 150
        }else{
            println("Saldo Insuficiente")
            break
        }
    }
}