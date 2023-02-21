package objetos;

public class Menu {

	public static final int GESTOR_CLIENTES = 1;
	public static final int GESTOR_RESERVAS = 2;
	public static final int GESTOR_HOTELYHABITACIONES = 3;
	public static final int CONSULTA = 4;
	public static final int SALIR = 0;

	public static final int ALTA_CLIENTE = 1;
	public static final int ELIMINAR_CLIENTE = 2;
	public static final int ACTUALIZAR_CLIENTE = 3;

	public static final int RESERVAR = 1;
	public static final int CANCELAR = 2;
	public static final int VER_RESERVAS = 3;
	public static final int VER_POR_DNI = 4;

	public static final int ALTA_HOTEL = 1;
	public static final int ELIMINAR_HOTEL = 2;

	public static final int CREAR_HABITACION = 1;
	
	public static final int NOMBRE = 1;
	public static final int APELLIDO = 2;
	public static final int CARACTER = 3;

	public static void menuPrincipal() {
		System.out.println("Menú:");
		System.out.println(GESTOR_CLIENTES + ".	Gestionar Clientes");
		System.out.println(GESTOR_RESERVAS + ".	Gestionar Reservas");
		System.out.println(GESTOR_HOTELYHABITACIONES + ".	Gestionar Hoteles y Habitaciones");
		System.out.println(SALIR + ".	Salir");
	}

	public static void menuClientes() {
		System.out.println("Menú:");
		System.out.println(ALTA_CLIENTE + ".	Alta a Cliente");
		System.out.println(ELIMINAR_CLIENTE + ".	Baja a Cliente");
		System.out.println(ACTUALIZAR_CLIENTE + ".	Actualizar información");
		System.out.println(CONSULTA +".	Consultas");
		System.out.println(SALIR + ".	Salir");
	}

	public static void menuReservas() {
		System.out.println("Menú:");
		System.out.println(RESERVAR + ".	Realizar una reserva");
		System.out.println(CANCELAR + ".	Cancelar reserva");
		System.out.println(VER_RESERVAS + ".	Consultar reservas entre dos fechas");
		System.out.println(VER_POR_DNI + ".	Consultar reservas de un cliente");
		System.out.println(SALIR + ".	Salir");
	}

	public static void menuHotelHabitaciones() {
		System.out.println("Menú:");
		System.out.println(ALTA_HOTEL + ".	Dar de Alta un Hotel");
		System.out.println("");
		System.out.println(SALIR + ".	Salir");
	}
	
	public static void menuMenu() {
		System.out.println("Menú:");
		System.out.println(NOMBRE +".	Ordenar por Nombre");
		System.out.println(APELLIDO +".	Ordenar por Apellido");
		System.out.println(CARACTER +".	Examinar Caracteres");
		System.out.println(SALIR +".	Salir");
	}
}
