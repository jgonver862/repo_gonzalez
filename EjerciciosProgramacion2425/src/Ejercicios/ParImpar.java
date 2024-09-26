package Ejercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Introduce un número entero y veremos si es par o impar: ");
		int numero = Scan.nextInt();
		String Paridad;
		Paridad = numero % 2 == 0 ? "Par" : "Impar";
		System.out.println("El numero introducido es: " + numero + " Y Es: " + Paridad);
		Scan.close();
	}

}
