package objetos;

import java.util.Scanner;

public class GestorClientes {

	public static void Run(Scanner scan) {

		int opcion_menu = 0;
		FormularioDeDatos fdd = new FormularioDeDatos();
		GestorBBDD gbd = new GestorBBDD();
		Cliente cliente;

		Menu.menuClientes();
		System.out.println("Selecciona la siguiente accion a realizar");
		opcion_menu = Integer.parseInt(scan.nextLine());

		do {

			switch (opcion_menu) {
			case Menu.ALTA_CLIENTE:
				cliente = fdd.datosCliente(scan);
				gbd.conectar();
				gbd.crearCliente(cliente);
				gbd.cerrar();
				break;

			case Menu.ELIMINAR_CLIENTE:
				cliente = fdd.eliminarCliente(scan);
				gbd.conectar();
				gbd.eliminarCliente(cliente);
				gbd.cerrar();
				break;

			case Menu.ACTUALIZAR_CLIENTE:
				cliente = fdd.actualizarCliente(scan);
				gbd.conectar();
				gbd.actualizarCliente(cliente);
				gbd.cerrar();
				break;

			case Menu.SALIR:
				Menu.menuPrincipal();
				break;

			default:
				System.out.println("Opcion inexistente");
				break;
			}

		} while (opcion_menu != Menu.SALIR);
	}
}
