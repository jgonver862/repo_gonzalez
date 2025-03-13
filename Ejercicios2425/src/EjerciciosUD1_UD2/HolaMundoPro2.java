package EjerciciosUD1_UD2;

import java.util.Scanner;

public class HolaMundoPro2 {

	public static void main(String[] args) {
		// metodo main
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		// Cuando el usuario no mete ningun nombre, el valor que guarda es una cadena
		// vacia, es decir, ""
		// nombre = "".equals(nombre) ? "Mundo" : nombre;
		/*
		 // Version con if simple
		 if ("".equals(nombre)) {
		 	nombre = "amigo";
		 }
		 System.out.println("Hola " + nombre + "|");
		 */
		// Version con if compuesto
		if(!"".equals(nombre)) {
			// Si se cumple la condicion
			System.out.println("Hola " + nombre + "!");
		} else {
			// Si no se cumple la condicion 
			System.out.println("Hola amigo!");
		}
		scan.close();
	}

}
