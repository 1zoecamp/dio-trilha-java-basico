package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	// attributes
	private LocalDate data;
	
	// constructor
	public Mentoria() {
	}
	
	// methods
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}
	
	// getters, setters, toString
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + 
				", descricao=" + getDescricao() + 
				", data=" + data + "]";
	}
	
	
	
}