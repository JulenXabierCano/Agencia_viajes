package objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	protected Connection conector;
	
	public void conectar() {
		try {
			String url = "jdbc:mysql://localhost/agencia_viajes";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conector = (Connection) DriverManager.getConnection(url, "root", "");
		} catch (Exception e) {
			System.out.println("Error: No se ha podido encontrar la base de datos "+ e);
		}
	}
	
	public void cerrar() {
		try {
			conector.close();
		} catch (SQLException e) {
			System.out.println("Error: No se ha podido cerrar la conexion");
		}
	}
}
