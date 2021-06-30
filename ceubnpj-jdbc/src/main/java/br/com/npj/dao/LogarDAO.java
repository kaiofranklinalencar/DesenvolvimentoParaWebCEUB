package br.com.npj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.npj.jdbc.ConnectionFactory;
import br.com.npj.modelo.Pessoa;



public class LogarDAO {  
	
	private java.sql.Connection connection;
	public	LogarDAO() throws ClassNotFoundException  {
		
		this.connection	= new ConnectionFactory().getConnection();

	}
	
	//Pessoa bean = new Pessoa();
	
public Pessoa logindois(Pessoa bean) {

try{  
	
    String username = bean.getNuCPF();   
    String password = bean.getCoSenha();   
	    

	String searchQuery =
			"select * from Pessoa where nuCPF='"
			         + username
			         + "' AND coSenha='"
			         + password
			         + "'";
	
	   System.out.println("Seu cpf é " + username);          
	   System.out.println("Sua senha é " + password);
	   System.out.println("Query: "+searchQuery);
      
PreparedStatement ps = ((java.sql.Connection) connection).prepareStatement(searchQuery);

//ps.setString(1,name);  
//ps.setString(2,pass);  
      
ResultSet rs=ps.executeQuery();  
//status=rs.next();

boolean more = rs.next();

// if user does not exist set the isValid variable to false
if (!more) 
{
   System.out.println("Você não está cadastrado");
   bean.setValid(false);
} 
      
else if (more) 
{
   String firstName = rs.getString("nmPessoa");
   	
   System.out.println("Bem vindo " + firstName);
   bean.setValid(true);
}
          
}

catch	(SQLException	e)	{
	   throw new	RuntimeException(e);

		}
return bean;
	}  
} 