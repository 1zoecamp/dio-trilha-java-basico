import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class OperacoesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0.00;

        Map<Integer, String> operacoes = new HashMap<>();
        operacoes.put(1, "Depositar");
        operacoes.put(2, "Sacar");
        operacoes.put(3, "Consultar saldo");
        operacoes.put(4, "Encerrar");

        try {

            System.out.println("Olá! Selecione uma das operações abaixo:");
            for (Map.Entry<Integer, String> entry : operacoes.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue());
            }
            ;

            int entradaUsuario = scanner.nextInt();
            avaliarEntradaUsuario(entradaUsuario, operacoes);

            if (entradaUsuario != 4) {
                System.out.println("A opção selecionada foi " + operacoes.get(entradaUsuario));
            }

            iniciarOperacoesBancarias(entradaUsuario, saldo);
            System.out.println("Programa encerrado");
            scanner.close(); 

        } catch (SelecaoInvalidaException | InputMismatchException e) {
            System.out.println("Opção inválida. Tente novamente");
        }

    }

    public static void iniciarOperacoesBancarias(int entradaUsuario, double saldo){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        switch (entradaUsuario) {
            case 1:
                try {
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = scanner.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.println("Depósito realizado. Saldo atual: R$ " + saldo);
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido. Tente novamente");
                }
                break;

            case 2:
                try {

                    System.out.println("Digite o valor do saque:");
                    double valorSaque = scanner.nextDouble();

                    if (saldo >= valorSaque) {
                        saldo = saldo - valorSaque;
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido. Tente novamente");
                    break;
                }

            case 3:
                System.out.println("O saldo atual é R$ " + saldo);
                break;

            case 4:
                break;
        }
    }

    public static void avaliarEntradaUsuario(int operacao, Map<Integer, String> operacoes)
            throws SelecaoInvalidaException {
        if (!operacoes.containsKey(operacao)) {
            throw new SelecaoInvalidaException();
        }
    }
}
