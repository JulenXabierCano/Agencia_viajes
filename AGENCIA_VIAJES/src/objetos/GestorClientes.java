package objetos;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
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
				
			case Menu.MENUMENU:
				do {
				Menu.menuMenu();
				System.out.println("Selecciona la siguiente accion a realizar");
				opcion_menu = Integer.parseInt(scan.nextLine());
				switch(opcion_menu) {
				case Menu.APELLIDO:
					
					break;
				case Menu.NOMBRE:
					break;
				case Menu.CARACTER:
					gbd.conectar();
					ArrayList<Cliente> clientes = new ArrayList<Cliente>();
					gbd.descargarDatos(clientes);
					gbd.contiene(clientes,FormularioDeDatos.consultaCadena(scan));
					gbd.cerrar();
					break;
				case Menu.SALIR:
					break;
					default:
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
}
