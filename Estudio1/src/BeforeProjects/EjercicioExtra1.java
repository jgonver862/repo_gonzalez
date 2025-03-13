package BeforeProjects;

import org.apache.commons.lang3.StringUtils;

public class EjercicioExtra1 {

	public static void main(String[] args) {
		
		int dimension = 1 + 'Z' - 'A';
		char[] caracteres = new char[dimension];
		char caracterActual = 'A';
		for (int indice = 0; indice < dimension; indice++) {
			caracteres[indice] = caracterActual++;
		}
		System.out.println("Mostramos los caracteres del array");
		String output = StringUtils.EMPTY;
		for (int indice = 0; indice < dimension; indice++) {
			output == StringUtils.SPACE + caracteres[indice];
		}
	}

}
