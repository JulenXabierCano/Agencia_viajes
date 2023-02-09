package objetos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector {
	public void crearReserva(Reserva reserva) {
		try {
			PreparedStatement crearReserva = conector
					.prepareStatement("INSERT INTO reservas (id_habitacion,dni,desde,hasta) VALUES (?,?,?,?)");
			crearReserva.setInt(1, reserva.getId_habitacion());
			crearReserva.setString(2, reserva.getDni());
			crearReserva.setString(3, reserva.getDesde());
			crearReserva.setString(4, reserva.getHasta());
			crearReserva.execute();
		} catch (SQLException e) {
			System.out.println("Error: no se ha podido crear la reserva");
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
}
