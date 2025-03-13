package examen2.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		Date now = new Date();
		System.out.println("------------------| MENÚ FECHAS |--------------------------------" +
		 "\n| 1 – Qué hora es? \t\t\t\t\t\t|\n| 2 – Qué día de la semana es? \t\t\t\t\t|\n| 3 – Cuántos días quedan para para las vacaciones de Navidad? \t|" +
				"\n| 0 – Cerrar el programa \t\t\t\t\t|\n-----------------------------------------------------------------");
		System.out.println("Introduce una opcion:");
		boolean opcionIncorrecta = false;
		do {
			int opcion = scan.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("La hora es: " + UtilidadesExamen.obtenerHoraActual(now));
				opcionIncorrecta = false;
				break;
			case 2:
				Calendar diaSemana = Calendar.getInstance();
				System.out.println("Es " + UtilidadesExamen.obtenerDiaSemana(diaSemana));
				opcionIncorrecta = false;
				break;
			case 3:
				System.out.println("Estamos A " + UtilidadesExamen.CalcularHastaVacaciones(now));
				opcionIncorrecta = false;
				break;
			case 0:
				System.out.println("Hasta Pronto : )");
				opcionIncorrecta = false;
				break;
			default:
				String menu = "";
				System.out.println("Has Introducido Una Opcion Incorrecta. Vuelve A Introducir Una Opcion:");
				System.out.println(UtilidadesExamen.DevolverMenu(menu));
				opcionIncorrecta = true;
				break;
			}
			
		} while (opcionIncorrecta);
		scan.close();
	}

}
