package br.com.ebix.model;

import java.sql.Timestamp;
import java.util.Date;

public class Segurado {

	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String correntista;
	private String diasVisita;
	private Date DataCadastro;
	private Date dataDeAlteracao;
	private String data_nasc;

	public Segurado() {
	}

	public Segurado(Integer id, String nome, String cpf, String rg, String sexo, String correntista, String diasVisita,
			Date dataCadastro, Date dataDeAlteracao, String data_nasc) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.correntista = correntista;
		this.diasVisita = diasVisita;
		this.DataCadastro = dataCadastro;
		this.dataDeAlteracao = dataDeAlteracao;
		this.data_nasc = data_nasc;
	}
	
	public Segurado(String nome, String cpf, String rg, String sexo, String correntista, String diasVisita, String data_nasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.correntista = correntista;
		this.diasVisita = diasVisita;
	
		this.data_nasc = data_nasc;
	}
	
	

	public Segurado(Integer id, String nome, String cpf, String rg, String sexo, String correntista, String diasVisita,
			String data_nasc) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.correntista = correntista;
		this.diasVisita = diasVisita;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataCadastro() {
		return DataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		DataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Segurado [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo
				+ ", correntista=" + correntista + ", diasVisita=" + diasVisita + ", DataCadastro=" + DataCadastro
				+ ", dataDeAlteracao=" + dataDeAlteracao + ", data_nasc=" + data_nasc + "]";
	}
	
	

}
