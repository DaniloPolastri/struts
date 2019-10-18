package br.com.ebix.persistence;

import java.sql.SQLException;

public class SeguroSeguradoDao extends ConnectionFactory {

	public boolean salvar(int idsegurado, int idseguro) {

		try {
			abrirConexao();
			ps = conexao.prepareStatement("insert into seguros_segurados (idsegurado, idseguro) values (?, ?)");
			ps.setInt(1, idsegurado);
			ps.setInt(2, idseguro);

			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("Execption: " + e.getMessage());
			return false;
		} finally {
			fechaConexao();
		}

	}

	public boolean deletarPorSeguro(int idseguro) {
		try {
			abrirConexao();
			ps = conexao.prepareStatement("Delete from seguros_segurados where idseguro = " + idseguro + "; ");
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("Execption: " + e.getMessage());
			return false;
		} finally {
			fechaConexao();
		}
	}

	public boolean deletarPorSegurado(int idsegurado) {
		try {
			abrirConexao();
			ps = conexao.prepareStatement("Delete from seguros_segurados where idsegurado = " + idsegurado + "; ");
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("Execption: " + e.getMessage());
			return false;
		} finally {
			fechaConexao();
		}
	}
	
	
	// CRÉDITO LUIZ https://github.com/LuizAltimari/
}
