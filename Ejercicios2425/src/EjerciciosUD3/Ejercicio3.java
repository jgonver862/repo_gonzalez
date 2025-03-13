package EjerciciosUD3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intentos = 25;
		int positivos;
		int negativos;
		int numeros;
		for(numeros = 25; numeros > 0; numeros--) {
			System.out.println("Introduce un numero. Tienes " + intentos + " intentos");
			numeros = scan.nextInt();
			intentos--;
		}
		scan.close();
		
		if (numeros >= 0) {
			try {
				UtilidadesEjercicio01.imprimePositivos(numeros);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		
		} else {
			try {
				UtilidadesEjercicio01.imprimeNegativos(numeros);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
	
		 }
		 
		 
	}


