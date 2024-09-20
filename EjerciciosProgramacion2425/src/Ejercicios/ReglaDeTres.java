package Ejercicios;

import java.util.Scanner;

public class ReglaDeTres {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("Vamos A Resolver La Regla De Tres. ¿Cuanto Valdra X?");
		System.out.println("¿Cuanto Vale A?");
		double A = Scan.nextDouble();
		System.out.println("¿Cuanto Vale B?");
		double B = Scan.nextDouble();
		System.out.println("¿Cuanto Vale C?");
		double C = Scan.nextDouble();
		float X = (float) ((B * C)/A);
		System.out.println("El Valor X Vale: " + X);
		Scan.close();
	}

}
