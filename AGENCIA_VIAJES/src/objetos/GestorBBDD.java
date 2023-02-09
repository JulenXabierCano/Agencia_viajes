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
