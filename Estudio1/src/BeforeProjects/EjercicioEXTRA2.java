package BeforeProjects;

public class EjercicioEXTRA2 {

	public static void main(String[] args) {
		int[] numeros = new int[20];
		int par = 0;
		int impar = 0;
		int numAleatorio = (int) (Math.random() * 101);
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numAleatorio;
			if(numeros[i]/2 != 0) {
				par++;
			}
			if (numeros[i]/3 != 0) {
				impar++;
			}
			
		}
		for (int i = numeros.length - 1; i > 0; i--) {
			System.out.println(numeros[i] + ", ");
		}
		
		System.out.println(numeros[0]);
		System.out.println("Hay " + par + " numeros pares.\n Hay: " + impar + " numeros impares.");
		}
	}

