package br.com.ebix.model;

public class DiaSegurado {
	
	private Segurado segurado;
	private Dia dia;
	
	public DiaSegurado() {}

	public DiaSegurado(Segurado segurado, Dia dia) {
		super();
		this.segurado = segurado;
		this.dia = dia;
	}

	public Segurado getSegurado() {
		return segurado;
	}

	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "DiaSegurado [segurado=" + segurado + ", dia=" + dia + "]";
	}
	
	
	
}
