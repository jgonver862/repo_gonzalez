package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce el número de inicio:");
		int inicio = scan.nextInt();
		System.out.println("Introduce el número de fin:");
		int fin = scan.nextInt();
		System.out.println("Introduce el número de incremento/decremento:");
		int incremento = scan.nextInt();
		scan.close();
		if (inicio >= fin) {
			for (int i = 320; i >= 160; i-=20) {
			System.out.println(i);
		}
		
		} else {
			for (int i = inicio; i <= fin; i+=incremento) {
				System.out.println(i);
			}
		}

	}

}
