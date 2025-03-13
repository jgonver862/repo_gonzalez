package EjerciciosUD1_UD2;

import java.util.Scanner;

public class DiasDeLaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Que Dia De La Semana Es Hoy?");
		boolean opcionincorrecta = false;
		do {
			String dato = scan.nextLine();
			switch (dato) {
			case "Lunes":
				System.out.println("Es " + dato
						+ " por tanto, Toca: \n 15:30-16:30 Entornos De Desarrollo \n 16:30-17:30 Entornos De Desarrollo \n 17:30-18:30 Formacion Y Orientacion Laboral \n 18:30-18:45 Recreo"
						+ "\n 18:45-19:45 Formacion Y Orientacion Laboral \n 19:45-20:45 Lenguaje De Marcas Y Sistema De Gestion De Informacion "
						+ "\n 20:45-21:45 Lenguaje De Marcas Y Sistema De Gestion De Informacion");
				opcionincorrecta = false;
				break;
			case "Martes":
				System.out.println("Es " + dato
						+ " por tanto, Toca: \n 15:30-16:30 Programacion \n 16:30-17:30 Programacion \n 17:30-18:30 Formacion Y Orientacion Laboral \n 18:30-18:45 Recreo \n"
						+ " 18:45-19:45 Sistemas Informaticos \n 19:45-20:45 Base De Datos \n"
						+ " 20:45-21:45 Base De Datos");
				opcionincorrecta = false;
				break;
			case "Miercoles":
				System.out.println("Es " + dato
						+ " por tanto, Toca: \n 15:30-16:30 Base De Datos \n 16:30-17:30 Base De Datos \n 17:30-18:30 Programacion \n 18:30-18:45 Recreo "
						+ "\n 18:45-19:45 Programacion \n 19:45-20:45 Sistemas Informaticos \n 20:45-21:45 Sistemas Informaticos");
				opcionincorrecta = false;
				break;
			case "Jueves":
				System.out.println("Es " + dato
						+ " por tanto, Toca: \n 15:30-16:30 Lenguaje De Marcas Y Sistema De Gestion De Informacion \n "
						+ "16:30-17:30 Sostenibilidad Aplicada Al Sistema Productivo \n 17:30-18:30 Entornos De Desarrollo \n 18:30 - 18:45 Recreo "
						+ "\n 18:45-19:45 Programacion \n 19:45-20:45 Programacion \n 20:45-21:45 Digitalización Aplicada a los Sectores Productivos GS");
				opcionincorrecta = false;
				break;
			case "Viernes":
				System.out.println("Es " + dato
						+ " por tanto, Toca: \n 15:30-16:30 Programacion \n 16:30-17:30 Programacion \n 17:30-18:30 Sistemas Informaticos"
						+ "\n 18:30-18:45 Recreo \n 18:45-19:45 Sistemas Informaticos \n 19:45-20:45 Base De Datos \n 20:45-21:45 Base De Datos");
				opcionincorrecta = false;
				break;
			case "Sabado":
				System.out.println("Es " + dato + " por tanto, hoy no hay clases.");
				opcionincorrecta = true;
				break;
			case "Domingo":
				System.out.println("Es " + dato + " por tanto, hoy no hay clases.");
				opcionincorrecta = true;
				break;
			default:
				System.err.println("No existe el dia " + dato);
				opcionincorrecta = true;
				break;
			}
			
		} while (opcionincorrecta);

		scan.close();
	}

}
