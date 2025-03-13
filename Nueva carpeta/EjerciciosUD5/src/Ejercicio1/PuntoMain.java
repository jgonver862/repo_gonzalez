package Ejercicio1;

import java.util.Scanner;

public class PuntoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce El Valor De X: ");
		double x = scan.nextDouble();
		System.out.println("Introduce El Valor De Y: ");
		double y = scan.nextDouble();
		Punto Area = new Punto(x, y);
		System.out.println(Area);
		scan.close();

	}

}
