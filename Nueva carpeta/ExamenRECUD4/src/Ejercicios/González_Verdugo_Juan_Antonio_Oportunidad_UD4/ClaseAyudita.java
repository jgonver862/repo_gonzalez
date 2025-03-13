package Ejercicios;

public class ClaseAyudita {
	private static void ordenInsercion(Integer[] array) {
		for (int i = 1; i < array.length; i++) {
			int k = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > k) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = k;
		}
	}

	private static String aplanaCadena(String cadena) {
		String cadenaPlana = cadena.toLowerCase().trim();
		return cadenaPlana;
	}

	private static int existeCiudad(String ciudad, String[] ciudadesAplanadas) {
		int indice = -1;
		String ciudadAplanada = aplanaCadena(ciudad);
		int i = 0;
		boolean encontrado = false;
		while (!encontrado && i < ciudadesAplanadas.length) {
			if (ciudadesAplanadas[i].equals(ciudadAplanada)) {
				encontrado = true;
				indice = i;
			}
		}
		return indice;
	}

	private static boolean ciudadesRepetidas(String[] ciudades) {
		boolean repetidas = false;
		int i = 0, j = 0;
		while (!repetidas && i < ciudades.length) {
			while (!repetidas && j < ciudades.length) {
				if (ciudades[i].equals(ciudades[j]) && i != j) {
					repetidas = true;
				}
				j++;
			}
			i++;
		}
		return repetidas;
	}

	private static boolean ordenCorrecto(String string, String string2) {
		return string.charAt(0) <= string2.charAt(0);
	}

	

	private static boolean ciudadesOrdenadas(String[] ciudades) {
		boolean ordenado = true;
		int i = 1;
		while (ordenado && i < ciudades.length) {
			if (!ordenCorrecto(ciudades[i - 1], ciudades[i])) {
				ordenado = false;
			}
			i++;
		}
		return ordenado;
	}

	private static boolean esTipoFlecha(int[][] matriz) {
		int filas = matriz.length;
		int columnas = matriz[0].length;
		boolean esTipoFlecha = true;
		if (filas == columnas) {
			int sumAnterior = matriz[0][0];
			for (int i = 1; i < matriz.length; i++) {
				int sumaActual = matriz[i][i];
				for (int j = 0; j < i; j++) {
					sumaActual += matriz[i][j];
					sumaActual += matriz[j][i];
				}
				if (sumaActual <= sumAnterior) {
					esTipoFlecha = false;
				}
				sumAnterior = sumaActual;
			}
		} else {
			esTipoFlecha = false;
		}
		if (esTipoFlecha == false) {
			System.out.println("No Es Tipo Flecha");
		} else {
			System.out.println("Si, Es Tipo Flecha");
		}
		return esTipoFlecha;
	}
}