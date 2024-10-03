package Ejercicios;

import java.util.Scanner;

public class CifraPrimeraUltima1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = scan.nextInt();
		System.out.println("Elige Una Opción: " 
							+ "1.- Descubrir La Primera Cifra." 
							+ "2.- Descubrir La Segunda Cifra."
							);
		boolean opcionIncorrecta = false;
		do {
			int opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				// Obtiene la primera cifra del numero
				int dividendo = numero;
				int primeraCifra = 0;
				while (dividendo != 0) {
					// dividendo = dividendo/10;
					primeraCifra = dividendo;
					// la siguiente linea es equivalente a --> dividendo = dividendo / 10;
					dividendo /= 10;

				}
				System.out.println("El Primer Numero Es: " + primeraCifra);
				break;
			case 2:
				// Obtiene la ultima cifra del númerp
				int ultimaCifra = numero % 10;
				System.out.println("El Ultimo Numero Es: " + ultimaCifra);
				break;
			default:
				// no se ha introducido ni el 1 ni el 2
				opcionIncorrecta = true;
				System.out.println("No Has Elegido Una Opción Valida");
				break;
			}

		} while (opcionIncorrecta);

		scan.close();

	}
}