fun sacar(valor: Int): String {
    if (valor % 10 == 0) {
        var resto = valor
        var c1 = 0
        var c2 = 0
        var c3 = 0

        while (resto != 0) {
            if (resto >= 100) {
                resto -= 100
                c1 += 1
            } else if (resto >= 50) {
                resto -= 50
                c2 += 1
            } else if (resto >= 10) {
                resto -= 10
                c3 += 1
            }
        }

        return "${c1}x100, ${c2}x50, ${c3}x10"
    } else {
        return "Valor inválido"
    }
}

fun main() {
    println(sacar(250))
    println(sacar(4790))
    println(sacar(999))
}
