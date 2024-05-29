def calcular_imposto(salario, beneficio):
    salarioDescontado = 0

    if (salario > 0 and salario <= 1100):
        salarioDescontado = salario * 0.95
    elif (salario >= 1100.01 and salario <= 2500):
        salarioDescontado = salario * 0.9
    elif (salario >= 1100.01 and salario <= 2500):
        salarioDescontado = salario * 0.85
    else:
        print("O salário informado é inválido")

    salarioCalculado = salarioDescontado + beneficio
    print("O salário calculado é R$ " + str(salarioCalculado))

print("Digite o salário:")
valor_salario = float(input())

print("Digite o benefício:")
valor_beneficio = float(input())

calcular_imposto(valor_salario, valor_beneficio)