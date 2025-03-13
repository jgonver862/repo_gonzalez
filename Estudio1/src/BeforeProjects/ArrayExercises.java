package BeforeProjects;

public class ArrayExercises {

	public static void main(String[] args) {
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		int[] numeros = new int[20];
		int numAleatorio = (int) (Math.random() * 101);
		for (int i = 0; i < numeros.length; i++) {
			int num = (int) Math.pow(numAleatorio, i + 1);
			numeros[i] = num;
			cuadrado[i] = num * 10;
			cubo[i] = num * 100;
		} 
		for (int i = numeros.length - 1; i > 0; i--) {
			System.out.printf("%d\t%d\t%d\t\n", numeros[i], cuadrado[i], cubo[i]);
		}

	}
}