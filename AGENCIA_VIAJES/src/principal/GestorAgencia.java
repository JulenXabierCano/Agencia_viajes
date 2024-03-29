package principal;

import java.sql.SQLException;
import java.util.Scanner;

import objetos.*;


public class GestorAgencia {
	public void Run() throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		int opcion_menu = 0;
		
		do {
			Menu.menuPrincipal();
			System.out.println("¿A que gestor quiere acceder?");
			opcion_menu = Integer.parseInt(scan.nextLine());
			
			switch(opcion_menu) {
			case Menu.GESTOR_CLIENTES:
				GestorClientes.Run(scan);
				break;
				
			case Menu.GESTOR_RESERVAS:
				GestorReservas.Run(scan);
				break;
			
			case Menu.GESTOR_HOTELYHABITACIONES:
				GestorHoteles.Run(scan);
				break;
			
			case Menu.SALIR:
				System.out.println("Programa finalizado");
				break;
			
			default:
				System.out.println("Opción inexistente");
				break;
			}
		}while(opcion_menu != Menu.SALIR);
		scan.close();
	}
}
