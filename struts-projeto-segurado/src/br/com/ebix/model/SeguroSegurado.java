package br.com.ebix.model;

public class SeguroSegurado {
	
	private Segurado segurado;
	private Seguro seguro;
	
	
	public SeguroSegurado() {
		
	}
	
	public SeguroSegurado(Segurado segurado, Seguro seguro) {
		super();
		this.segurado = segurado;
		this.seguro = seguro;
	}
	
	public Segurado getSegurado() {
		return segurado;
	}
	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}
	public Seguro getSeguro() {
		return seguro;
	}
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "SeguroSegurado [segurado=" + segurado + ", seguro=" + seguro + "]";
	}
}
