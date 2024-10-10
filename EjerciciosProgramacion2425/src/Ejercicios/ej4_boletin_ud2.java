package Ejercicios;

import java.util.Scanner;

/**
 * Realiza un programa que resuelve una ecuación de segundo grado
 * ax2 + bx + c = 0
 */


public class ej4_boletin_ud2 {

	public static void main(String[]args) {
		
		//Scanner y recolección de datos
		
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuanto Valdra x?");
		System.out.print("a vale: ");
		double a = scan.nextDouble();
		System.out.print("b vale: ");
		double b = scan.nextDouble();
		System.out.print("c vale: ");
		double c = scan.nextDouble();
		
		//Operaciones
		
		if (a == 0) {
			System.out.println("El valor a no puede ser 0");
		} else if (Math.pow(b, 2) <= 4*a*c) {
			System.out.println("El valor b cuadrado debe ser mayor que 4*a*c");
		}
		
		double xPositivo = (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		double xNegativo = (-b - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		
		System.out.println("Las soluciones son: " + xPositivo + " y " + xNegativo);
		scan.close();
	}
}
