package BeforeProjects;

import java.util.Scanner;

public class TemperaturaDelOrdenador {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("¿Cual Es La Temperatura De Tu CPU?");

		double temperaturaCPU = Scan.nextDouble();

		if (temperaturaCPU >= 80.0) {
			System.out.println("La CPU esta en una alta temperatura. 🔥🔥");
		} else if (temperaturaCPU >= 70.0 && temperaturaCPU < 80.0) {
			System.out.println("La CPU se esta calentando. 🔥");
		} else if (temperaturaCPU >= 45.0 && temperaturaCPU <= 60.0) {
			System.out.println("La CPU esta en una temperatura normal.");
		} else {
			System.out.println("La CPU esta en una temperatura baja");
		}
		Scan.close();
	}

}
