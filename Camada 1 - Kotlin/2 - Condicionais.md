
https://play.kotlinlang.org/

## **if** **/** **else** **/** **else if**

No Kotlin, a estrutura básica de decisão condicional funciona de maneira muito parecida com a de outras linguagens que você já conhece (como Java ou C). O fluxo do programa é desviado com base na avaliação de expressões booleanas (que resultam em `true` ou `false`).

```kotlin
fun main() {
	val hora: Int = 23
    
    if (hora < 12){
        println("Bom dia")
    } else if (hora < 18) {
        println("Boa tarde")
    } else {
        println("Boa noite")
    }
}
```

No Kotlin, o **if** **é uma expressão** (retorna um valor), e não apenas uma instrução de controle como no C/Java. Isso significa que você pode atribuir o resultado de uma condicional diretamente a uma variável ou constante.

Graças a isso, **não existe operador ternário** (`condicao ? valor1 : valor2`) no Kotlin, pois o próprio `if` já faz esse papel de forma limpa.

```kotlin
fun main() {
	val nota = 6.0
    
    val situacao = if (nota >= 6) "Aprovado" else "Reprovado" 
    
    println("O aluno foi $situacao")
}
```


## **when**

No Kotlin, o **when** substitui o tradicional `switch` de outras linguagens, mas é muito mais poderoso e flexível.

- Ele avalia seus ramos de cima para baixo sequencialmente até que uma condição seja satisfeita.
- Como o `if`, o `when` pode ser usado como uma **expressão** (retornando um valor) ou como uma **instrução** (apenas executando um bloco). Quando usado como expressão, o ramo `else` é obrigatório para garantir que seja exaustivo.
- Ele aceita múltiplos valores na mesma condição (separados por vírgula), checagem de intervalos (usando **in**) e até mesmo pode ser usado sem nenhum argumento (funcionando como um substituto elegante para vários `if`/`else if` encadeados).

```kotlin
fun main() {
    val nota: Int = 5
    
    val conceito = when(nota) {
        9, 10 -> "A"
        7, 8 -> "B"
        in 5..6 -> "C"
        else -> "F"
    }
    
    println(conceito)
}
```

