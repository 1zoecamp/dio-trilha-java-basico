import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite o salário");
            double salario = scanner.nextDouble();

            System.out.println("Digite o benefício");
            double beneficio = scanner.nextDouble();

            double salarioCalculado = descontarImposto(salario) + beneficio;
            System.out.println("O salário calculado é R$ " + salarioCalculado);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira um salário válido.");
        }
    }

    public static double descontarImposto(double salario) {
        double salarioDescontado = 0.00;

        if (salario > 0 && salario <= 1100) {
            salarioDescontado = salario * 0.95;
        } else if (salario >= 1100.01 && salario <= 2500) {
            salarioDescontado = salario * 0.90;

        } else if (salario >= 1100.01 && salario <= 2500) {
            salarioDescontado = salario * 0.85;

        } else {
            System.out.println("Informe um valor válido");
        }
        ;
        return salarioDescontado;
    }
}
