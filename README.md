# Lista 1 -- Teoria da Computação / Linguagens Formais e Autômatos -- 2024/2

**Introdução à Teoria da Computação & Fundamentos Matemáticos**

**Autor:** Matheus Jagi

## Problema 2
Este problema pede a construção de uma função que receba como entrada uma sequence de parênteses $sequence$ fornecendo como resultado a informação se a sequence está balanceada, ou seja, se para cada parêntese aberto (' existe um fechado )'.

## Solução
A solução adotada foi criar uma função recursiva de cauda fornecendo o primeiro caracter da sequence para incrementar um balanceador `balance` para somar quando parêntese aberto (' e diminuir quando parêntese fechado )', onde, caso o balanceador esteja igual a 0 (zero), a sequencia está balanceada (condição de parada).

## Executando...

### Usando o Scala Prompt

Para executar a solução diretamente no prompt do Scala, use o seguinte comando (supondo que a função esteja no arquivo `FormedParenthese.scala`):

```scala
wellFormedParenthesesCounter("(()(((()()()))")
```

### Para executar usando o SBT
```bash
sbt run
``` 

O programa pedirá a sequencia a ser verificada:

```bash
Informe a sequencia de parenteses:
())((()(())()()()(()))(((()))) --> Digite a sequencia desejada
```

O programa terá como saida o resultado abaixo:
```bash
A expressao esta bem formada.
```

caso contrário

```bash
A expressao nao esta bem formada.
```