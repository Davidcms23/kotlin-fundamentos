
https://play.kotlinlang.org/

## **Sintaxe Básica de Funções**.

No Kotlin, as funções são declaradas utilizando a palavra-chave **fun**. A estrutura segue estas regras:

- Os parâmetros devem ter obrigatoriamente seus tipos declarados de forma explícita na sintaxe `nome: Tipo`.
- Os parâmetros recebidos dentro do corpo da função são de apenas leitura (imutáveis, como se fossem `val`).
- O tipo de retorno da função é colocado após os parênteses, precedido por dois-pontos (`:`).
- Utiliza-se a palavra-chave `return` para enviar o resultado de volta.

```kotlin
fun calcularAreaRetangulo(lar: Double, alt: Double): Double{
    return lar * alt
}

fun main() {
    val resultado = calcularAreaRetangulo(10.0, 5.0)
    println("A área do retangulo é $resultado")
}
```

## **Parâmetros com Valor Padrão**

No Kotlin, da pra tornar os parâmetros de uma função opcionais definindo um valor padrão para eles usando o operador = após o tipo do parâmetro. Se quem chamar a função não fornecer um argumento para esse parâmetro, o Kotlin usará automaticamente o valor padrão especificado. Isso evita a necessidade de criar várias sobrecargas da mesma função.

```kotlin
fun enviarNota(aluno: String, nota: Double = 0.0) {
    println("O aluno $aluno tirou nota $nota")
}

fun main(){
    enviarNota("David", 10.0)
}
```

## Expression Bodies

As **Expression Bodies** (também chamadas de funções de uma única expressão) são uma forma extremamente concisa de declarar funções em Kotlin que realizam apenas uma única tarefa ou cálculo.

- **Sintaxe Simplificada**: Se o corpo de uma função possui apenas uma única expressão, você pode eliminar completamente as chaves `{}` e a palavra-chave `return`.
- **Uso do** **=**: Substituímos as chaves pelo operador de atribuição =.
- **Inferência do Tipo de Retorno**: O compilador do Kotlin analisa a expressão e infere automaticamente o tipo de retorno. Por isso, você pode omitir a declaração do tipo (como `: Int` ou `: String`). _Nota: essa omissão de tipo de retorno só é permitida em expression bodies; se você usar o corpo em bloco tradicional com chaves_ _{}__, a declaração do tipo de retorno e o uso de_ _return_ _continuam obrigatórios__._

```kotlin
fun ehPar(numero: Int) = if (2*(numero/2)==numero) "Par" else "Impar" 

fun main() {
    println(ehPar(9))
}
```

Poderia ser feito usando o operador de resto `%`.

## **Unit (o equivalente ao** `void`**)**

No Kotlin, quando uma função não retorna nenhum valor útil (ou seja, ela apenas realiza uma ação, como imprimir um texto), o tipo de seu retorno é **Unit**.

- **Equivalente ao** `void` **:** Ele faz o mesmo papel do `void` em Java, C ou C++.
- **É um objeto real:** Ao contrário do `void` tradicional, `Unit` é um tipo real com uma única instância (um objeto real no Kotlin).
- **Opcional na escrita:** Você pode declarar `: Unit` explicitamente na assinatura da função, mas o Kotlin permite que você o **omita completamente**. Se você não especificar o tipo de retorno, o compilador já entende que é `Unit`.

