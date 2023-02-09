package objetos;

import java.util.Scanner;

public class FormularioDeDatos {
	public static Hotel datosHoteles(Scanner scan) {
		Hotel hotel = new Hotel();
		
		System.out.println("Introduzca CIF del hotel:");
		hotel.setCif(scan.nextLine());
		
		System.out.println("Introduzca nombre del hotel:");
		hotel.setNombre(scan.nextLine());
		
		System.out.println("Introduzca gerente del hotel:");
		hotel.setGerente(scan.nextLine());
		
		System.out.println("Introduzca numero de estrellas del hotel:");
		hotel.setEstrellas(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduzca compañia del hotel:");
		hotel.setCompania(scan.nextLine());
		
		return hotel;
	}
	
	public Habitacion datosHabitacion(Scanner scan) {
		Habitacion habitacion = new Habitacion();
		
		System.out.println("Introduzca ID del hotel al que pertenece:");
		habitacion.setId_hotel(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduzca nombre del hotel:");
		habitacion.setNumero(scan.nextLine());
		
		System.out.println("Introduzca gerente del hotel:");
		habitacion.setDescripcion(scan.nextLine());
		
		System.out.println("Introduzca numero de estrellas del hotel:");
		habitacion.setPrecio(Integer.parseInt(scan.nextLine()));
		
		return habitacion;
	}
	
	public Cliente datosCliente(Scanner scan) {
		Cliente cliente = new Cliente();
		
		System.out.println("Introduce el DNI");
		cliente.setDni(scan.nextLine());
		System.out.println("Introduce nombre del Cliente");
		cliente.setNombre(scan.nextLine());
		System.out.println("Introduzca los Apellidos del registrado");
		cliente.setApellidos(scan.nextLine());
		System.out.println("Introduce direccion del Cliente");
		cliente.setDireccion(scan.nextLine());
		System.out.println("Introduce Localidad en la cual reside");
		cliente.setLocalidad(scan.nextLine());
		
		return cliente;
	}
	
	public Reserva datosReserva(Scanner scan) {
		Reserva reserva = new Reserva();
		
		System.out.println("Introduzca ID de la habitacion:");
		reserva.setId_habitacion(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduzca DNI del cliente:");
		reserva.setDni(scan.nextLine());
		
		System.out.println("Introduzca fecha de inicio de reserva:");
		reserva.setDesde(scan.nextLine());
		
		System.out.println("Introduzca fecha de final de reserva:");
		reserva.setHasta(scan.nextLine());
		
		return reserva;
	}
}
