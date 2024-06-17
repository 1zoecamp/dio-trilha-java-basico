package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	//attribute
	private String titulo;
	private String descricao;
	
	//constants
	protected static final double XP_PADRAO = 10d;
	
	//methods 
	public abstract double calcularXP();
	
	//getters and setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
