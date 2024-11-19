package EjerciciosUD3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero y te dare el siguiente primo:");
		long numero = scan.nextLong();
		System.out.println("El numero de digitos de " + numero + " es " + UtilidadesEjercicio01.esCapicua(numero));
		scan.close();
	}
}
