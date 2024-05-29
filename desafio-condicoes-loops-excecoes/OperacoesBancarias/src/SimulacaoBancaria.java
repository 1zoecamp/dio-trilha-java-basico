import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.InputMismatchException;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        Boolean encerrarPrograma = false;

        Map<Integer, String> operacoes = new HashMap<>();
        operacoes.put(1, "Depositar");
        operacoes.put(2, "Sacar");
        operacoes.put(3, "Consultar saldo");
        operacoes.put(0, "Encerrar");

        while (!encerrarPrograma) {
            /* System.out.println("Selecione uma das operações abaixo:");
            for (Map.Entry<Integer, String> entry : operacoes.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue());
            } */

            int entradaUsuario = scanner.nextInt();

            /* System.out.println("A opção selecionada foi " + operacoes.get(entradaUsuario)); */
            switch (entradaUsuario) {
                case 1:
                    try {
                        /* System.out.println("Digite o valor do depósito:"); */
                        double valorDeposito = scanner.nextDouble();
                        saldo = saldo + valorDeposito;
                        System.out.println("Saldo atual: " + saldo);

                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido. Tente novamente");
                    }
                    break;

                case 2:
                    try {

                        /* System.out.println("Digite o valor do saque:"); */
                        double valorSaque = scanner.nextDouble();

                        if (saldo >= valorSaque) {
                            saldo = saldo - valorSaque;
                            System.out.println("Saldo atual: " + saldo);

                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido. Tente novamente");
                        break;
                    }

                case 0:
                    encerrarPrograma = true;
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            ;
        }
        System.out.println("Programa encerrado.");

    }
}
