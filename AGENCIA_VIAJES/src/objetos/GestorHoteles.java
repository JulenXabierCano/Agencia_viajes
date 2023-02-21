package objetos;

import java.util.Scanner;

public class GestorHoteles {

	public static void Run(Scanner scan) {

		
		int opcion_menu = 0;
		GestorBBDD gestorBBDD = new GestorBBDD();

		do {
			System.out.println("¿Qué proceso quiere realizar?");

			Menu.menuHotelHabitaciones();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {

			case Menu.ALTA_HOTEL:

				gestorBBDD.conectar();
				gestorBBDD.crearHotel(FormularioDeDatos.datosHoteles(scan), scan);
				gestorBBDD.cerrar();
				
				break;
				
			case Menu.ELIMINAR_HOTEL:
				
				gestorBBDD.conectar();
				gestorBBDD.eliminarHotel(FormularioDeDatos.eliminarHotel(scan));
				gestorBBDD.cerrar();
				
			default:
				System.out.println("Opcion no existente");

			}

		} while (opcion_menu != Menu.SALIR);
	}
}
