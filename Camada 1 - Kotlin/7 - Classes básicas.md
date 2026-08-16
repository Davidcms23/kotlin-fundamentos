
https://play.kotlinlang.org/

## **Class simples com propriedades e métodos**

No Kotlin, uma classe é definida usando a palavra-chave `class`. As características da classe (propriedades) podem ser declaradas de forma muito concisa diretamente no "cabeçalho" (construtor primário) entre parênteses `()`. Já os comportamentos (métodos) são funções normais declaradas dentro do corpo da classe, delimitado por chaves `{}`.

```kotlin
// Classe com duas propriedades (nome imutável e idade mutável) e um método
class Cachorro(val nome: String, var idade: Int) {
    fun latir() {
        println("$nome diz: Au Au!")
    }
}

fun main() {
    // Criando uma instância da classe (objeto) sem usar a palavra "new" [6, 7]
    val meuPet = Cachorro("Rex", 3)
    
    // Acessando propriedades e chamando o método [4]
    println("Nome: ${meuPet.nome}, Idade: ${meuPet.idade}")
    meuPet.latir()
}
```

```kotlin
class ContaBancaria(val titular: String, var saldo: Double){
    fun depositar(valor: Double) {
        saldo += valor
    }
}

fun main() {
    val conta = ContaBancaria("David", 0.0)
    conta.depositar(2500.0)
    println("Conta ${conta.titular}, Saldo ${conta.saldo}")
}
```

## **Data Classes (Classes de Dados)**

No Kotlin, quando criamos uma classe cuja finalidade principal é apenas armazenar dados, podemos marcá-la com a palavra-chave **data**.

Ao fazer isso, o compilador Kotlin gera de forma automática ("de graça") métodos utilitários essenciais baseados nas propriedades declaradas no construtor primário:

1. **toString()**: Retorna uma representação em texto amigável e legível contendo os nomes e valores das propriedades.
2. **equals()** **(ou operador** **$==$** **)**: Compara se dois objetos são estruturalmente idênticos (têm os mesmos dados), em vez de apenas verificar se apontam para o mesmo endereço de memória.
3. **copy()**: Cria uma cópia exata do objeto, permitindo alterar apenas as propriedades que você desejar durante o processo.
4. **hashCode()**: Gera um código hash consistente para que a classe funcione perfeitamente em estruturas de dados como conjuntos e mapas.

_Regra de sintaxe:_ Para ser uma `data class`, o construtor primário precisa de pelo menos um parâmetro e todos eles devem ser declarados obrigatoriamente com **val** ou **var**.

```kotlin
data class Produto(val nome: String, val preco: Double)

fun main() {
    val p1 = Produto("Celular", 1500.0)
    val p2 = Produto("Celular", 1500.0)
    
    // toString() automático
    println(p1) // Saída: Produto(nome=Celular, preco=1500.0)
    
    // equals() automático (compara valores, não referências)
    println(p1 == p2) // Saída: true
    
    // copy() automático mudando apenas o preço
    val p3 = p1.copy(preco = 1300.0)
    println(p3) // Saída: Produto(nome=Celular, preco=1300.0)
}
```

```kotlin
data class Livro(val titulo: String, val autor: String)

fun main() {
    val livro1 = Livro("Harry Potter", "Byron")
    
    val livro2 = livro1.copy(titulo = "Turma da Mônica")
    
    println("$livro1\n$livro2")
}
```