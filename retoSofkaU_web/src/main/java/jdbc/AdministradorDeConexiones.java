package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	
	public static Connection obtenerConexion() {
		
		//jdbc:postgresql://host:port/database
		String url = "jdbc:postgresql://ec2-3-225-79-57.compute-1.amazonaws.com:5432/d24uecr8r2ocj3";
		String user = "pgpsajdnasvqrk";
		String password = "92030ba1bf51c596d40e440c2711ba3f346993f2e6d2274f4a23aa0d9d5b5c92";
		String driverName  = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (Exception  e) {
			e.printStackTrace();
			return null;
		}	
	}
}

