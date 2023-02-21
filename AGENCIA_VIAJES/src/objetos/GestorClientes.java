package objetos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GestorClientes {

	public static void Run(Scanner scan){

		int opcion_menu = 0;
		GestorBBDD gbd = new GestorBBDD();

		do {

			Menu.menuClientes();
			System.out.println("Selecciona la siguiente accion a realizar");
			opcion_menu = Integer.parseInt(scan.nextLine());
			switch (opcion_menu) {
			
			case Menu.ALTA_CLIENTE:
				gbd.conectar();
				gbd.crearCliente(FormularioDeDatos.datosCliente(scan));
				gbd.cerrar();
				break;

			case Menu.ELIMINAR_CLIENTE:
				gbd.conectar();
				gbd.eliminarCliente(FormularioDeDatos.eliminarCliente(scan));
				gbd.cerrar();
				break;

			case Menu.ACTUALIZAR_CLIENTE:
				gbd.conectar();
				gbd.actualizarCliente(FormularioDeDatos.actualizarCliente(scan));
				gbd.cerrar();
				break;
				
			case Menu.CONSULTA:
				do {
				Menu.menuMenu();
				System.out.println("Selecciona la siguiente accion a realizar");
				opcion_menu = Integer.parseInt(scan.nextLine());
				ArrayList<Cliente> clientes = new ArrayList<Cliente>();
				switch(opcion_menu) {
				case Menu.NOMBRE:
					gbd.conectar();
					gbd.descargarDatos(clientes);
					try {
						comparaNombre(clientes);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					gbd.cerrar();
					break;
				case Menu.APELLIDO:
					gbd.conectar();
					gbd.descargarDatos(clientes);
					try {
						comparaApellido(clientes);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					gbd.cerrar();
					break;
				case Menu.CARACTER:
					gbd.conectar();
					gbd.descargarDatos(clientes);
					gbd.contiene(clientes,FormularioDeDatos.consultaCadena(scan));
					gbd.cerrar();
					break;
				case Menu.SALIR:
					break;
					default:
						System.out.println("Opción inexistente");
						break;
				}
				}while(opcion_menu!=Menu.SALIR);

			case Menu.SALIR:
				break;

			default:
				System.out.println("Opcion inexistente");
				break;
			}
		} while (opcion_menu != Menu.SALIR);
	}
	
	public void contiene(ArrayList<Cliente> clientes,String cadena) {
		for (Cliente cliente : clientes) {
			if(cliente.getNombre().contains(cadena)||cliente.getApellidos().contains(cadena)) {
				System.out.println(cliente);
			}
		}
	}
	
	public static void comparaNombre(ArrayList<Cliente> clientes) throws SQLException {
		Collections.sort(clientes, new ComparadorNombre());
		
		for(Cliente c : clientes) {
			System.out.println(c.getNombre());
		}
	}
	
	public static void comparaApellido(ArrayList<Cliente> clientes) throws SQLException {
		Collections.sort(clientes, new ComparadorApellido());
		
		for(Cliente c : clientes) {
			System.out.println(c.getApellidos());
		}
	}
}
