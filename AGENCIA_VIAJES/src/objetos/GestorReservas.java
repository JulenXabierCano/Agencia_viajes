package objetos;

import java.util.Scanner;

public class GestorReservas {

	public static void Run(Scanner scan) {

		int opcion_menu = 0;
		do {
			Menu.menuReservas();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.RESERVAR:
				GestorBBDD bbdd = new GestorBBDD();
				bbdd.conectar();
				bbdd.crearReserva(scan);
				bbdd.cerrar();
				break;

			case Menu.CANCELAR:
				
				break;
			}
		} while (opcion_menu != Menu.SALIR);
	}
}
