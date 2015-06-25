package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class ConexaoFactory {
	private static final String USUARIO = "sa";
	private static final String SENHA = "123456";
	private static final String URL = "jdbc:jtds:sqlserver://localhost;DatabaseName=teste";
	
	public static Connection conectar() throws SQLException{
		return DriverManager.getConnection(URL, USUARIO, SENHA);
	}
	public static void main(String[] args) {
		try{
			ConexaoFactory.conectar();
			System.out.println("Conectado ao bando de dados as "+new Date());
		}
		catch(SQLException ex){
			ex.printStackTrace();
			System.out.println("fail");
		}

	}

}
