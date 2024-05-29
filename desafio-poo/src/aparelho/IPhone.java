package aparelho;

import java.util.Scanner;

import funcionalidades.navegador.Safari;
import funcionalidades.reprodutor.ITunes;
import funcionalidades.telefone.Phone;

public class IPhone{
	
	public static void main(String[] args) {
		ITunes iTunes = new ITunes();
		Phone phone = new Phone();
		Safari safari = new Safari();
		
		menuDeFuncionalidades(iTunes, phone, safari);	
	}
		

		private static void menuDeFuncionalidades(ITunes iTunes, Phone phone, Safari safari) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Selecione a funcionalidade: 1- telefone; 2- iTunes; 3- Safari");
			int entradaUsuario = scanner.nextInt();
			
			switch (entradaUsuario) {
	        case 1:
	        	phone.iniciarAparelhoTelefonico();
	            break;

	        case 2:
	        	iTunes.iniciarReprodutorMusical();
	            break;

	        case 3:
	        	safari.iniciarNavegadorInternet();
	            break;
	    }
			scanner.close();
			
		}
}
