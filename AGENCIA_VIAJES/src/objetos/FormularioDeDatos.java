package objetos;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

	public static Habitacion datosHabitacion(Scanner scan) {
		Habitacion habitacion = new Habitacion();

		System.out.println("Introduzca la id de la habitacion");
		habitacion.setId(Integer.parseInt(scan.nextLine()));

		System.out.println("Introduzca ID del hotel al que pertenece:");
		habitacion.setId_hotel(Integer.parseInt(scan.nextLine()));

		System.out.println("Introduzca numero de la habitacion:");
		habitacion.setNumero(scan.nextLine());

		System.out.println("Introduzca la descripcion de la habitacion:");
		habitacion.setDescripcion(scan.nextLine());

		System.out.println("Introduzca el precio de la habitacion:");
		habitacion.setPrecio(Integer.parseInt(scan.nextLine()));

		return habitacion;
	}
	
	public static Cliente datosCliente(Scanner scan) {
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

	public static Reserva datosReserva(Scanner scan) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");

		Reserva reserva = new Reserva();

		System.out.println("Introduzca ID de la habitacion:");
		reserva.setId_habitacion(Integer.parseInt(scan.nextLine()));


			System.out.println("Introduzca fecha de inicio de reserva (YYYY-DD-MM):");
			reserva.setDesde(java.sql.Date.valueOf(scan.nextLine()));

			System.out.println("Introduzca fecha de final de reserva (YYYY-DD-MM):");
			reserva.setHasta(java.sql.Date.valueOf(scan.nextLine()));
		
		return reserva;
	}

	public static Cliente eliminarCliente(Scanner scan) {
		Cliente cliente = new Cliente();
		
		System.out.println("Introduce el DNI del usuario a eliminar");
		cliente.setDni(scan.nextLine());
		
		return cliente;
	}

	public static Cliente actualizarCliente(Scanner scan) {
		Cliente cliente = new Cliente();
		
		System.out.println("Introduce el DNI del cliente que se desea actualizar");
		cliente.setDni(scan.nextLine());
		System.out.println("Introduce el nombre del Cliente");
		cliente.setNombre(scan.nextLine());
		System.out.println("Introduce Apellidos del Cliente");
		cliente.setApellidos(scan.nextLine());
		System.out.println("Introduce direccion del Cliente");
		cliente.setDireccion(scan.nextLine());
		System.out.println("Introduce localidad en la que reside el Cliente");
		cliente.setLocalidad(scan.nextLine());
		
		return cliente;
	}

	public static java.util.Date conseguirFecha(String string,Scanner scan) {
		System.out.println(string);
		return Date.valueOf(scan.nextLine());
	}
	
	public static String consultaCadena(Scanner scan) {
		String cadena;
		
		System.out.println("Introduce la cadena de caracteres a buscar");
		cadena = scan.nextLine();
		
		return cadena;
	}
}
