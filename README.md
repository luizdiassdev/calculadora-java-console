# Calculadora Científica em Java (console)

Calculadora de linha de comando feita em Java, com operações básicas e científicas. O projeto foi criado para praticar a lógica de programação: variáveis, estruturas condicionais, `switch`, métodos e uso da classe `Math`.

## Por que fiz este projeto

Ao procurar calculadoras em Java no GitHub, a maioria dos projetos que encontrei tinha só as quatro operações básicas. Para fazer algo um pouco mais completo, decidi acrescentar porcentagem, raiz, potência, funções trigonométricas, logaritmos e o valor de PI.

## Operações disponíveis

Ao rodar o programa, você digita o símbolo da operação desejada:

- `+` soma
- `-` subtração
- `x` multiplicação
- `/` divisão (com aviso de erro ao dividir por zero)
- `%` porcentagem (informe a porcentagem e depois o número: 10% de 200 resulta em 20)
- `r` raiz quadrada
- `p` potência (informe a base e depois o expoente)
- `sen` seno
- `cos` cosseno
- `tan` tangente
- `pi` valor de PI
- `log` logaritmo natural (base e)
- `log10` logaritmo na base 10

Os ângulos de `sen`, `cos` e `tan` são informados em **graus** e convertidos para radianos antes do cálculo.

## Como funciona

1. O programa mostra o menu e lê a operação digitada.
2. Dentro do `switch`, cada operação pede só os números de que precisa: dois para as básicas, um para raiz, trigonometria e logaritmos, e nenhum para o PI.
3. O resultado é guardado em uma única variável e impresso no final.
4. Se a operação digitada não existir, o programa avisa "Opção inválida!" e encerra.

## O que pratiquei

- Entender que cada operação precisa de uma quantidade diferente de números: soma, subtração, multiplicação, divisão, porcentagem e potência pedem dois; raiz, seno, cosseno, tangente e logaritmos pedem um; o PI não pede nenhum. Por isso o programa pergunta a operação primeiro e só depois lê os números que ela precisa
- Estrutura condicional com `switch`, `case`, `break` e `default`
- `if` e `else` para tratar a divisão por zero
- Escopo de variáveis (por que declarar fora do `switch` e inicializar com valor)
- Métodos estáticos para evitar repetição de código
- Sobrecarga de métodos: o `lerNumero` existe em duas versões, uma com mensagem fixa e outra com mensagem personalizada
- Classe `Math`: `sqrt`, `pow`, `sin`, `cos`, `tan`, `log`, `log10`, `toRadians` e `PI`
- Leitura de dados do teclado com `Scanner`

## Como executar

1. Tenha o JDK (Java Development Kit) instalado.
2. Clone este repositório.
3. Abra o projeto em uma IDE (Eclipse, IntelliJ, VS Code) e execute a classe `Calculadora_Project`.

Ou, pelo terminal, a partir da pasta `src`:

```bash
javac Project_Calc/Calculadora_Project.java
java Project_Calc.Calculadora_Project
```

## Limitações e melhorias futuras

- O programa faz uma operação e encerra; falta um laço para permitir várias contas seguidas
- Se o usuário digitar letras onde deveria ser número, o programa encerra com erro
- O `log` e o `log10` não tratam zero nem números negativos
- Futuramente, reescrever usando Programação Orientada a Objetos, com cada operação em uma classe

## Autor

Devluiz, estudante de Engenharia de Software em busca de uma carreira em desenvolvimento back-end.