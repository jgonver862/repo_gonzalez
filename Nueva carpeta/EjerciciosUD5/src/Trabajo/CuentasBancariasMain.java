package Trabajo;

import java.util.Scanner;

public class CuentasBancariasMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		boolean opcionIncorrecta = false;
		do {
			System.out.println("--------------------- BANCO ---------------------");
			System.out.println("| 1.- Abrir Una Cuenta Bancaria. \t\t|");
			System.out.println("| 2.- Ver La Lista De Las Cuentas Bancarias \t|");
			System.out.println("| 3.- Ver La Informacion De La Cuenta Bancaria \t|");
			System.out.println("| 4.- Ingresar Dinero En La Cuenta \t\t|");
			System.out.println("| 5.- Retirar La Cuenta Del Banco \t\t|");
			System.out.println("| 6.- Obtener El Saldo De La Cuenta Bancaria \t|");
			System.out.println("-------------------------------------------------");
			System.out.print("\nIntroduce una opcion: ");
			int opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				Banco.AbrirCuenta();
				break;
			case 2:
				Banco.listadoCuenta();
				break;
			case 3:
				Banco.informacionCuenta();
				break;
			case 4:
				Banco.ingresoCuenta();
				break;
			case 5:
				Banco.retiradaCuenta();
				break;
			case 6:
				Banco.obtenerSaldo();
				break;
			default:
				System.err.print("No Has Introducido Una Opcion Correcta. Vuelve A Introducir Una Opcion: ");
				opcionIncorrecta = true;
				break;
			}
		} while (opcionIncorrecta = true);
		scan.close();
	}

}
