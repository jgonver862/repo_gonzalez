package Ejercicios;

import java.util.Scanner;

/**
 * Introduciendo un año de nacimiento el programa dira si eres: bebe: 0 - 2 años
 * niñ@: 3 - 11 años adolescente: 12 - 18 años adulto: 19 - 65 años anciano: +65
 * años Mostrara un mensaje de error si tiene menos de 0 años
 */

public class EtapaVital {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿En que año naciste?");
		int anio = scan.nextInt();
		int edad = 2024 - anio;
		if (edad >= 0 && edad <= 2) {
			System.out.println("Eres un bebe");
		} else if (edad >= 3 && edad <= 11) {
			System.out.println("Eres un niñ@");
		} else if (edad >= 12 && edad <= 18) {
			System.out.println("Eres un adolescente");
		} else if (edad >= 19 && edad <= 65) {
			System.out.println("Eres un adulto");
		} else if (edad > 65) {
			System.out.println("Eres un anciano");
		} else {
			System.err.println("No puede haber una persona con menos de 0 años");
		}
		scan.close();
	}

}
