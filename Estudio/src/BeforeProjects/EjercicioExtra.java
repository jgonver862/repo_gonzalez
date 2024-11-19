package BeforeProjects;

public class EjercicioExtra {

	public static void main(String[] args) {
		int numero = 7;
		int contador;
		int resultado=0;
		contador = 1;
		do {
		resultado = contador * numero;
		System.out.println (numero + " x " + contador++ + " = " +
		resultado);
		} while (contador < 10);
	}

}
