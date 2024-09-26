package Ejercicios;

import java.util.Scanner;

public class ReglaDeTres {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("Teniendo Esta Regla De Tres: \n\t a -----> b  \n\t c -----> x");
		System.out.println("¿Cuanto Valdra X?");
		System.out.println("¿Cuanto Vale A?");
		double A = Scan.nextDouble();
		System.out.println("¿Cuanto Vale B?");
		double B = Scan.nextDouble();
		System.out.println("¿Cuanto Vale C?");
		double C = Scan.nextDouble();
		float X = (float) ((B * C)/A);
		System.out.println("La solucion seria:");
		System.out.print("\t" + A);
		System.out.print(" -----> ");
		System.out.print(B);
		System.out.println();
		System.out.print("\t" + C);
		System.out.print(" -----> ");
		System.out.print(X);
		Scan.close();
	}

}
