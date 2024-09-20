package BeforeProjects;

import java.util.Scanner;

public class Cuestionario {

	/*
	 * Este programa sirve para calcular el peso ideal de cada persona.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("¿Cual Es Tu Nombre?");
		String nombre = scan.nextLine();

		System.out.println("Hola " + nombre);
		System.out.println("¿Que Sexo Eres?");
		String sexo = scan.nextLine();

		switch (sexo) {
		case "Hombre":

			System.out.println("¿Cual Es Tu Altura?");
			double alturaH = scan.nextLong();

			System.out.println("¿Y Tu Peso?");
			double pesoH = scan.nextDouble();

			double pesoidealH = (((alturaH * 100) - 150) * 0.75) + 50;

			if (pesoidealH == pesoH) {
				System.out.println("Altura: " + alturaH);
				System.out.println("Peso: " + pesoH);
				System.out.println("Peso Ideal: " + pesoidealH);
				System.out.println("¡Enhorabuena! Estas En Tu Peso Ideal. Sigue Asi ;)");
			} else {
				System.out.println("Altura: " + alturaH);
				System.out.println("Peso: " + pesoH);
				System.out.println("Peso Ideal: " + pesoidealH);
				System.out.println("No Estas En Tu Peso Ideal. La Proxima Vez Sera ;,(");
			}
			break;
		case "Mujer":

			System.out.println("¿Cual Es Tu Altura?");
			double alturaM = scan.nextDouble();

			System.out.println("¿Y Tu Peso?");
			double pesoM = scan.nextDouble();

			double pesoidealM = (((alturaM * 100) - 150) * 0.6) + 50;

			if (pesoidealM == pesoM) {
				System.out.println("Altura: " + alturaM);
				System.out.println("Peso: " + pesoM);
				System.out.println("Peso Ideal: " + pesoidealM);
				System.out.println("¡Enhorabuena! Estas En Tu Peso Ideal. Sigue Asi ;)");
			} else {
				System.out.println("Altura: " + alturaM);
				System.out.println("Peso: " + pesoM);
				System.out.println("Peso Ideal: " + pesoidealM);
				System.out.println("No Estas En Tu Peso Ideal. La Proxima Vez Sera ;,(");
			}
			break;

		default:
			System.out.println("No Se Puede Realizar El Calculo");
			break;
		}
		scan.close();
	}
}
