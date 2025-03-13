package EjerciciosUD3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu fecha de nacimiento con formato \"dd-mm-aaaa\"");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String input = scan.nextLine();
		if (input.length() != 10) {
			System.err.println(
					"El formato introducido no es correcto, debes introducir la fecha con el formato correcto.");
		} else {
			try {
				Date fechaNacDate = sdf.parse(input);
				Calendar fechaAct = Calendar.getInstance();

				Calendar fechaNac = Calendar.getInstance();
				fechaNac.setTime(fechaNacDate);
				Calendar fechaCumple = fechaNac;
				fechaCumple.set(Calendar.YEAR, fechaAct.get(Calendar.YEAR));
				if (fechaCumple.before(fechaAct)) {
					// El cumple de este año ya paso
					fechaCumple.add(Calendar.YEAR, 1);
				}

				long milis = fechaCumple.getTimeInMillis() - fechaAct.getTimeInMillis();
				int dias = (int) (1 + milis / (1000 * 60 * 60 * 24));
				System.out.println("Quedan " + dias + " dias para tu cumpleaños");
				String diaCumple = sdf.format(fechaCumple.getTime());
				System.out.println("Tu proximo cumpleaños es el dia " + diaCumple);

			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		scan.close();
	}

}
