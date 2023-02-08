package objetos;

import java.util.Scanner;

public class Menu {
	
	private static final int GESTOR_CLIENTES = 1;
	private static final int GESTOR_RESERVAS = 2;
	private static final int GESTOR_HOTELYHABITACIONES = 3;
	private static final int SALIR = 0;
	
	private static final int ALTA_CLIENTE = 1;
	private static final int ELIMINAR_CLIENTE = 2;
	private static final int ACTUALIZAR_CLIENTE = 3;
	
	private static final int RESERVAR = 1;
	private static final int CANCELAR = 2;
	
	static void menuPrincipal() {
		Scanner scan = new Scanner(System.in);
		Integer eleccion;
		
		do {	
			System.out.println("Menú:");
			System.out.println(GESTOR_CLIENTES+".	Gestionar Clientes");
			System.out.println(GESTOR_RESERVAS+".	Gestionar Reservas");
			System.out.println(GESTOR_HOTELYHABITACIONES+".	Gestionar Hoteles y Habitaciones");
			System.out.println(SALIR+".	Salir");
			
			eleccion=Integer.parseInt(scan.nextLine());
			
			switch(eleccion) {
			case GESTOR_CLIENTES:
				break;
			case GESTOR_RESERVAS:
				break;
			case GESTOR_HOTELYHABITACIONES:
				break;
			case SALIR:
				System.out.println("Programa finalizado");
				break;
			default:
				System.out.println("Opción inexistente");
				break;
			}
		}while(eleccion!=SALIR);
	}
	
	static void menuClientes() {
		System.out.println("Menú:");
		System.out.println(ALTA_CLIENTE+".	Alta a Cliente");
		System.out.println(ELIMINAR_CLIENTE+".	Baja a Cliente");
		System.out.println(ACTUALIZAR_CLIENTE+".	Actualizar información");
		System.out.println(SALIR+".	Salir");
	}
	
	static void menuReservas() {
		System.out.println("Menú:");
		System.out.println(RESERVAR+".	Realizar una reserva");
		System.out.println(CANCELAR+".	Cancelar reserva");
		System.out.println(SALIR+".	Salir");
	}
	
	static void menuHotelHabitaciones() {
		System.out.println("Menú:");
		System.out.println("");
	}
}
