package EjercicioTutorial;

import java.util.Scanner;

public class ClaseMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CuerpoClase bombilla = new CuerpoClase("Osram", 60f, 4.75f);
		System.out.println(bombilla);
		bombilla.encender();
		System.out.println(bombilla);
		scan.close();
	}

}
