package Ejercicios;

import java.util.Arrays;

public class MMHUEVO {

	public static void main(String[] args) {
		String[][] productos = { { "Coca-Cola", "Sprite", "Fanta naranja" }, { "Fanta limón", "Red Bull", "Monster" },
				{ "Pepsi", "Schweppes tónica", "Agua mineral" }, { "Cruzcampo", "Heineken", "Zumo de piña" } };
		int[][] cantidad = new int[productos.length][productos[0].length];
		for (int i = 0; i < cantidad.length; i++) {
			Arrays.fill(cantidad[i], 5);
		}
		StringBuilder patternSB = new StringBuilder();
		patternSB.append("[1-").append(productos.length).append("][1-").append(productos[0].length).append("]");
		String pattern = patternSB.toString();
		System.out.println(pattern);
	}

}
