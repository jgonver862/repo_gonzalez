package Ejercicios;

import java.util.Scanner;

public class ej9_boletin_ud2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el carácter para formar la piramide");
		String input = scan.nextLine();
		boolean correcto = false;
		if (input.length() == 1) {
			char caracter = input.charAt(0);
			if (caracter >= 'A' && caracter <= 'Z') {
				correcto = true;
			} else if (caracter >= 'a' && caracter <= 'z') {
				correcto = true;
			} else if (caracter >= '0' && caracter <= '9') {
				correcto = true;
			} else if (caracter == '$' || caracter == '€' || caracter == '+' || caracter == '*' ) {
				correcto = true;
			} else {
				System.err.println("Solo puedes introducir un caracter");
			}
			
			if (correcto) {
				String piramide = "   " + caracter + "   " + "\n" + "  " + caracter + caracter + caracter + "   " + "\n" + " " + caracter + caracter + caracter + caracter + caracter + " ";
				System.out.println(piramide);
			}
		}	scan.close();

	}

}
