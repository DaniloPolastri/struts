package br.com.ebix.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {

	Connection conexao;
	PreparedStatement ps;
	ResultSet rs;

	public Connection abrirConexao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/struts_segurado?useTimezone=true&serverTimezone=UTC", "root", "3301");

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	public void fechaConexao() {
		try {
			conexao.close();
		} catch (Exception e) {
			e.getMessage();
		}

	}
}