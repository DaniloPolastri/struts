package br.com.ebix.persistence;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.ebix.model.Segurado;

public class SeguradoDao extends ConnectionFactory{
	
	public void salvar(Segurado s) throws Exception{
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm");
			abrirConexao();
			ps = conexao.prepareStatement("INSERT INTO segurado values(null,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, s.getNome());
			ps.setString(2, s.getCpf());
			ps.setString(3, s.getRg());
			ps.setString(4, s.getSexo());
			ps.setString(5, s.getCorrentista());
			ps.setString(6, s.getDiasVisita());
			ps.setString(7, formatter.format(new Date()));
			ps.setString(8, formatter.format(new Date()));
			ps.setString(9, s.getData_nasc());
			ps.execute();
			fechaConexao();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Segurado> findAll() throws Exception {
		try {
			abrirConexao();
			List<Segurado> segurados = new ArrayList<Segurado>();
			ps = conexao.prepareStatement("SELECT * FROM segurado");
			rs = ps.executeQuery();

			while (rs.next()) {
				Segurado s = new Segurado();
				s.setId(rs.getInt(1));
				s.setNome(rs.getString(2));
				s.setCpf(rs.getString(3));
				s.setRg(rs.getString(4));
				s.setSexo(rs.getString(5));
				s.setCorrentista(rs.getString(6));
				s.setDiasVisita(rs.getString(7));
				s.setDataCadastro(rs.getDate(8));
				s.setDataDeAlteracao(rs.getDate(9));
				s.setData_nasc(rs.getString(10));
				segurados.add(s);

			}
			return segurados;
		} catch (Exception e) {
			return null;
		} finally {
			conexao.close();
		}
	}
	
	public Segurado findById(Integer id) throws Exception {
		try {
			abrirConexao();
			ps = conexao.prepareStatement("SELECT * FROM segurado WHERE id = ? ");
			ps.setLong(1, id);
			rs = ps.executeQuery();
			Segurado s = null;
			if (rs.next()) {
				s = new Segurado();
				s.setId(rs.getInt(1));
				s.setNome(rs.getString(2));
				s.setCpf(rs.getString(3));
				s.setRg(rs.getString(4));
				s.setSexo(rs.getString(5));
				s.setCorrentista(rs.getString(6));
				s.setDiasVisita(rs.getString(7));
				s.setDataCadastro(rs.getDate(8));
				s.setDataDeAlteracao(rs.getDate(9));
				s.setData_nasc(rs.getString(10));
			}
			return s;
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
			ps = conexao.prepareStatement("DELETE FROM segurado WHERE id = " + id);
			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
	}
	public void update(Segurado s) throws Exception {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			abrirConexao();
			ps = conexao.prepareStatement("UPDATE segurado set nome = ? , cpf = ?, rg = ?, sexo = ?, correntista = ?, diaVisita = ?, dataDeAlteracao = ?, data_nasc = ? WHERE id = ?");

			ps.setString(1, s.getNome());
			ps.setString(2, s.getCpf());
			ps.setString(3, s.getRg());
			ps.setString(4, s.getSexo());
			ps.setString(5, s.getCorrentista());
			ps.setString(6, s.getDiasVisita());
			ps.setString(7, formatter.format(new Date()));
			ps.setString(8, s.getData_nasc());
			ps.setInt(9, s.getId());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
	}
}
