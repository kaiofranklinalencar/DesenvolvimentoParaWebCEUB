package br.com.npj.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import br.com.npj.jdbc.ConnectionFactory;
import br.com.npj.modelo.Pessoa;

public class PessoaDAO {

	private java.sql.Connection connection;
	public	PessoaDAO() throws ClassNotFoundException  {
		
		this.connection	= new ConnectionFactory().getConnection();
		
	
	}
	
	public void adiciona (Pessoa pessoa) {
		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dateobj = new Date(0);
		String  datagravado = df.format(dateobj);

		String sqlpessoa = "insert into dbo.Pessoa" +
				"(nmPessoa, nuIdentidade, nuCPF, deLocalResidencia, icAdministrador, icAtivo, icAssistido, coSenha)" +
				"values (?,?,?,?,?,?,?,?)";
		
		String sqlassistido = "insert into dbo.Assistido" +
				"(nuCPF,dtCadastro)" +
				"values (?,?)";
		
		try {
			
			PreparedStatement	stmt	=	((java.sql.Connection) connection).prepareStatement(sqlpessoa);
			PreparedStatement	stmt2	=	((java.sql.Connection) connection).prepareStatement(sqlassistido);
				
			stmt.setString(1,pessoa.getNmPessoa());
			stmt.setString(2,pessoa.getNuIdentidade());
			stmt.setString(3,pessoa.getNuCPF());
			stmt.setString(4,pessoa.getDeLocalResidencia());
			stmt.setInt(5,pessoa.getIcAdministrador());
			stmt.setInt(6,pessoa.getIcAssistido());
			stmt.setInt(7,pessoa.getIcAtivo());
			stmt.setString(8,pessoa.getCoSenha());
			stmt2.setString(1,pessoa.getNuCPF());
			stmt2.setString(2,datagravado);
			
			stmt.execute();
			stmt.close();
			stmt2.execute();
			stmt2.close();
			
		} catch	(SQLException	e)	{
		   throw new	RuntimeException(e);

	}
	}
}