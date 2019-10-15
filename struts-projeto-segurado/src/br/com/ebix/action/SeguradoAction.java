package br.com.ebix.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.ebix.model.Segurado;
import br.com.ebix.persistence.SeguradoDao;

public class SeguradoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String correntista;
	private String diasVisita;
	private Segurado segurado;
	private List<Segurado> seguradoLista;
	
	
	private String data_nasc;

	public String execute() throws Exception {
		Segurado s = new Segurado(nome, cpf, rg, sexo, correntista, diasVisita, data_nasc);
		SeguradoDao sd = new SeguradoDao();

		try {
			sd.salvar(s);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	public String listar() throws Exception {
		SeguradoDao dao = new SeguradoDao();
		setSeguradoLista(dao.findAll());
		return SUCCESS;

	}

	public String find() throws Exception {
		SeguradoDao sd = new SeguradoDao();

		try {
			this.segurado = sd.findById(id);
			nome = this.segurado.getNome();
			cpf = this.segurado.getCpf();
			rg = this.segurado.getRg();
			sexo = this.segurado.getSexo();
			correntista = this.segurado.getCorrentista();
			diasVisita = this.segurado.getDiasVisita();
			System.out.println(this.segurado);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	public String delete() throws Exception {
		SeguradoDao sd = new SeguradoDao();

		try {
			sd.deletar(id);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.apagaseguro"));
			return ERROR;
		}
	}

	public String update() throws Exception {
		try {
			SeguradoDao sd = new SeguradoDao();
			this.setSegurado(sd.findById(id));

			if (this.segurado != null) {
				this.segurado = new Segurado(id, nome, cpf, rg, sexo, correntista, diasVisita, data_nasc);
				sd.update(this.segurado);
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return INPUT;
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

	

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public List<Segurado> getSeguradoLista() {
		return seguradoLista;
	}

	public void setSeguradoLista(List<Segurado> seguradoLista) {
		this.seguradoLista = seguradoLista;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Segurado getSegurado() {
		return segurado;
	}

	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}

}
