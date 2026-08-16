
https://play.kotlinlang.org/

## Variáveis

No Kotlin, é preciso decidir se o valor de um identificador pode ou não ser alterado após a sua criação:

 - `val`(de value): Declara uma referência imutável (somente leitura). Só pode ser atribuída uma vez. Sempre dar preferência ao uso de `val` para tornar o código mais seguro.
 - `var` (de variable): Declara uma referência mutável. Pode reatribuir novos valores a ela livremente durante a execução do programa.

```kotlin
fun main() {
    val ano = 2000
    var idade = 25
    
    ano = 1999
    idade = 30
    
    println(ano + idade)
    
}
```

`'val' cannot be reassigned.` 

## Tipos

O Kotlin trabalha com os seguintes tipos básicos fundamentais:

- **Int**: Números inteiros (ex: `25`).
- **Double**: Números com ponto flutuante/decimais (ex: `1.75`).
- **Boolean**: Valores lógicos, podendo ser apenas `true` ou `false`.
- **String**: Cadeias de caracteres delimitadas por aspas duplas (ex: `"Kotlin"`).
- **Char**: Um único caractere delimitado por aspas simples (ex: `'K'`).

```kotlin
fun main() {
    val altura: Double = 1.88
    val nome = 'D'
    
    println(altura)
    println(nome)
}
```


## Interpolação de Strings

No Kotlin, os **String Templates** servem para inserir variáveis e expressões diretamente dentro de strings literais (delimitadas por aspas duplas), evitando a necessidade de concatenações barulhentas com o operador `+`.

- **Variáveis Simples:** Para inserir o valor de uma variável diretamente na string, basta colocar o caractere **$** antes do nome dela. Não é necessário usar chaves nesse caso.
- **Expressões Complexas:** Se precisar calcular algo, chamar uma função ou acessar uma propriedade de um objeto, envolva essa expressão com chaves após o cifrão: **${expressão}**.

```kotlin
fun main() {
    val nome = "David"
    val altura: Double = 1.88
    
    println("Meu nome é $nome e minha altura é ${altura + 0.05}")
}
```






