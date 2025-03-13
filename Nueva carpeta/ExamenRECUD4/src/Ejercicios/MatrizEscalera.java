package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class MatrizEscalera {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el numero de filas: ");
		int filas = scan.nextInt();
		System.out.println("Introduce el numero de columnas: ");
		int columnas = scan.nextInt();
		int[][] matriz = new int[filas][columnas];
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Introduce el valor en la posicion " + i + " y " + j);
				matriz[i][j] = scan.nextInt();
			}
		
		}
		System.out.println("-- MATRIZ ESCALERA --");
		mostrarEscalera(matriz);
		
		System.out.println("-- MATRIZ DIMENSIONAL --");
		crearMatrizDimMN(filas, columnas);
		System.out.println("-- ¿ES TIPO ESCALERA? --");
		esTipoEscalera(matriz);

	}
	
	private static void mostrarEscalera(int[][] matriz) {
		boolean esTipoEscalera = esTipoEscalera(matriz);
		try {
			if (esTipoEscalera == true) {
				for(int i = 0; i < matriz.length; i++) {
					for(int j = 0; j < matriz[0].length; j++) {
						System.out.print(matriz[i][j] + "\t");
					}
					System.out.print("\n");
				}
			} 
		} catch (IllegalArgumentException e) {
			if (esTipoEscalera == false) {
				System.err.println("La matriz no es tipo escalera.");
				e.printStackTrace();
			}
			
		}
		
	}

	private static void crearMatrizDimMN(int filas, int columnas) {
		Random R = new Random();
		int[][] matriz = new int[filas][columnas];
		filas = matriz.length;
		columnas = matriz[0].length;
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = R.nextInt(11) - 10;
			}
		}
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
		
		}
	
	
	private static boolean esTipoEscalera(int[][] matriz) {
		int filas = matriz.length;
		int columnas = matriz[0].length;
		boolean esTipoEscalera = true;
		if (filas == columnas) {
			int sumAnterior = matriz[0][0];
			for (int j = 3; j < matriz[0].length; j++) {
				int sumActual = matriz[j][j];
				
				for (int i = 0; i < j; i++) {
					sumActual += matriz[j][i]/sumAnterior;
					sumActual += matriz[i][j]/sumActual;
				}
				if (sumActual <= sumAnterior) {
					esTipoEscalera = false;
				}
				sumAnterior = sumActual;
			}
		} else {
			esTipoEscalera = false;
		}
		if (esTipoEscalera == false) {
				System.err.println("La matriz no es tipo escalera.");
		} else {
			System.out.println("Si, Es Tipo Escalera");
		}
		return esTipoEscalera;
	}
	
	
}
