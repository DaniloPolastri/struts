package br.com.ebix.test;

import br.com.ebix.model.Seguro;
import br.com.ebix.persistence.SeguradoDao;
import br.com.ebix.persistence.SeguroDao;
import br.com.ebix.persistence.SeguroSeguradoDao;

public class Teste {
	public static void main(String[] args) throws Exception {
		
		SeguroSeguradoDao dao = new SeguroSeguradoDao();
		Seguro s = new Seguro("BRADESCO", 300.00);
		SeguroDao daoSeguro = new SeguroDao();
		SeguradoDao daoSegurado = new SeguradoDao();
//		dao.salvar(s);
//		

//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//		
//		Segurado seg = new Segurado("Danilo", "14941705742", "54448778", "masculino", "Sim", "15/11/2019", formatter.parse("11/05/2019"), formatter.parse("11/05/2019"), "11/02/2015");
//		daoseg.salvar(seg);
		


//		
//		List<Seguro> result = dao.findAll();
//		System.out.println(result);
//		System.out.println(dao.findById(2));
//		dao.deletar(2);
//		System.out.println(dao.findById(2));
		

//		System.out.println(dao.findById(2));
//		dao.deletar(2);
//		System.out.println(dao.findById(2));
		
		
		
//		if(dao.salvar(2, 32)) {
//			System.out.println("Salvou");
//		} else {
//			System.out.println("Nao foi");
//		}
		
		System.out.println(daoSegurado.findAll());
		System.out.println(daoSeguro.findAllByName());
		
	}
}
