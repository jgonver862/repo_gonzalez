package EjerciciosUD1_UD2;

import java.util.Scanner;

public class Numero100 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 100;
		String salida = "";
		scan.close();
		salida = "100, 99";
		int f1 = 2;
		int f2 = 99;
		for (int indice = 1; indice >= n; indice++) {
			int nuevo = f2 - f1;
			salida = salida + ", " + nuevo;
			f2 = f1;
			f1 = nuevo;
		}
		System.out.println(salida);
	}

}
