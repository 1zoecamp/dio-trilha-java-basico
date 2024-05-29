package funcionalidades.reprodutor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ITunes implements ReprodutorMusical{
	public void tocar() {
		System.out.println("Tocando faixas de música");
		
	}
	public void pausar() {
		System.out.println("Reprodução pausada");
		
	}
	public void selecionarMusica(String musica) {
		System.out.println("Faixa " + musica + " selecionada");
		
	}
	public void iniciarReprodutorMusical() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("iTunes iniciado. O que você deseja fazer? 1- selecionar música; 2- tocar; 3- pausar");
		int entradaUsuario = scanner.nextInt();
		
		switch (entradaUsuario) {
        case 1:
            try {
                System.out.println("Digite o nome da música: ");
                String musica = scanner.next();
                selecionarMusica(musica);
               
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Tente novamente");
            }
            break;

        case 2:
            tocar();
            break;

        case 3:
           pausar();
            break;
    }
		scanner.close();
		
		
	}
}
