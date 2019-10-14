package br.com.ebix.model;

import java.util.Date;

public class Segurado {
	
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String correntista; 
	private String diasVisita; 
	private Date dataDeCadastro;
	private Date dataDeAlteracao;
	private String data_nasc;
	
	public Segurado() {}

	public Segurado(String nome, String cpf, String rg, String sexo, String correntista,
			String diasVisita, Date dataDeCadastro, Date dataDeAlteracao, String data_nasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.correntista = correntista;
		this.diasVisita = diasVisita;
		this.dataDeCadastro = dataDeCadastro;
		this.dataDeAlteracao = dataDeAlteracao;
		this.data_nasc = data_nasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public String getDiasVisita() {
		return diasVisita;
	}

	public void setDiasVisita(String diasVisita) {
		this.diasVisita = diasVisita;
	}

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public Date getDataDeAlteracao() {
		return dataDeAlteracao;
	}

	public void setDataDeAlteracao(Date dataDeAlteracao) {
		this.dataDeAlteracao = dataDeAlteracao;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	
}
