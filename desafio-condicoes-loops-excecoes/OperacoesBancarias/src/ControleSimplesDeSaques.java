import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;


        // TODO: Crie um loop 'for' para iterar sobre os saques:

        while (limiteRestante > 0 ) {
            // TODO: Solicite ao usuário o valor do saque:
            double saque = scanner.nextDouble();

            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o
            // limiteDiario;
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                limiteRestante = 0;
            } else {
                if (saque <= limiteRestante) {
                    // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor
                    // do saque do limite diário:
                    limiteRestante = limiteRestante - saque;
                    // TODO: Informe que o saque foi realizado e mostre o limite restante:
                    System.out.println("Saque realizado. Limite restante: " + limiteRestante);
                } else {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    limiteRestante = 0;
                }
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
