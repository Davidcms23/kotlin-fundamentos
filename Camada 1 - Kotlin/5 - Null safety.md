
https://play.kotlinlang.org/

## **Tipos Não-Nulos (Non-Nullable) vs. Tipos que podem ser Nulos (Nullable)**

No Kotlin, o sistema de tipos distingue de forma rígida o que pode e o que não pode ser nulo:

1. **Tipos Não-Nulos (Padrão):** Por padrão, qualquer tipo que você declara no Kotlin **não pode** receber `null`. Se você tentar atribuir `null`, o código nem sequer compila.
2. **Tipos Nullable (****?****):** Para permitir que uma variável receba `null`, você deve adicionar uma interrogação (`?`) logo após o nome do tipo.

```kotlin
fun main() {
    var idade: Int? = null 
    println(idade)
    
    idade = 25
    println("A idade é: $idade")
}
```

## **O operador de chamada segura (****?.****)**

No Kotlin, o compilador proíbe tentar acessar uma propriedade ou chamar um método diretamente de uma variável que possa ser nula (usando o ponto comum `.`), pois isso causaria um erro de compilação. Essa restrição serve para garantir que você não tenha surpresas com erros de ponteiro nulo (`NullPointerException`) em tempo de execução.

Para resolver isso de forma elegante, usamos o **operador de chamada segura (****?.****)**:

- Se a variável **não for nula**, o método ou propriedade é acessado normalmente.
- Se a variável **for nula**, o Kotlin pula a execução da chamada e retorna **null** diretamente, sem lançar nenhuma exceção ou quebrar o fluxo do programa.

```kotlin
fun imprimirComprimento(texto: String?) {
    println(texto?.length)
}

fun main() {
    imprimirComprimento("Kotlin")
    imprimirComprimento(null)
}
```

## **O Operador Elvis (****?:****)**

O operador Elvis (**?:**) é usado para fornecer um **valor padrão** caso uma expressão resulte em `null`.

- Se o valor à esquerda do `?:` **não for nulo**, ele é o resultado utilizado.
- Se o valor à esquerda do `?:` **for nulo**, o Kotlin utiliza o valor especificado à direita.

```kotlin
fun obterComprimento(texto: String?): Int{
    val c = texto?.length ?: 0
    
    return c
}

fun main() {
    println(obterComprimento(null))
}
```

## **O operador de asserção não-nula (****!!****)**

O operador **!!** (conhecido como _double bang_) força a conversão de um tipo nullable para um tipo não-nulo. Ele basicamente diz ao compilador: _"Eu garanto que este valor não é nulo, pode confiar e ignorar o aviso"_.

- **O perigo:** Se a variável for realmente `null` no momento em que o código rodar, o programa vai quebrar na hora, gerando um erro de ponteiro nulo (`NullPointerException`).
- **Boas práticas:** Evite usar o `!!` no seu dia a dia. Prefira sempre chamadas seguras (`?.`) ou o operador Elvis (`?:`).

```kotlin
fun main() {
    val texto: String? = "Kotlin Puro"
    
    val comprimento = texto!!.length
    
    println("O comprimento é $comprimento")
}
```

_Se a variável_ _texto_ _fosse_ _null, o_ _!!_ _teria interrompido a execução na hora com uma exceção_ _NullPointerException.

