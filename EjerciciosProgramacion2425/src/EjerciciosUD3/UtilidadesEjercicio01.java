package EjerciciosUD3;

public class UtilidadesEjercicio01 {
	public static void aniadir() {
		System.out.println("Has añadido un elemento!");

	}

	public static void mostrarMenu() {
		System.out.println("--------------| MENU |--------------\n1.- Añadir\n2.- Borrar\n3.- Modificar\n4.- Mostrar por pantalla\n5.- Finalizar\n6.- Salto de linea\n------------------------------------");
		
	}
	
	public static void saltos(int saltos) {
		for (int i = 0; i < saltos; i++) {
			System.out.println("\n");
		}
		
	}
}
