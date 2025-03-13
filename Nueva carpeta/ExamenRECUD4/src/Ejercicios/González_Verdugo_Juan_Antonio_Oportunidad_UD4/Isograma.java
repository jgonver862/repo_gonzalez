package Ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Isograma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el Texto para ver si es un Isograma: ");
		String texto = scan.nextLine();
		StringBuilder textoSb = null; 
		textoSb.append(texto);
		limpiarTexto(texto);
		esIsograma(textoSb);
		mostrarLetrasRepetidas(textoSb);
	}

	private static void limpiarTexto(String texto) {
		texto = texto.replaceAll("[^a-zñÑA-Z]", " ").trim();
		StringBuilder textoSb = null;
		textoSb.append(texto);
		System.out.println("La frase Utilizada es " + textoSb);

	}

	private static boolean esIsograma(StringBuilder textoSb) {
		String[] Abecedario = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		boolean esIsograma = true;
		for (String letras : Abecedario) {
			if (letras.contentEquals(textoSb)) {
				System.out.println("Los Caracteres Repetidos Son: " + letras);
				esIsograma = false;
			}
			}
		if (esIsograma == false) {
			System.err.println("No es un isograma.");
		} else {
			System.out.println("Es un isograma.");
		}
		
		return esIsograma;
		}
		
		
	
	
	private static void mostrarLetrasRepetidas (StringBuilder textoSb) {
		boolean esIsograma = esIsograma(textoSb);
		int i = 0; 
		int j = 0;
		while(!esIsograma && i < textoSb.length()) {
			while(!esIsograma && j < textoSb.length()) {
				if (textoSb.equals(textoSb) && i != j) {
					esIsograma = false;
				}
			}
		}
		if (esIsograma == true) {
			System.out.println("");
		}
		
		
	}
}
