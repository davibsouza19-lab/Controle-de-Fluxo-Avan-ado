fun main() {
    val palavra = "Universidade"

    for (letra in palavra) {
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'U') {
           continue
        }
        print(letra)
    }
}