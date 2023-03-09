package it.exolab.jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import it.exolab.jdbc.model.Prodotto;

public class DAOService {

	private static DAOService instance = null;
	private Connection connection = null;
	
	private DAOService() {}
	
	public static DAOService getInstance() {
		if(instance == null) {
			instance = new DAOService();
		}
		
		return instance;
	}
	
	public void closeConnection() throws SQLException {
		
		if(connection == null) {
			return;
		}
		
		connection.close();
		connection = null;
		
	}
	
    public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		if(connection != null) {
			return connection;
		}
		
		Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			
			
			
			String host = "192.168.100.37";
			String connectionString = "jdbc:oracle:thin:@" + host +":1521/pdb1";
			
			connection=DriverManager.getConnection(  
					connectionString,"u12","u12");  
					  
			
		return connection;
		  
	}
    
	
}
