fun main() {
    val opcoesDoUsuario = listOf(1,2,3,0)

    for (opcao in opcoesDoUsuario) {
        if (opcao == 1 || opcao == 2) {
            println("Processando...")
        }
        if (opcao == 3) {
            println("Módulo em manutenção")
            continue
        }
        if (opcao == 0) {
            break
        }
    }
}