package Ejercicios;

import java.util.Scanner;

public class EscribirSimbolo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean error = false;
		String simbolo = "";
		int repeticiones = 0;
		String direccion = "";
		do {
			System.out.println("Introduce el símbolo que quieres repetir (+ * $ €)");
			simbolo = scan.nextLine();

			System.out.println("Introduce cuántas veces quieres repetirlo");
			repeticiones = scan.nextInt();

			System.out.println("Introduce en qué dirección lo quieres escribir (vertical o horizontal)");
			scan.nextLine();
			direccion = scan.nextLine();

			if (!"+".equals(simbolo) && !"*".equals(simbolo) && !"$".equals(simbolo) && !"€".equals(simbolo)) {
				error = true;
			}

			if (repeticiones < 3 || repeticiones > 10) {
				error = true;
			}
			if (!"vertical".equalsIgnoreCase(direccion) && !"horizontal".equalsIgnoreCase(direccion)) {
				error = true;
			}

		} while (error);

		int indice = 0;
		while (indice < repeticiones && !error) {
			if ("vertical".equalsIgnoreCase(direccion)) {
				System.out.println(simbolo);
			} else {
				System.out.print(simbolo);
			}
		}
		indice++;

		scan.close();

	}
}
