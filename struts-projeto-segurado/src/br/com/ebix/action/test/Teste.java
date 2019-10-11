package br.com.ebix.action.test;

import br.com.ebix.model.Seguro;
import br.com.ebix.persistence.SeguroDao;

public class Teste {
	public static void main(String[] args) throws Exception {

		Seguro s = new Seguro("BRADESCO", 300.00);
		SeguroDao dao = new SeguroDao();
		
		dao.salvar(s);
	}
}
