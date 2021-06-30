package br.com.npj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class ConnectionFactory {

	public Connection getConnection () throws ClassNotFoundException  {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    String connectionUrl = "jdbc:sqlserver://DESKTOP-2O7VJSR\\SQLEXPRESS01;databaseName=NPJ_DATABASE;port=1433;user=NewSA;password=new123";	       	 	  
	
		try {
			
			return DriverManager.getConnection(connectionUrl);
					
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
	}
	
}