package br.com.ebix.model;

public class Seguro {

	private String seguro;
	private Double valor;

	public Seguro() {
	}

	public Seguro(String seguro, Double valor) {
		super();
		this.seguro = seguro;
		this.valor = valor;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
