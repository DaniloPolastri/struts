package br.com.ebix.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.ebix.model.Segurado;
import br.com.ebix.model.Seguro;
import br.com.ebix.persistence.SeguradoDao;
import br.com.ebix.persistence.SeguroDao;

public class Teste {
	public static void main(String[] args) throws Exception {
//
//		Seguro s = new Seguro("BRADESCO", 300.00);
//		SeguroDao dao = new SeguroDao();
//		
//		dao.salvar(s);
//		

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		SeguradoDao daoseg = new SeguradoDao();
		Segurado seg = new Segurado("Danilo", "14941705742", "54448778", "masculino", "Sim", "15/11/2019", formatter.parse("11/05/2019"), formatter.parse("11/05/2019"), "11/02/2015");
		daoseg.salvar(seg);
	}
}
