package br.com.ebix.persistence;

import java.sql.SQLException;

public class SeguroSeguradoDao extends ConnectionFactory{
	
	public boolean salvar(int idsegurado, int idseguro) {

		
		try {
			abrirConexao();
			String sql = "insert into seguros_segurados (idsegurado, idseguro) values (?, ?)";
			ps = conexao.prepareStatement(sql);
			ps.setInt(1, idsegurado);
			ps.setInt(2, idseguro);

			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Execption: " + e.getMessage());
			return false;
		} finally {
			fechaConexao();
		}
	}
}
