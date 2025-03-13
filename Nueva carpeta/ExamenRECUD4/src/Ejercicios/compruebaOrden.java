package Ejercicios;

import java.util.Scanner;

public class compruebaOrden {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros;
		System.out.println("Introduce numeros del 1 al 99");
		String numeroIntro = scan.nextLine();

		
	}
	
	
	
	private static void compruebaEntrada(String numeroIntro) {
		if (Integer.parseInt(numeroIntro) < 1 || Integer.parseInt(numeroIntro) > 99) {
			System.out.println("No vale ese numero.");
		}
		
	}

	
	private static void compruebaOrden (String numeroIntro) {
		boolean ordenado = true;
		int[] numeros;
		int i = 0;
		while (ordenado && i < numeros.length) {
			if (!OrdenCorrecto(numeros[i - 1], numeros[1])) {
				ordenado = false;
			}
		
		}
	}
	
	private static boolean OrdenCorrecto(String string, String string2) {
		return string.charAt(1) <= string2.charAt(0);
	}
}
