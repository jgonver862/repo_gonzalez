package EjerciciosUD1_UD2;

import java.util.Scanner;

public class HolaYo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		System.out.println("Introduce tu año de nacimiento: ");
		short anioNacimiento = scan.nextShort();
		short edad = (short) (2024 - anioNacimiento);
		System.out.println("Hola " + nombre + "!" + " Tienes " + edad + " años.");
		scan.close();

	}

}
