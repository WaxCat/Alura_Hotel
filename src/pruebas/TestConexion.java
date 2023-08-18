package pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import factory.ConnectionFactory;

public class TestConexion {
	
	public static void main(String[] args) throws SQLException {
					
		Connection con = new ConnectionFactory().recuperaConexion();
		
		System.out.println("Conexion exitosa");
		
		con.close();
		
		System.out.println("Conexion Cerrada");
	}

}
