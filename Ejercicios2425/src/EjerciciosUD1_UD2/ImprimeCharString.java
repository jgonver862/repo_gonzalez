package EjerciciosUD1_UD2;

import java.util.Scanner;

/**
 * Escribe un programa que declare variables de tipo char y de tipo String.
 * Intenta mostrarlas por pantalla todas juntas en la misma linea y con una sola
 * sentencia de Java (con un solo println)
 */

public class ImprimeCharString {

	public static void main(String[] args) {
		int entero = 4;
		Scanner scan = new Scanner(System.in);
		char caracter = 'r';
		String cadena = "hola";
		System.out.println("" + entero + caracter + cadena);

		scan.close();
	}

}
