package com.JuanAntonioGonzalezVerdugo.tarea2;

import java.util.Scanner;

public class UtilidadesMatematicas {

	public static String juntaNumeros (int numero1, int numero2) {
		String juntaNumeros = String.valueOf(numero1) + String.valueOf(numero2);
		return juntaNumeros;
	}
	public static int posicionDigito (int numero) {
		Scanner scan = new Scanner (System.in);
		int numeroN = scan.nextInt();
		int numCifras = 1;
		while (numeroN / 10 != 0) {
			numCifras++;
			numeroN = numero / 10;
		}
		scan.close();
		return numCifras;
	
		
	}
	
	public static int Factorial (int numeroF) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce Un Numero");
		int NumeroF = scan.nextInt();
		System.out.println("Introduce Hasta Que Numero Quieres Hacer El Factorial.");
		int Factorial = scan.nextInt();
		for (int contador = 1; contador < Factorial; contador++) {
			NumeroF = NumeroF * contador;
			System.out.println(NumeroF + " x " + contador + " = " + NumeroF);
		}
		scan.close();
		
		return NumeroF;
		
	
		
	}

	public static double CambioExacto (int Fraccion) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce el numero al que quieras hacer el cambio exacto");
		double NumeroFraccional = scan.nextDouble();
		for (int simplificar = 1; simplificar <= 3; simplificar++){
			int SimplificarFraccion = (int) (NumeroFraccional * 100) / 4;
			int Dividir100 = 100/4;
			System.out.println(SimplificarFraccion + "\n __________" + "\n" + Dividir100);
			if (SimplificarFraccion == 0) {
				System.out.println("No puede valer 0");
				break;
			}
			
			
			
		}
		System.out.println();
		
		
		
		
		scan.close();
		
		return NumeroFraccional;
		
		
		
	}

	public static int TrozoNumero (int TrozoNumero) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int numeroin = Scan.nextInt();
		System.out.println("Introduce un digito del numero introducido");
		int into = Scan.nextInt();
		
		int trozo = numeroin / into;
		
		System.out.println("El Trozo Es " + trozo );
		
		
		Scan.close();
		return TrozoNumero;
		
	}

}
