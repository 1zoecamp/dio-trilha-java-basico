package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	//attributes
	private int cargaHoraria;
	
	// methods
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	//getters, setters, toString
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + 
				", descricao=" + getDescricao() + 
				", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
}
