package EjerciciosUD1_UD2;

import java.util.Scanner;

public class MayorNumeroWhile {

	public static void main(String[] args) {
		// opcion B. Establecemos una instruccion de parada
		// La instruccion de parada sera STOP

		// declaración del scanner para obtener los datos por teclado
		Scanner scan = new Scanner(System.in);
		// Petición al usuario de los datos de entrada y se guardan en variables
		System.out.println("Este programa devuelve el mayor de todos los números introducidos");
		System.out.println("Introduce \"STOP\" cuando quieras parar de introducir números");
		int mayorNumero = Integer.MIN_VALUE;
		String dato = "";
		boolean salir = false;
		do {
			System.out.println("Introduce un entero:");
			dato = scan.nextLine();
			if ("STOP".equalsIgnoreCase(dato)) {
				salir = true;
			} else {
				int datoEntero = Integer.parseInt(dato);
				// asignacion de valor a mayorNumero con operador ternario
				// mayorNumero = datoEntero > mayorNumero ? datoEntero : mayorNumero;
				// asignacion de valor a mayorNumero con una estructura de decisión
				if (datoEntero > mayorNumero) {
					mayorNumero = datoEntero;
				}
			}
		} while (!salir);
		scan.close();
		// salir = "STOP".equalsIgnoreCase(dato) ? true : false;
		// } while (!"STOP".equalsIgnoreCase(dato));

//		while (condicion) {
//
//		}

		System.out.println("El mayor número introducido es el " + mayorNumero);

	}

}
