package BeforeProjects;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		char[] letras = new char[10];
		String salida = StringUtils.EMPTY;
		for (int i = 0; i < letras.length;  i++) {
			char random = (char) (Math.random()*26 + 'a');
			letras[i] = random;
			salida += random + StringUtils.SPACE;
		}
		System.out.println("Introduce la letra a sustituir y la que sustituye separalo con un espacio");
		Scanner scanner = new Scanner(System.in);
		String cambio = scanner.nextLine();
		scanner.close();
		char caracterSustitucion = cambio.charAt(0);
		char diferencia = (char)('A' - 'a');
		char caracterSustituto = (char) (cambio.charAt(2) -  diferencia);
		salida = StringUtils.EMPTY;
		for (int i = 0; i < letras.length; i++) {
			char caracterActual = letras[i];
			if (letras[i] == caracterSustitucion) {
				letras[i] = caracterSustituto;
				salida += caracterSustituto + StringUtils.SPACE;
			} else {
				salida += letras[i] + StringUtils.SPACE;
			}
			}
		
	}
}
