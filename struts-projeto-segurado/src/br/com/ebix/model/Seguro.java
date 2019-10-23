package br.com.ebix.model;

public class Seguro {
	
	private Integer id;
	private String seguro;
	private Double valor;

	public Seguro() {
	}

	
	public Seguro(String seguro, Double valor) {
		this.seguro = seguro;
		this.valor = valor;
	}
	public Seguro(Integer id, String seguro, Double valor) {
		this.id = id;
		this.seguro = seguro;
		this.valor = valor;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Seguro [id=" + id + ", seguro=" + seguro + ", valor=" + valor + "]";
	}



	

	
	

}
