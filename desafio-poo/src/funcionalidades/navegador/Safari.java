package funcionalidades.navegador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Safari implements NavegadorInternet{
		public void exibirPagina(String url) {
			System.out.println("Exibindo página " + url);
			
		}
		public void adicionarNovaAba() {
			System.out.println("Nova aba adicionada");
		}
		public void atualizarPagina() {
			System.out.println("Página atualizada");
		}

		public void iniciarNavegadorInternet() {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Safari iniciado. O que você deseja fazer? 1- exibir página; 2- adicionar nova aba; 3- atualizar página");
			int entradaUsuario = scanner.nextInt();
			
			switch (entradaUsuario) {
	        case 1:
	            try {
	                System.out.println("Digite a url:");
	                String url = scanner.next();
	                exibirPagina(url);
	               
	            } catch (InputMismatchException e) {
	                System.out.println("Valor inválido. Tente novamente");
	            }
	            break;

	        case 2:
	            adicionarNovaAba();
	            break;

	        case 3:
	           atualizarPagina();
	            break;
	    }
			scanner.close();
			
		}
}
