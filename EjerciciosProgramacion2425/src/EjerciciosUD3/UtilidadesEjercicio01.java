package EjerciciosUD3;

public class UtilidadesEjercicio01 {
	public static void aniadir() {
		System.out.println("Has añadido un elemento!");

	}

	public static void mostrarMenu() {
		System.out.println(
				"--------------| MENU |--------------\n1.- Añadir\n2.- Borrar\n3.- Modificar\n4.- Mostrar por pantalla\n5.- Finalizar\n6.- Salto de linea\n------------------------------------");

	}

	public static void imprimePositivos(int p) throws Exception {
		if (p < 0) {
			throw new Exception();
		}
		System.out.println(p);
	}

	public static void imprimeNegativos(int n) throws Exception {
		if (n >= 0) {
			throw new Exception();
		}
		System.out.println(n);
	}

	public static void saltos(int saltos) {
		for (int i = 0; i < saltos; i++) {
			System.out.println("\n");
		}
	}

	public static boolean esPrimo(long numero) {
		boolean esPrimo = true;

		int divisor = 2;
		while (esPrimo && divisor < numero / 2) {
			if (numero % divisor == 0) {
				esPrimo = false;
			}
			divisor++;
		}

		return esPrimo;

	}

	public static long siguientePrimo(long numero) {
		long siguientePrimo = numero + 1;
		boolean encontrado = false;
		while (!encontrado) {
			if (esPrimo(siguientePrimo)) {
				encontrado = true;
			} else {
				siguientePrimo++;
			}
		}
		return siguientePrimo;
	}

	public static int CalcularDigitos (long numero) {
		int numCifras = 1;
		while (numero / 10 != 0) {
			numCifras++;
			numero = numero / 10;
		}
		return numCifras;
	}

	public static boolean esCapicua (long numero) {
		boolean esCapicua = true;
		long numActual = numero;
		int numCifras = digitos(numActual);
		for (int i = 0; i < numCifras / 2; i++) {
			long numDiv = (long) Math.pow(10, numCifras - i - 1);
			long numMod = (long) Math.pow(10, i);
			double numDelante = (numero / numDiv) % 10;
			double numDetras = (numero / numMod) % 10;
			if (numDelante != numDetras) {
				esCapicua = false;
			}
		}
		if (esCapicua) {
			System.out.println("ES CAPICUA");
		} else {
			System.out.println("NO ES CAPICUA");
		}
		
		return esCapicua;
		
	}
}
