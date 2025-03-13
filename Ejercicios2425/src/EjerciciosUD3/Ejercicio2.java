package EjerciciosUD3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		try {
			System.out.println("Introduce El Valor De A:");
			a = scan.nextInt();
			System.out.println("Introduce El Valor De B: ");
			b = scan.nextInt();
			int result = a / b;
			System.out.println("El Resultado Es: " + result);
		} catch (InputMismatchException e) {
			System.out.println("Solo se permite introducir numeros enteros");
		} catch (ArithmeticException e) {
			System.out.println("No se permite dividir por 0");
		}

		scan.close();

	}
}
