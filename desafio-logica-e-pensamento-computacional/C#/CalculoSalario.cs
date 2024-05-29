using System;

public class Desafio
{
    public static void Main()
    {
        float salario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine());

        float salarioDescontado = 0;

        if (salario > 0 && salario <= 1100)
        {
            salarioDescontado = salario * 0.95;
        }
        else if (salario >= 1100.01 && salario <= 2500)
        {
            salarioDescontado = salario * 0.90;

        }
        else if (salario >= 1100.01 && salario <= 2500)
        {
            salarioDescontado = salario * 0.85;

        }
        else
        {
            System.out.println("Informe um valor válido");
        }
    }

    float salarioCalculado = salarioDescontado + valorBeneficios;
    Console.WriteLine("O salário calculado é de R$ " + salarioCalculado)
}