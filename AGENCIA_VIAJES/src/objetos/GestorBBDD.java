package objetos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class GestorBBDD extends Conector {
	public void crearReserva(Reserva reserva) {
		try {
			PreparedStatement crearReserva = conector
					.prepareStatement("INSERT INTO reservas (id_habitacion,dni,desde,hasta) VALUES (?,?,?,?)");
			crearReserva.setInt(1, reserva.getId_habitacion());
			crearReserva.setString(2, reserva.getDni());
			crearReserva.setDate(3, reserva.getDesde());
			crearReserva.setDate(4, reserva.getHasta());
			crearReserva.execute();
		} catch (SQLException e) {
			System.out.println("Error: no se ha podido crear la reserva " + e);
		}
	}

	public void crearCliente(Cliente cliente) {
		try {
			PreparedStatement crearCliente = conector
					.prepareStatement("INSERT INTO clientes (dni,nombre,apellidos,direccion,localidad) VALUES (?,?,?,?,?)");
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

	public void crearHotel(Hotel hotel) {
		PreparedStatement crearHotel;
		try {
			crearHotel = conector
					.prepareStatement("INSERT INTO reservas (cif,nombre,gerente,estrellas, compania) VALUES (?,?,?,?,?)");
			crearHotel.setString(1, hotel.getCif());
			crearHotel.setString(2, hotel.getNombre());
			crearHotel.setString(3, hotel.getGerente());
			crearHotel.setInt(4, hotel.getEstrellas());
			crearHotel.setString(5, hotel.getCompania());
			
			crearHotel.execute();
		} catch (SQLException e) {
			System.out.println("Error al crear hotel " + e);
		}
	}


}
