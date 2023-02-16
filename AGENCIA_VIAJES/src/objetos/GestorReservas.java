package objetos;

import java.util.Scanner;

public class GestorReservas {

	public static void Run(Scanner scan) {
		GestorBBDD bbdd = new GestorBBDD();

		int opcion_menu = 0;
		do {
			Menu.menuReservas();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.RESERVAR:
				bbdd.conectar();
				bbdd.crearReserva(scan);
				bbdd.cerrar();
				break;

			case Menu.CANCELAR:
				bbdd.conectar();
				bbdd.cancelarReserva(scan);
				bbdd.cerrar();
				break;
			case Menu.VER_RESERVAS:
				bbdd.conectar();
				bbdd.consultarReservas(
						FormularioDeDatos.conseguirFecha("Introduzca fecha de inicio de busqueda", scan),
						FormularioDeDatos.conseguirFecha("Introduzca fecha de inicio de busqueda", scan));
				bbdd.cerrar();
				break;
			case Menu.VER_POR_DNI:
				bbdd.conectar();
				bbdd.comprobarReservasCliente(scan);
				bbdd.cerrar();
				break;
			}
		} while (opcion_menu != Menu.SALIR);
	}
}
