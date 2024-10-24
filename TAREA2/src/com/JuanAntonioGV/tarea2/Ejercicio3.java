package com.JuanAntonioGV.tarea2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mayorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;
		String numero = "";
		int sumaentero = 0;
		double mediaaritmetica = 0d;
		boolean salir = false;
		int cadena = 0;
		do {
			System.out.println("Introduce un numero");
			numero = scan.nextLine();
			cadena++;
			if ("0".equals(numero)) {
				salir = true;
			} else {
				int numeros = Integer.parseInt(numero);
				sumaentero = Integer.sum(sumaentero, numeros);
				mediaaritmetica = sumaentero/cadena;
				if(numeros > mayorNumero) {
					mayorNumero = numeros;
				}  
				if (numeros < menorNumero) {
					menorNumero = numeros;
				}
			}
			
			
		} while (!salir);
		scan.close();
		
		System.out.println("El mayor numero es: " + mayorNumero + "\nEl menor numero es: " + menorNumero + "\nLa suma de los numeros es: " + sumaentero
				+ "\nLa media aritmetica vale: " + mediaaritmetica);
	}

}
