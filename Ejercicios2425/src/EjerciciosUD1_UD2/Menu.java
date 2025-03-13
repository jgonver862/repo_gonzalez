package EjerciciosUD1_UD2;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("MENÚ \n\tElige Una Opción: \n\t\t1.-Comprimir Archivo \n\t\t2.-Eliminar Archivo \n\t\t3.-Copiar Archivo\n\t\t4.-Cerrar Programa");
		int opcion = scan.nextInt();
		/*
		 * if (opcion == 1) { System.out.println("Has Elegido La Opción: " + opcion +
		 * ".Por Tanto, Has Elegido Comprimir Archivo"); } else if (opcion == 2){
		 * System.out.println("Has Elegido La Opción: " + opcion +
		 * ".Por Tanto, Has Elegido Eliminar Archivo"); } else if (opcion == 3) {
		 * System.out.println("Has Elegido La Opción: " + opcion +
		 * ".Por Tanto, Has Elegido Copiar Archivo"); } else if (opcion == 4) {
		 * System.out.println("Has Elegido La Opción: " + opcion +
		 * ".Por Tanto, Has Elegido Cerrar Programa"); } else { System.err.
		 * println("No Has Seleccionado Ninguna De Las Opciones Que Hay En El Menu."); }
		 * //
		 */
		switch (opcion) {
		case 1:
			System.out.println("Has Elegido La Opción: " + opcion + ".Por Tanto, Has Elegido Comprimir Archivo");
			break;
		case 2:
			System.out.println("Has Elegido La Opción: " + opcion + ".Por Tanto, Has Elegido Eliminar Archivo");
			break;
		case 3:
			System.out.println("Has Elegido La Opción: " + opcion + ".Por Tanto, Has Elegido Copiar Archivo");
			break;
		case 4:
			System.out.println("Has Elegido La Opción: " + opcion + ".Por Tanto, Has Elegido Cerrar Programa");
			break;
		default:
			System.err.println("No Has Seleccionado Ninguna De Las Opciones Que Hay En El Menu.");
			break;
		}
		scan.close();
	}

}
