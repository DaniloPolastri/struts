package br.com.ebix.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.ebix.model.Seguro;
import br.com.ebix.persistence.SeguroDao;

public class ListarSeguroAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private List<Seguro> seguroLista;

	public String execute() throws Exception {
		SeguroDao dao = new SeguroDao();
		seguroLista = dao.findAll();
		return SUCCESS;
		
	}

	public List<Seguro> getSeguroLista() {
		return seguroLista;
	}

	public void setSeguroLista(List<Seguro> seguroLista) {
		this.seguroLista = seguroLista;
	}

}
