package funcionalidades.telefone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Phone implements AparelhoTelefonico{
	
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
	}
	public void atender() {
		System.out.println("Atendendo a chamada");
	}
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");
	}

	public void iniciarAparelhoTelefonico() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Telefone iniciado. O que você deseja fazer? 1- ligar para um número; 2- atender chamada; 3- iniciar correio de voz");
		int entradaUsuario = scanner.nextInt();
		
		
		switch (entradaUsuario) {
        case 1:
            try {
                System.out.println("Digite o número: ");
                String numero = scanner.next();
                ligar(numero);
               
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Tente novamente");
            }
            break;

        case 2:
            atender();
            break;

        case 3:
           iniciarCorreioDeVoz();
            break;
    }
		scanner.close();
		
	}

}
