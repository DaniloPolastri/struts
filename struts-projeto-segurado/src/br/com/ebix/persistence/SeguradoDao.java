package br.com.ebix.persistence;

import java.text.SimpleDateFormat;

import br.com.ebix.model.Segurado;

public class SeguradoDao extends ConnectionFactory{
	
	public void salvar(Segurado s) throws Exception{
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
			abrirConexao();
			ps = conexao.prepareStatement("INSERT INTO segurado values(null,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, s.getNome());
			ps.setString(2, s.getCpf());
			ps.setString(3, s.getRg());
			ps.setString(4, s.getSexo());
			ps.setString(5, s.getCorrentista());
			ps.setString(6, s.getDiasVisita());
			ps.setString(7, formatter.format(s.getDataDeCadastro()));
			ps.setString(8, formatter.format(s.getDataDeAlteracao()));
			ps.setString(9, s.getData_nasc());
			ps.execute();
			fechaConexao();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
