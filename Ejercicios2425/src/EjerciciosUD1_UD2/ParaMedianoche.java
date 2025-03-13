package EjerciciosUD1_UD2;

import java.util.Scanner;

/* Escribe un programa que dada una hora determinada (horas y minutos),
 * Calcula los segundos que faltan para llegar a la medianoche.
 */

public class ParaMedianoche {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("¿Cuanto falta para la medianoche?");
		System.out.println("Introduce la hora actual:");
		int hora = Scan.nextInt();
		System.out.println("Introduce los minutos actuales");
		int minutos = Scan.nextInt();
		int horasparaMedianoche = (23 - hora);
		int minutosparaMedianoche = (60 - minutos);
		int segparaMedianoche = (horasparaMedianoche * 3600) + (minutosparaMedianoche * 60);
		System.out.println("Faltan para la medianoche: " + segparaMedianoche + " segundos");
		Scan.close();
	}

}
