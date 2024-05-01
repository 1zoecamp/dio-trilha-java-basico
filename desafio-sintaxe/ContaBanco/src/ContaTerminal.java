import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Por favor, digite seu nome:");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite seu sobrenome:");
            String sobrenomeCliente = scanner.next();
            
            System.out.println("Informe o número da sua agência:");
            String agencia = scanner.next();
            
            System.out.println("Agora digite a sua conta:");
            String conta = scanner.next();
            
            System.out.println("Para fechar, digite seu saldo:");
            double saldo = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        }

}
