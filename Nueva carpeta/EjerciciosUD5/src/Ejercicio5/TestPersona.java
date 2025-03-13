package Ejercicio5;

import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dni = "";
		System.out.println("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		System.out.println("Introduce Tu Edad: ");
		int edad = scan.nextInt();
		System.out.println("Introduce Tu Sexo: ");
		char sexo;
		sexo = scan.next().charAt(0);
		System.out.println("Introduce Tu Peso: ");
		double peso = scan.nextDouble();
		System.out.println("Introduce Tu Altura: ");
		double altura = scan.nextDouble();
		Persona P1 = new Persona(nombre, edad, dni, sexo, peso, altura);
		System.out.println(P1);
		P1.esMayorDeEdad(edad);
		scan.close();
	}

}
