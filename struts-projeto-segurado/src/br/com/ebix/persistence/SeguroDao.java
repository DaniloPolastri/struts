package br.com.ebix.persistence;

import br.com.ebix.model.Seguro;

public class SeguroDao extends ConnectionFactory {

	public void salvar(Seguro s) throws Exception {

		try {
			abrirConexao();
			ps = conexao.prepareStatement("INSERT INTO seguros values (null,?,?)");
			ps.setString(1, s.getSeguro());
			ps.setDouble(2, s.getValor());
			ps.execute();
			fechaConexao();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}

