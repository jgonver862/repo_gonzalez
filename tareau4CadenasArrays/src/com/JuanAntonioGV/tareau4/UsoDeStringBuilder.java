package com.JuanAntonioGV.tareau4;

public class UsoDeStringBuilder {

	public static void main(String[] args) {
		
		
		/**
		 * // Metodo append(String str)
		new StringBuilder().append("Hola ").append(" Mundo ").append(10).toString();
		// Metodo insert(int offset, String str)
		StringBuilder str = new StringBuilder("¡Hola Mundo!");
	    System.out.println(str.toString());
	    str.insert(7, "Para El ");
	    System.out.println(str.toString());
	    // Metodo delete(int start, int end)
	    System.out.println(str.toString());
	    str.delete(0, 5);
	    System.out.println(str.toString());
	    // Metodo reverse()
	    System.out.println(str.toString());
	    str.reverse();
	    System.out.println(str.toString());
	    // Metodo toString()
	    System.out.println(str.toString());
	    // Metodo length()
	    StringBuilder bufer = new StringBuilder("Hola, cómo estás?");
		System.out.println("La Frase (" + bufer + ") tiene " + bufer.length() + " caracteres.");
		// Metodo charAt(int index)
		System.out.println("El caracter en el indice 0 es '" + bufer.charAt(0) + "'");
		// Metodo replace(int start, int end, String str)
		StringBuilder strReturn = str.replace(1, 4, "Buenos Dias ");
		System.out.println(strReturn.toString());
		// Metodo substring(int start)
		System.out.println(str.substring(6)); 
		// Metodo substring(int start, int end)
		System.out.println(str.substring(1, 5));
		 */
		
		StringBuilder str = new StringBuilder("¡Hola Mundo!");
		
		System.out.println("Las Vocales Estan En El: \nIndice 2 = '" + str.charAt(2) + "'\nIndice 4 = '" + str.charAt(4)
		+ "'\nIndice 7 = '" + str.charAt(7) + "'\nIndice 10 = '" + str.charAt(10) + "'");
		System.out.println("\nLas Consonantes Estan En El: \nIndice 1 = '" + str.charAt(1) + "'\nIndice 3 = '" + str.charAt(3)
		+ "'\nIndice 6 = '" + str.charAt(6) + "'\nIndice 8 = '" + str.charAt(8) + "'\nIndice 9 = '" + str.charAt(9) + "'");
		
	}

}
