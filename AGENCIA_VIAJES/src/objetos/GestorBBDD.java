package objetos;

import java.sql.*;
import java.util.Scanner;

public class GestorBBDD extends Conector {
	public void crearReserva(Scanner scan) {
		try {
			PreparedStatement select = conector.prepareStatement("SELECT * FROM clientes WHERE dni=?");
			System.out.println("Introduzca DNI del cliente");
			String dni = scan.nextLine();
			select.setString(1, dni);
			if (select.execute()) {
				System.out.println("Introduzca el hotel en el que se va a alojar");
				String hotel = scan.nextLine();
				select = conector.prepareStatement(
						"SELECT * FROM habitaciones WHERE id_hotel = (SELECT id FROM hoteles WHERE nombre = ?)");
				select.setString(1, hotel);
				ResultSet resultado = select.executeQuery();
				String habitaciones = "-----Habitaciones-----\n";
				while (resultado.next()) {
					System.out.println(resultado.getInt(3) + " : " + resultado.getString(4) + "" + resultado.getDouble(5));
				}

				PreparedStatement crearReserva = conector
						.prepareStatement("INSERT INTO reservas (id_habitacion,dni,desde,hasta) VALUES (?,?,?,?)");
				Reserva reserva = FormularioDeDatos.datosReserva(scan);

				crearReserva.setInt(1, reserva.getId_habitacion());
				crearReserva.setString(2, reserva.getDni());
				crearReserva.setDate(3, (Date) reserva.getDesde());
				crearReserva.setDate(4, (Date) reserva.getHasta());
				crearReserva.execute();

			} else {
				System.out.println("Error: no se ha podido crear la reserva");
			}

		} catch (SQLException e) {
			System.out.println("Error: no se ha podido crear la reserva ");
		}

	}

	public void crearCliente(Cliente cliente) {
		try {
			PreparedStatement crearCliente = conector.prepareStatement(
					"INSERT INTO clientes (dni,nombre,apellidos,direccion,localidad) VALUES (?,?,?,?,?)");
			crearCliente.setString(1, cliente.getDni());
			crearCliente.setString(2, cliente.getNombre());
			crearCliente.setString(3, cliente.getApellidos());
			crearCliente.setString(4, cliente.getDireccion());
			crearCliente.setString(5, cliente.getLocalidad());
			crearCliente.execute();
		} catch (SQLException e) {
			System.out.println("Error: no se ha podido registrar el cliente");
		}
	}

	public void crearHotel(Hotel hotel, Scanner scan) {
		int opcion_habitacion;
		GestorBBDD gestorBBDD = new GestorBBDD();
		PreparedStatement crearHotel;
		try {
			crearHotel = conector.prepareStatement(
					"INSERT INTO hoteles (cif,nombre,gerente,estrellas, compania) VALUES (?,?,?,?,?)");

			crearHotel.setString(1, hotel.getCif());
			crearHotel.setString(2, hotel.getNombre());
			crearHotel.setString(3, hotel.getGerente());
			crearHotel.setInt(4, hotel.getEstrellas());
			crearHotel.setString(5, hotel.getCompania());

			crearHotel.execute();
			System.out.println("Hotel creado");

			do {

				System.out.println("¿Quieres crear una habitacion? \n 1.Si \n 2.No");
				opcion_habitacion = Integer.parseInt(scan.nextLine());

				switch (opcion_habitacion) {

				case Menu.CREAR_HABITACION:

					gestorBBDD.conectar();
					gestorBBDD.crearHabitacion(FormularioDeDatos.datosHabitacion(scan), scan);
					gestorBBDD.cerrar();
					
				System.out.println("¿Desea crear otra habitacion?");

					break;
					
				case 2:
					System.out.println("Volviendo al gestor de hoteles");
				default:
					System.out.println("Opcion no existente");

					break;

				}
			} while (opcion_habitacion != 2);
		} catch (SQLException e) {
			System.out.println("Error al crear hotel " + e);
		}

	}

	public void crearHabitacion(Habitacion habitacion, Scanner scan) {
		PreparedStatement crearHabitacion;
		try {
			crearHabitacion = conector
					.prepareStatement("INSERT INTO habitaciones (id,id_hotel,numero,descripcion,precio) VALUES (?,?,?,?,?)");
			crearHabitacion.setInt(1, habitacion.getId());
			crearHabitacion.setInt(2, habitacion.getId_hotel());
			crearHabitacion.setString(3, habitacion.getNumero());
			crearHabitacion.setString(4, habitacion.getDescripcion());
			crearHabitacion.setDouble(5, habitacion.getPrecio());

			crearHabitacion.execute();
		} catch (SQLException e) {
			System.out.println("Error al crear hotel " + e);
		}
	}

}