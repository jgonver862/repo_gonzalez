package com.JuanAntonioGV.tarea2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 3;
		String contraseña = "SXD0001";
		System.out.println("Introduce la contraseña: ");
		boolean opcionincorrecta = false;
		do {
			String imput = scan.nextLine();
			if (contraseña.equals(imput)) {
				System.out.println("Enhorabuena, La Contraseña Es Correcta");
				break;
			} else {
				cont--;
				System.err.println("La Contraseña Introducida Es Incorrecta. Te Queda " + cont + " intentos.");
				opcionincorrecta = true;
			}
			if (cont == 0) {
				System.err.println("ACCESO DENEGADO. Has llegado al limite de intentos.");
				break;
			}
		} while (opcionincorrecta);

		scan.close();
	}

}
