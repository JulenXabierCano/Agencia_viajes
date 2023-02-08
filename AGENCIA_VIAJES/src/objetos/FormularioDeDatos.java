package objetos;

import java.util.Scanner;

public class FormularioDeDatos {
	public Hotel datosHoteles(Scanner scan) {
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
		
		System.out.println("Introduzca localidad del cliente");
		cliente.setDni(scan.nextLine());
		
		System.out.println("Introduzca nombre del cliente");
		cliente.setNombre(scan.nextLine());
		
		System.out.println("Introduzca apellidos del cliente");
		cliente.setApellidos(scan.nextLine());
		
		System.out.println("Introduzca direccion del cliente");
		cliente.setDireccion(scan.nextLine());
		
		System.out.println("Introduzca localidad del cliente");
		cliente.setLocalidad(scan.nextLine());
		
		return cliente;
	}
	
	public Reserva datosReserva(Scanner scan) {
		Reserva reserva = new Reserva();
//		Verificar disponibilidad de habitaciones antes de crear la reserva
		return reserva;
	}
}
