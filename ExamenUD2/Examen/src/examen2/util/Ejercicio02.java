package examen2.util;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("Ingresar datos: ");
		System.out.println("Consumo Medio (litros/100): ");
		double consumomedio = Scan.nextDouble(); 
		System.out.println("Combustible disponible (litros):");
		double combustible = Scan.nextDouble();
		
		
		System.out.println("\nCalculos:");
		double consumoporkilometros = 0d;
		System.out.println("Consumo por kilómetro: " + UtilidadesExamen.consumoKilometros(consumoporkilometros, consumomedio) + " 1/km");
		System.out.println("Rango Estimado De Viaje: " + UtilidadesExamen.RangoEstimado(consumomedio, combustible) + " km");
		System.out.println(UtilidadesExamen.EstRango(consumomedio, combustible));
		System.out.println(UtilidadesExamen.consumoEficiente(consumomedio));
		Scan.close();
	}

}
