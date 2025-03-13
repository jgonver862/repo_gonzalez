package BeforeProjects;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Utilidades {

	public static int calcularEdad(Date fechaNac) {
		int edad = 0;
		//La fecha del cumpleaños en el año actual
		Date fechaCumple = pasarFechaAnioActual(fechaNac);
		//La fecha del cumpleaños en el año actual en Calendar
		Calendar fechaCumpleCal = Calendar.getInstance();
		fechaCumpleCal.setTime(fechaCumple);
		//La fecha de nacimiento en calendar
		Calendar fechaNacCal = Calendar.getInstance();
		fechaNacCal.setTime(fechaNac);
		//Hoy en calendar
		Calendar fechaActualCal = Calendar.getInstance();
		//Comparamos hoy con la fecha del cumple
		if (fechaCumpleCal.before(fechaActualCal)) {
			edad = fechaActualCal.get(Calendar.YEAR) - fechaNacCal.get(Calendar.YEAR);
		} else {
			edad = fechaActualCal.get(Calendar.YEAR) - fechaNacCal.get(Calendar.YEAR) - 1;
		}
		return edad;
	}

	private static Date pasarFechaAnioActual(Date fecha) {
		Calendar fechaCal = Calendar.getInstance();
		int anioActual = fechaCal.get(Calendar.YEAR);
		fechaCal.setTimeInMillis(fecha.getTime());
		fechaCal.set(Calendar.YEAR, anioActual);
		Date fechaAnioActual = new Date();
		fechaAnioActual.setTime(fechaCal.getTimeInMillis());
		return fechaAnioActual;
	}

	public static double CalcularPesoIdeal (double Peso) {
		Scanner scan = new Scanner(System.in);

		System.out.println("¿Cual Es Tu Nombre?");
		String nombre = scan.nextLine();

		System.out.println("Hola " + nombre);
		System.out.println("¿Que Sexo Eres?");
		boolean opcionincorrecta = false;
		do {

			String sexo = scan.nextLine();

			switch (sexo) {
			case "Hombre":

				System.out.println("¿Cual Es Tu Altura?");
				double alturaH = scan.nextDouble();

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
				opcionincorrecta = true;
				break;
			}
			
		} while (opcionincorrecta);

		scan.close();
		return Peso;
	}
	
}

