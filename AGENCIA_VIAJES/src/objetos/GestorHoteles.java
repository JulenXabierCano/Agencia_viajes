package objetos;

import java.util.Scanner;

import principal.GestorAgencia;

public class GestorHoteles {

	public static void Run(Scanner scan) {
		
		Hotel hotel = new Hotel();
		int opcion_menu=0;
		FormularioDeDatos fdd = new FormularioDeDatos();
		GestorBBDD gestorBBDD = new GestorBBDD();
		int opcion_habitacion = 0;
		
		
		do {
			
			Menu.menuHotelHabitaciones();
			System.out.println("¿Qué proceso quiere realizar?");
			opcion_menu = Integer.parseInt(scan.nextLine());
			
		switch (opcion_menu) {
		
		case Menu.ALTA_HOTEL:
		
			gestorBBDD.conectar();
			gestorBBDD.crearHotel(FormularioDeDatos.datosHoteles(scan));
			gestorBBDD.cerrar();
		
			System.out.println("Hotel creado");
			
			do {
				
				System.out.println("¿Quieres crear una habitacion? \n 1.Si \n 2.No");
				opcion_habitacion = Integer.parseInt(scan.nextLine());
				
				switch (opcion_habitacion) {
				
				case Menu.CREAR_HABITACION:
					
					
				
				}
			}while (opcion_habitacion != 0);
		}
			
		}while (opcion_menu != Menu.SALIR);
	}
}
