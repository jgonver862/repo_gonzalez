package EjerciciosUD1_UD2;

import java.util.Scanner;

/**
 * Clase para el saludo pro en java
 * Saluda con Hola amigo si el usuario no introduce su nombre
 * Saluda con Hola nombre si el usuario introduce su nombre
 */

public class HolaMundoPro {

	public static void main(String[] args) {
		// metodo main
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		// Cuando el usuario no mete ningun nombre, el valor que guarda es una cadena
		// vacia, es decir, ""
		nombre = "".equals(nombre) ? "Mundo" : nombre;
		System.out.println("Hola " + nombre + "!");
		scan.close();
	}

}
