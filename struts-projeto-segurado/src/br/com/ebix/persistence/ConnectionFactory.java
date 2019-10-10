package br.com.ebix.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {

	static Connection conexao;
	PreparedStatement ps;
	ResultSet rs;

	public Connection abrirConexao(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/struts_segurado?useTimezone=true&serverTimezone=UTC", "root", "3301");

		} catch (Exception e) {

		}
		return conexao;

	}

	public static void fechaConexao() {
		try {
			conexao.close();
		} catch (Exception e) {

		}

	}
}