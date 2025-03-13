package EjerciciosUD3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("--------------| MENU |--------------\n1.- Añadir\n2.- Borrar\n3.- Modificar\n4.- Mostrar por pantalla\n5.- Finalizar\n6.- Salto de linea\n------------------------------------");
			System.out.println("Elige una opcion");
			opcion = scan.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Has añadido un elemento!");
				UtilidadesEjercicio01.aniadir();
				break;
			case 2:
				System.out.println("Has borrado un elemento!");
				break;
			case 3:
				System.out.println("Has modificado un elemento!");
				break;
			case 4:
				System.out.println("Has mostrado un elemento por pantalla");
				UtilidadesEjercicio01.mostrarMenu();
				break;
			case 5:
				System.out.println("Hasta Luego!");
				break;
			case 6:
				System.out.println("Has elegido salto de linea");
				UtilidadesEjercicio01.saltos(10);
				break;
			default:
				System.out.println("Has elegido la opcion incorrecta!");
				break;
			}
		} while (opcion != 5);
		scan.close();
	}

}
