package BeforeProjects;

import java.util.Scanner;

/**
 * Devuelve según la opción 
 * 1. Cual es la primera cifra de un numero entero introducido por teclado
 * 2. Cual es la ultima cifra de un numero entero introducido por teclado
 */

public class CifraPrimeraUltimaPrueba {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cadena;
		System.out.println("Introduce un numero: ");
		int numero = scan.nextInt();
		cadena = String.valueOf(numero);
		System.out.println("Elige Una Opción: " + "1.- Descubrir La Primera Cifra." + "2.- Descubrir La Segunda Cifra.");
		int opcion = scan.nextInt();
		switch (opcion) {
		case 1:
			char primernumero = cadena.charAt(0);
			System.out.println("El Primer Numero Es: " + primernumero);
			break;
		case 2:
			char ultimonumero = cadena.charAt((cadena.length() - 1));
			System.out.println("El Ultimo Numero Es: " + ultimonumero);
			break;
		default:
			System.out.println("No Has Elegido Una Opción Valida");
			break;
		}
		scan.close();
	}

}
