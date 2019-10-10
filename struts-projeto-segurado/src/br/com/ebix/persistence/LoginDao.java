package br.com.ebix.persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.ebix.model.Login;


public class LoginDao extends ConnectionFactory {
	
	public boolean loginExiste(Login login) {
		Connection conn = abrirConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT usuario, senha FROM login  WHERE usuario = '"  +login.getUsuario() + "'  and senha =  '" +login.getSenha() + "'";
		try {
			ps = (PreparedStatement) conn.createStatement();
			rs = ps.executeQuery(sql);
			
			if(rs.next()) {
				if(rs.getString(1).equals(login.getUsuario()) && rs.getString(2).equals(login.getSenha())){
					return true;
				} else {
					return false;
				}
			}
			
//			ps = con.prepareStatement("SELECT usuario, senha FROM login WHERE usuario = ? and senha = ?");
//			ps.setString(1, login.getUsuario() );
//			ps.setString(2, login.getSenha() );
//			//ps = con.prepareStatement(SQL);
//			rs = ps.executeQuery();
//			
//			if(rs.next()) {
//				return true;
//			} else {
//				return false;
//				
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			fechaConexao();
		}
		return false;


		
	}
	
		
}
