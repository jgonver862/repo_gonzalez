package BeforeProjects;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa indicara si un número es o no capicúa.");
		System.out.println("Introduce un número");
		long numero = scan.nextLong();
		long numActual = numero;
		int numCifras = 1;
		while (numActual / 10 != 10) {
			numCifras++;
			numActual = numActual / 10;
		}
		boolean capicua = true;
		for (int i = 0; i < numCifras / 2; i++) {
			double numDiv = Math.pow(10, numCifras - i);
			double numMod = Math.pow(10, i);
			double numDelante = (numero/numDiv)%10;
			double numDetras = (numero/numMod)%10;
			if (numDelante != numDetras) {
				System.out.println("No Es Capicua");
				capicua = false;
			} else {
				System.out.println("Es Capicua");
				capicua = true;
			}
			scan.close();		}
	}

}
