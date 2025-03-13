package BeforeProjects;

import java.util.Scanner;

public class Calculadora {

	/*
	 * Este programa sirve como calculadora.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double suma;
		double resta;
		double multiplicacion;
		double division;
		System.out.println(" --- CALCULADORA --- ");
		System.out.println(" 1. - SUMA");
		System.out.println(" 2. - RESTA");
		System.out.println(" 3. - MULTIPLICACION");
		System.out.println(" 4. - DIVISION");
		int calculadora = scan.nextInt();
		double resultado1 = 0d;
		double resultado2 = 0d;
		switch (calculadora) {
		case 1:
			resultado1 = scan.nextDouble();
			resultado2 = scan.nextDouble();
			suma = resultado1 + resultado2;
			System.out.println(suma);
			break;
		case 2:
			resultado1 = scan.nextDouble();
			resultado2 = scan.nextDouble();
			resta = resultado1 - resultado2;
			System.out.println(resta);
			break;
		case 3:
			resultado1 = scan.nextDouble();
			resultado2 = scan.nextDouble();
			multiplicacion = resultado1 * resultado2;
			System.out.println(multiplicacion);
			break;
		case 4:
			resultado1 = scan.nextDouble();
			resultado2 = scan.nextDouble();
			division = resultado1 / resultado2;
			System.out.println(division);
			break;
		default:
			System.out.println("ERROR");
		}
		scan.close();
	}

}
