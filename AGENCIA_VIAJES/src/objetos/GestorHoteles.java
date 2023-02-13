package objetos;

import java.util.Scanner;

import principal.GestorAgencia;

public class GestorHoteles {

	public static void Run(Scanner scan) {
		
		Hotel hotel = new Hotel();
		int opcion_menu=0;
		FormularioDeDatos fdd = new FormularioDeDatos();
		GestorBBDD gestorBBDD = new GestorBBDD();
		
		
		do {
			
			Menu.menuHotelHabitaciones();
			System.out.println("¿Qué proceso quiere realizar?");
			opcion_menu = Integer.parseInt(scan.nextLine());
			
		switch (opcion_menu) {
		
		case Menu.ALTA_HOTEL:
		
			gestorBBDD.conectar();
			gestorBBDD.crearHotel(FormularioDeDatos.datosHoteles(scan),scan);
			gestorBBDD.cerrar();
			
		}
			
		}while (opcion_menu != Menu.SALIR);
	}
}
