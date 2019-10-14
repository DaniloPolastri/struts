package br.com.ebix.action;

import com.opensymphony.xwork2.ActionSupport;

import br.com.ebix.model.Seguro;
import br.com.ebix.persistence.SeguroDao;

public class SeguroAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private String seguro;
	private Double valor;

	public String execute() throws Exception {
		Seguro s = new Seguro(seguro, valor);
		SeguroDao sd = new SeguroDao();

		try {
			sd.salvar(s);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
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
