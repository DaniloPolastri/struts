package br.com.ebix.persistence;

import java.util.ArrayList;
import java.util.List;

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

	public List<Seguro> findAll() throws Exception {
		try {
			abrirConexao();
			List<Seguro> seguros = new ArrayList<Seguro>();
			ps = conexao.prepareStatement("SELECT * FROM seguros");
			rs = ps.executeQuery();

			while (rs.next()) {
				Seguro s = new Seguro();
				s.setSeguro(rs.getString(2));
				s.setValor(rs.getDouble(3));
				seguros.add(s);

			}
			return seguros;
		} catch (Exception e) {
			return null;
		} finally {
			conexao.close();
		}
	}
	
	public Seguro findById(int id) throws Exception {
		try {
			abrirConexao();
			String sql = "SELECT * FROM seguros WHERE id = " + id;
			ps = conexao.prepareStatement(sql);
			rs = ps.executeQuery(sql);
			Seguro seg = null;
			if(rs.next()) {
				seg = new Seguro();
				seg.setId(rs.getInt(1));
				seg.setSeguro(rs.getString(2));
				seg.setValor(rs.getDouble(3));
			}
			return seg;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			fechaConexao();
		}
	}
	
	public void deletar(int id) throws Exception {
		try {
			abrirConexao();
			ps = conexao.prepareStatement("DELETE FROM seguros WHERE id = " + id);
			ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
	}


}
