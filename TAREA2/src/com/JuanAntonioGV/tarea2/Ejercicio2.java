package com.JuanAntonioGV.tarea2;

import java.util.Scanner;

public class Ejercicio2 {


	/*
	 * Este programa sirve como calculadora.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double suma;
		double resta;
		double multiplicacion;
		double division;
		double raizcuadrada;
		double potencia;
		System.out.println(" ~~~~~~~~~~~~~~ | CALCULADORA |~~~~~~~~~~~~~~ ");
		System.out.println(" 1. - Suma");
		System.out.println(" 2. - Resta");
		System.out.println(" 3. - Multiplicacion");
		System.out.println(" 4. - Division");
		System.out.println(" 5. - Raiz cuadrada");
		System.out.println(" 6. - Potencia");
		System.out.println(" 0. - Salir del programa");
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		boolean opcionincorrecta = false;
		double numero1 = 0d;
		double numero2 = 0d;
		do {
			int calculadora = scan.nextInt();
			switch (calculadora) {
			case 1:
				System.out.print("Introduce el primer numero: ");
				numero1 = scan.nextDouble();
				System.out.print("Introduce el segundo numero: ");
				numero2 = scan.nextDouble();
				suma = numero1 + numero2;
				System.out.println("La suma de esos dos numeros vale: " + "\n" + numero1 + " + " + numero2 + " = " + suma);
				opcionincorrecta = false;
				break;
			case 2:
				System.out.print("Introduce el primer numero: ");
				numero1 = scan.nextDouble();
				System.out.print("Introduce el segundo numero: ");
				numero2 = scan.nextDouble();
				resta = numero1 - numero2;
				System.out.println("La resta de esos dos numeros vale: " + "\n" + numero1 + " - " + numero2 + " = " + resta);
				opcionincorrecta = false;
				break;
			case 3:
				System.out.print("Introduce el primer numero: ");
				numero1 = scan.nextDouble();
				System.out.print("Introduce el segundo numero: ");
				numero2 = scan.nextDouble();
				multiplicacion = numero1 * numero2;
				System.out.println("La multiplicacion de esos dos numeros vale: " + "\n" + numero1 + " x " + numero2 + " = " + multiplicacion);
				opcionincorrecta = false;
				break;
			case 4:
				System.out.print("Introduce el primer numero: ");
				numero1 = scan.nextDouble();
				System.out.print("Introduce el segundo numero: ");
				numero2 = scan.nextDouble();
				division = numero1 / numero2;
				System.out.println("La division de estos dos numeros vale: " + "\n" + " " + numero1 + "\n" + "------ = "  + division + "\n" + " " + numero2);
				opcionincorrecta = false;
				break;
			case 5:
				System.out.print("Introduce el numero: ");
				numero1 = scan.nextDouble();
				raizcuadrada = Math.sqrt(numero1);
				System.out.println("La raiz cuadrada vale: " + "\n" + " _____" + "\n" + "√ " + numero1 + "  = " + raizcuadrada);
				opcionincorrecta = false;
				break;
			case 6:
				System.out.print("Introduce un numero: ");
				numero1 = scan.nextDouble();
				System.out.print("Introduce el numero al que lo quieres elevar: ");
				numero2 = scan.nextDouble();
				potencia = Math.pow(numero1, numero2);
				System.out.println("El resultado de la potencia vale: " + "\n" + " " + numero2 + "\n" + numero1 + "  = " + potencia);
				opcionincorrecta = false;
				break;
			case 0:
				System.out.println("Gracias por usar la calculadora.");
				opcionincorrecta = false;
				break;
			default:
				System.err.println("ERROR");
				opcionincorrecta = true;
				break;
		}
			
		} while (opcionincorrecta);
		
		
		scan.close();
		
	}

}
	

