package objetos;

import java.util.Scanner;

import principal.GestorAgencia;

public class GestorHoteles {

	public static void Run(Scanner scan) {
		
		Hotel hotel = new Hotel();
		int opcion_menu=0;
		GestorBBDD gestorBBDD = new GestorBBDD();
		
		System.out.println("¿Qué proceso quiere realizar?");
		Menu.menuHotelHabitaciones();
		
		opcion_menu = Integer.parseInt(scan.nextLine());
		
		
		do {
			opcion_menu = scan.nextInt();
			
		switch (opcion_menu) {
		
		case Menu.ALTA_HOTEL:
		
			gestorBBDD.conectar();
			hotel = FormularioDeDatos.datosHoteles(scan);
			gestorBBDD.crearHotel(hotel);
			gestorBBDD.cerrar();
		
			System.out.println("Hotel creado");
		}
			
		}while (opcion_menu != Menu.SALIR);
	}
}
