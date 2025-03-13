package EjerciciosUD4;



public class Ejercicio3Boletin {

	public static void main(String[] args) {
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		int[] numeros = new int[20];
		for (int i = 0; i <= 100 ; i--) {
			numeros[i] = (int) Math.random();
			cuadrado[i] = (int) Math.pow(i, 2);
			cubo[i] = (int) Math.pow(i, 3);
		} 
		
		for (int i = numeros.length; i > 0; i--) {
			System.out.println(numeros[i] + ", ");
			System.out.println(cuadrado[i] + ", ");
			System.out.println(cubo[i] + ", ");
		}
		System.out.println(numeros[0] + ", " + cuadrado[0] + ", " + cubo[0]);

	}

}
