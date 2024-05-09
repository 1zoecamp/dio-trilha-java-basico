import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Digite o primeiro parâmetro");
            int parametro1 = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametro2 = scanner.nextInt();

            System.out.println("Os parâmetros informados foram " + parametro1 + " e " + parametro2);
            contarNumerosNoIntervalo(parametro1, parametro2);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    public static void contarNumerosNoIntervalo(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException();
        }
        for (int numero = parametro1 + 1; numero > parametro1 && numero <= parametro2; numero++) {
            System.out.println("Imprimindo o número " + numero);
        }
    }
}
