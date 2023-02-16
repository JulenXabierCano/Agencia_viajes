package principal;

import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		GestorAgencia ga = new GestorAgencia();
		try {
			ga.Run();
		} catch (SQLException e) {
		}
	}
}
