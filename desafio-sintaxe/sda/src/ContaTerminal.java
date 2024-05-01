import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Por favor, digite seu nome completo:");
            String nomeCliente = scanner.next();
            
            System.out.println("Informe o número da sua agência:");
            int agencia = scanner.nextInt();
            
            System.out.println("Agora digite a sua conta:");
            String conta = scanner.next();
            
            System.out.println("Para fechar, digite seu saldo:");
            double saldo = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque");
        }

    }
}
