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
				/*
				 * importante seguir esta pauta, abrir conexion y luego cerrar
				 * NO PONER SCAN.CLOSE() esta colocado en el GestorAgencia.java, no es necesario cerrarlo en cada clase
				 */
				break;

			case Menu.ELIMINAR_CLIENTE:

				break;

			case Menu.ACTUALIZAR_CLIENTE:

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
