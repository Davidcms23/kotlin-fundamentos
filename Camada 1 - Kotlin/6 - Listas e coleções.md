
https://play.kotlinlang.org/

## **List** **vs.** **MutableList**.

No Kotlin, as coleções são divididas explicitamente em duas categorias de acesso:

1. **List** **(Somente leitura / Imutável)**: Criada com a função **listOf()**. Você pode ler seus valores, mas não pode adicionar, remover ou alterar nenhum elemento após a criação.
2. **MutableList** **(Mutável)**: Criada com a função **mutableListOf()**. Permite que você modifique os elementos, adicione novos itens usando `.add()` ou remova-os.

```kotlin
fun main() {
    val frutas = listOf("Banana", "Maçã", "Pera")
    val numeros = mutableListOf(10, 20)
    numeros.add(30)
    
    println(numeros)
}
```


## **Iteração com o loop** **for**

No Kotlin, a maneira mais limpa e idiomática de percorrer os elementos de uma coleção é usando o loop **for** em conjunto com a palavra-chave **in**. A cada ciclo do loop, a variável declarada recebe o próximo elemento da sequência de forma automática. Essa variável temporária criada pelo próprio loop é de apenas leitura (ou seja, se comporta como um `val`).

```kotlin
fun main() {
   	val cidades = listOf("Natal", "Santa Maria", "Livramento")
	
    for(i in cidades){
        println("Você viajou para $i")
    }
}
```

## **Funções de Coleção (**`filter`**,** `map` **e** `forEach`**)**

O Kotlin oferece funções integradas extremamente poderosas para manipular coleções de forma funcional, sem a necessidade de escrever loops `for` manuais:

- **filter**: Filtra a lista com base em uma condição, mantendo apenas os elementos que retornam `true`.
- **map**: Transforma cada elemento da lista aplicando uma operação e gerando uma nova lista com os resultados.
- **forEach**: Executa uma ação (como um `println`) para cada elemento da lista.

Dentro dessas funções, usamos a palavra-chave **it** para nos referirmos ao elemento atual que está sendo processado.

```kotlin
fun main() {
	val numeros = listOf(1, 2, 3, 4, 5, 6)
    val filtrados = numeros.filter{it%2==0}
    val dobrados = filtrados.map{it*2}
	
    dobrados.forEach{println(it)}
}
```









