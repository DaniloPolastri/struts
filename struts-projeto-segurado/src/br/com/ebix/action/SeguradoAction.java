package br.com.ebix.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import br.com.ebix.model.Segurado;
import br.com.ebix.persistence.SeguradoDao;

public class SeguradoAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String correntista; 
	private String diasVisita; 
	private Date dataDeCadastro;
	private Date dataDeAlteracao;
	private String data_nasc;
	
	
	public String execute() throws Exception {
		Segurado s = new Segurado(nome, cpf, rg, sexo, correntista, diasVisita, dataDeCadastro, dataDeAlteracao, data_nasc);
		SeguradoDao sd = new SeguradoDao();

		try {
			sd.salvar(s);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
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
