package Ejercicio7;

import java.util.Scanner;

public class CuentaBancariaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------- MENU CUENTA BANCARIA -------------");
		System.out.println("| 1.- Abrir una nueva cuenta.  \t\t\t|");
		System.out.println("| 2.- Ver el listado de las cuentas disponibles |");
		System.out.println("| 3.- Obtener los datos de una cuenta concreta. |");
		System.out.println("| 4.- Realizar un ingreso en una cuenta. \t|");
		System.out.println("| 5.- Retirar efectivo de una cuenta. \t\t|");
		System.out.println("| 6.- Consultar el saldo actual de una cuenta. \t|");
		System.out.println("| 7.- Salir de la aplicación. \t\t\t|");
		System.out.println("-------------------------------------------------");
		scan.close();
	}

}
