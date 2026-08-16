
https://play.kotlinlang.org/

## **O loop** `for` **e Ranges**

No Kotlin, o loop `for` é usado para iterar sobre qualquer estrutura que forneça um iterador, sendo mais comumente utilizado com **intervalos (ranges)**.

Para criar os intervalos, usamos operadores e palavras-chave específicas:

- `..`: Cria um intervalo fechado (inclui o último número). Ex: `1..5` (gera de 1 a 5).
- `until`: Cria um intervalo aberto à direita (exclui o último número). Ex: `1 until 5` (gera de 1 a 4).
- `downTo`: Cria uma progressão decrescente. Ex: `5 downTo 1` (gera de 5 até 1).
- `step`: Define o incremento (passo) da repetição. Ex: `1..10 step 2` (gera 1, 3, 5, 7, 9).

```kotlin
fun main() {
    for (i in 10 downTo 0 step 2){
        println("$i ")
    }
}
```

## **Loops** `while` **e** `do-while`

No Kotlin, os loops **while** e **do-while** possuem o mesmo comportamento padrão de outras linguagens:

- **while**: Avalia a expressão booleana no início. O bloco de código só é executado se a condição for verdadeira. Se for falsa logo de início, o bloco nunca roda.
- **do-while**: Executa o corpo do loop primeiro e depois avalia a condição no final. Isso garante que o código dentro do bloco seja executado **pelo menos uma vez**.

No Kotlin, você também pode usar os operadores de atribuição simplificados (como `+=`, `-=`) e os operadores de incremento/decremento (`++`, `--`).

```kotlin
fun main() {
    var tentativas = 1
    
    while (tentativas < 3) {
        println("Tentando pela ${tentativas}ª vez")
        tentativas++ 
    }
}
```

## `break` **e** `continue`


No Kotlin, essas palavras-chave servem para controlar e alterar o fluxo de execução dos loops (`for`, `while` ou `do-while`) de forma cirúrgica:

- **continue**: Pula o restante do bloco de código da iteração atual e salta direto para a próxima iteração do loop.
- **break**: Interrompe completamente o loop, saindo dele imediatamente.

```kotlin
fun main() {
    for(i in 1..10){
        if (i == 5) continue // pula o número 5
        if (i == 8) break // para aqui
        println("$i")
    }
}
```