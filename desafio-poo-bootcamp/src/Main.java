import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java 1");
		curso1.setDescricao("Descrição do curso Java 1");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Java 2");
		curso2.setDescricao("Descrição do curso Java 2");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Mentoria para o curso Java");
		mentoria.setData(LocalDate.now());
		
		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("Conteúdos Concluídos" + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularXp());
		
		Dev devMariana = new Dev();
		devMariana.setNome("Mariana");
		devMariana.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devMariana.getConteudosInscritos());
		devMariana.progredir();
		devMariana.progredir();		
		devMariana.progredir();		
		System.out.println("Conteúdos Inscritos" + devMariana.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos" + devMariana.getConteudosConcluidos());
		System.out.println("XP: " + devMariana.calcularXp());
		
		
	}
}
