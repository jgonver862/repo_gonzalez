package EjerciciosUD1_UD2;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero para ver si es primo o no: ");
		int numero = scan.nextInt();
		boolean esPrimo = true;
		scan.close();
		for (int divisor = 2; divisor < numero; divisor++) {
			if (numero % divisor == 0) {
				esPrimo = false;
			}
		}
		if (esPrimo) {
			System.out.println("El numero " + numero + " es primo");
		} else {
			System.out.println("El numero " + numero + " no es primo");
		}
	}

}
