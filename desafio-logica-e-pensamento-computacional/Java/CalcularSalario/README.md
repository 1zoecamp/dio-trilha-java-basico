## Desafio
> Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.

- Para realizar o cálculo, receba o valor bruto do salário e o adicional dos benefícios.
	
- O salário a ser transferido é calculado da seguinte maneira:

```

(valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios

```

- Para calcular o **percentual de imposto**, segue as alíquotas:
    - De R$ 0,00 a R$ 1100,00 = 5,00%
    - De R$ 1100,01 a R$ 2500,00 = 10,00%
    - Maior que R$ 2500,00 = 15%

### Entrada
> A entrada consiste em vários arquivos de teste, que conterão o ==valor bruto do salário e adicional de benefícios==.

### Saída
> Para cada arquivo da entrada, terá um arquivo de saída. E como mencioado no desafio, será gerado umas linha com um número que será a diferença entre o valor bruto do salário e o percentual de imposto mediante a faixa salarial somado com o adicional de benefícios.

Use o exemplo abaixo para clarear o que está sendo pedido

| Entrada | Saída   |
| ------- | ------- |
| 2000    | 2050,00 |
| 250     |         |
