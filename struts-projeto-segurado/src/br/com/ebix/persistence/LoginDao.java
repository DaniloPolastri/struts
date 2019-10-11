package br.com.ebix.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.ebix.model.Login;

public class LoginDao extends ConnectionFactory {

	public boolean loginExiste(Login login) throws Exception {
		ResultSet rs;
		try {
			abrirConexao();
			String sql = "select usuario, senha from login where usuario = '" + login.getUsuario() + "' and senha = '"
					+ login.getSenha() + "';";
			ps = conexao.prepareStatement(sql);

			// stmt.setString(1, login.getUsuario());
			// stmt.setString(2, login.getSenha());

			rs = ps.executeQuery(sql);
			
			if (rs.next()) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			fechaConexao();
		}

	}

}
