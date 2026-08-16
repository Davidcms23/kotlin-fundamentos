
## 1. Caixa eletrônico
Crie uma função `sacar(valor: Int): String` que simula a dispensa de cédulas de um caixa eletrônico (considere notas de 100, 50, 20 e 10). Usando `while` e o operador `%`, calcule quantas cédulas de cada valor são necessárias e monte uma `String` de resultado (ex: `"2x100, 1x50, 1x10"`). Se o valor não for múltiplo de 10, retorne `"Valor inválido"`.

(Resposta)[https://github.com/Davidcms23/kotlin-fundamentos/blob/main/Camada%201%20-%20Kotlin/exerc%C3%ADcios/ex01.kt]

## 2. Jogo de adivinhação (sem input real)
Crie uma função `jogarAdivinhacao(secreto: Int, chutes: IntArray): String` que recebe o número secreto e um array fixo de tentativas (simulando um jogador). Percorra os chutes com `for`, e para cada um informe se é "Maior", "Menor" ou "Acertou!" — ao acertar, pare o loop (`break`) e retorne em quantas tentativas o jogador acertou.

## 3. Conversor de temperatura com menu simulado
Crie uma função `converter(valor: Double, modo: String): Double` que converte Celsius↔Fahrenheit dependendo do `modo` (`"C_PARA_F"` ou `"F_PARA_C"`), usando `when`. Em `main`, simule um "menu" com `do-while`: uma lista fixa de conversões a processar, e o loop só para quando uma `var contador` atinge o tamanho da lista.

## 4. Escadinha de FizzBuzz modificado
Implemente uma função `fizzBuzzCustom(ate: Int, palavra1: String, divisor1: Int, palavra2: String, divisor2: Int)` — uma versão parametrizável do clássico FizzBuzz. Para números múltiplos de `divisor1`, imprime `palavra1`; múltiplos de `divisor2`, imprime `palavra2`; múltiplos de ambos, imprime as duas palavras juntas; senão, imprime o próprio número. Teste com valores diferentes dos tradicionais "Fizz"/"Buzz" (ex: "Ping"/7, "Pong"/4).

## 5. Termômetro de senha
Crie uma função `forcaDaSenha(tamanho: Int, temNumero: Boolean, temMaiuscula: Boolean): String` que calcula uma "pontuação" de força (comece com 0 e some pontos por cada critério satisfeito, usando `if`) e retorne "Fraca", "Média" ou "Forte" com base na pontuação total (`when` com intervalos). Teste a função com pelo menos 4 combinações diferentes de parâmetros.

## 6. Simulador de elevador
Crie uma função `moverElevador(andarAtual: Int, andarDestino: Int): Unit` que usa `while` para simular o elevador subindo ou descendo um andar por vez (incrementando ou decrementando conforme a direção, decidida com `if`), imprimindo cada andar percorrido até chegar ao destino. Se `andarAtual == andarDestino`, imprima diretamente "Já está no andar".

## 7. Calculadora de IMC com classificação
Crie uma função `calcularIMC(peso: Double, altura: Double): Double` (expression body) e outra função `classificarIMC(imc: Double): String` que usa `when` com `in` para retornar a categoria (Abaixo do peso, Normal, Sobrepeso, Obesidade). Em `main`, crie três perfis diferentes (nome, peso, altura como variáveis) e, usando `for` sobre um `IntArray` de índices ou repetição manual, imprima o relatório de cada perfil chamando as duas funções.

## 8. Sequência de Collatz
Crie uma função `collatz(numeroInicial: Int): Int` que aplica a conjectura de Collatz (se par, divide por 2; se ímpar, multiplica por 3 e soma 1) repetidamente com `while`, até o número chegar a 1, contando e retornando quantos passos foram necessários. Em `main`, teste a função com um `for` para os números de 1 a 15, imprimindo `"O número X levou Y passos"` para cada um.

## 9. Validador de triângulo
Crie uma função `tipoDeTriangulo(a: Double, b: Double, c: Double): String` que primeiro verifica (com `if`) se os três lados formam um triângulo válido (a soma de quaisquer dois lados deve ser maior que o terceiro) — se não formar, retorne `"Não é um triângulo"`. Se for válido, use `when` para classificar em "Equilátero", "Isósceles" ou "Escaleno".

## 10. Simulador de caixa de supermercado
Crie uma função `finalizarCompra(valorTotal: Double, formaPagamento: String): String` que aplica desconto conforme a forma de pagamento (`when`): "PIX" → 10% de desconto, "DEBITO" → 5%, "CREDITO" → sem desconto, qualquer outro valor → retorna `"Forma de pagamento inválida"`. Em `main`, simule um `do-while` que processa uma "fila" de 5 compras fixas (valores e formas de pagamento diferentes numa lista simples), somando o total gasto pela loja em uma `var totalArrecadado` e imprimindo o resumo ao final.
