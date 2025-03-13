package BeforeProjects;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		float[] temperaturas = new float[12];
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < meses.length; i++) {
			System.out.printf("Introdue la tempretaura media en el mes de diciembre");
			temperaturas[i] = scanner.nextFloat();
		}
		scanner.close();
		for (int i = 0; i < meses.length; i++) {
			System.out.println(meses[i] + "\t\t");
			for (int j = 0; j < temperaturas[i];j++) {
				System.out.println("@");
			}
			System.out.print("\n");
		}
		
	}

}
