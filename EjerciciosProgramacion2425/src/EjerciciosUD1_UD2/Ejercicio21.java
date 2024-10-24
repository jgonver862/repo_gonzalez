package EjerciciosUD1_UD2;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tienes Que Introducir Diez Números:");
		int positivos = 0;
		int negativos = 0;
		for (int numeros = 10; numeros > 0; numeros--) {
			System.out.println("Introduce un numero (quedan " + numeros + ")");
			int numero = scan.nextInt();
			if (numero >= 0) {
				positivos++;
			} else {
				negativos++;
			}
		}
		scan.close();
		System.out.println("Has introducido \nNumeros positivos: " + positivos + "\nNumeros negativos: " + negativos);
	}

}
