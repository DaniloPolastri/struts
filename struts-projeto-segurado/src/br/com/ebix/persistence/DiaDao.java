package br.com.ebix.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ebix.model.Dia;
import br.com.ebix.model.Seguro;

public class DiaDao extends ConnectionFactory{
	
	public boolean salvar(int id_segurado, int iddia) {

		try {
			abrirConexao();
			ps = conexao.prepareStatement("insert into segurado_dia (idsegurado,	iddia) values (?, ?)");
			ps.setInt(1, id_segurado);
			ps.setInt(2, iddia);

			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("Execption: " + e.getMessage());
			return false;
		} finally {
			fechaConexao();
		}

	}
	
	public List<Dia> findAll() throws Exception {
		try {
			abrirConexao();
			List<Dia> seguros = new ArrayList<Dia>();
			ps = conexao.prepareStatement("SELECT * FROM dias");
			rs = ps.executeQuery();

			while (rs.next()) {
				Dia d = new Dia();
				d.setId(rs.getInt(1));
				d.setDia(rs.getString(2));
				
				seguros.add(d);

			}
			return seguros;
		} catch (Exception e) {
			return null;
		} finally {
			conexao.close();
		}
	}
}
