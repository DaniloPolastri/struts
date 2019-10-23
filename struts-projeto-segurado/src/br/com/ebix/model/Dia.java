package br.com.ebix.model;

public class Dia {
	
	private Integer id;
	private String dia;
	
	public Dia() {}
	
	public Dia(Integer id, String dia) {
		super();
		this.id = id;
		this.dia = dia;
	}
	public Dia(String dia) {
		super();
	
		this.dia = dia;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Dia [id=" + id + ", dia=" + dia + "]";
	}
	
	
}
