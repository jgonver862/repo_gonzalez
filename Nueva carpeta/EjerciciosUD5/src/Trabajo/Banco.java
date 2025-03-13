package Trabajo;

import java.util.Random;
import java.util.Scanner;
import Util.Utilidades;

public class Banco {

	public Banco() {

	}

	static CuentaAhorro[] Cuentas = new CuentaAhorro[100];
	static CuentaCorrientePersonal[] CuentasPersonales = new CuentaCorrientePersonal[100];
	static CuentaCorrienteEmpresa[] CuentasEmpresariales = new CuentaCorrienteEmpresa[100];

	public static boolean AbrirCuenta() {
		Scanner scan = new Scanner(System.in);
		Exception e = new Exception();
		boolean CuentaCreada = false;

		System.out.print("Introduce Tu Nombre: ");
		String nombre = scan.nextLine();
		System.out.print("Introduce Tu Apellido: ");
		String apellido = scan.nextLine();
		String DNi = generaDNi();
		boolean DNIcorrecto = Util.Utilidades.checkDni(DNi);
		if (DNIcorrecto == false) {
			e.printStackTrace();
		} else {
			System.out.println("Saldo Que Tienes: ");
			float Saldo = scan.nextFloat();
			System.out.println("¿Que Tipo De Cuenta Deseas Realizar? ");
			int tipoDeCuenta = scan.nextInt();
			if (tipoDeCuenta == 1) {
				System.out.println("Has seleccionado Crear Una Cuenta De Ahorro.");
				System.out.print("¿Cual Es El Tipo De Interes De La Cuenta? ");
				int tipointeresanual = scan.nextInt();
				if (tipointeresanual == 1) {
					System.out.println("Has seleccionado La Tasa Anual Equivalente (TAE)");
					float saldoActual = 0f;
					saldoActual = (float) (Saldo + (Saldo * 0.0227));
					CuentaAhorro CU = new CuentaAhorro(nombre, apellido, DNi, saldoActual, generaIBAN(),
							tipointeresanual);
					System.out.println(CU.ToString());
					Cuentas[0] = CU;
					CuentaCreada = true;
				} else if (tipointeresanual == 2) {
					System.out.println("Has seleccionado El Tipo De Interes Anual (TIN)");
					float saldoActual = 0f;
					saldoActual = (float) (Saldo + (Saldo * 0.0225));
					CuentaAhorro CU = new CuentaAhorro(nombre, apellido, DNi, saldoActual, generaIBAN(),
							tipointeresanual);
					Cuentas[0] = CU;
					System.out.println(CU.ToString());
					CuentaCreada = true;
				} else {
					e.printStackTrace();
				}

			} else if (tipoDeCuenta == 2) {
				System.out.println("Has Elegido Crear Una Cuenta Corriente.");
				System.out.println("¿Que Empresas Estan Autorizadas Para Cobrarte Los Recibos De La Cuenta? ");
				String Empresas = scan.nextLine();
				String[] ListaEmpresas = new String[1];
				ListaEmpresas[0] = Empresas;
				System.out.println("¿Que Tipo De Cuenta Corriente Vas A Hacer?");
				int tipoCuentaCorriente = scan.nextInt();
				if (tipoCuentaCorriente == 1) {
					System.out.println("Has Elegido Crear Una Cuenta Corriente Personal.");
					float saldoActual = 0f;
					float comisionmantenimiento = Saldo / 5;
					saldoActual = (float) (Saldo - comisionmantenimiento);
					CuentaCorrientePersonal CCP1 = new CuentaCorrientePersonal(nombre, apellido, DNi, saldoActual,
							generaIBAN(), ListaEmpresas, comisionmantenimiento);
					System.out.println(CCP1.ToString());
					CuentasPersonales[0] = CCP1;
					CuentaCreada = true;
				} else if (tipoCuentaCorriente == 2) {
					System.out.println("Has Elegido Crear Una Cuenta Corriente De Empresa.");
					float saldoActual = 0f;
					saldoActual = (float) (Saldo + (Saldo * 0.0225));
					System.out.println("¿Cual Es El Tipo De Interes?");
					int tipointeresempresa = scan.nextInt();
					if (tipointeresempresa == 1) {
						System.out.println("Has seleccionado La Tasa Anual Equivalente (TAE)");
						saldoActual = (float) (Saldo - (Saldo * 0.0029));
						float maximodescubierto = saldoActual / 2;
						CuentaCorrienteEmpresa CCE1 = new CuentaCorrienteEmpresa(nombre, apellido, DNi, saldoActual,
								generaIBAN(), ListaEmpresas, maximodescubierto, tipointeresempresa);
						System.out.println(CCE1.ToString());
						CuentasEmpresariales[0] = CCE1;
						CuentaCreada = true;
					} else if (tipointeresempresa == 2) {
						System.out.println("Has seleccionado El Tipo De Interes Anual (TIN)");
						saldoActual = (float) (Saldo);
						float maximodescubierto = saldoActual / 3;
						CuentaCorrienteEmpresa CCE1 = new CuentaCorrienteEmpresa(nombre, apellido, DNi, saldoActual,
								generaIBAN(), ListaEmpresas, maximodescubierto, tipointeresempresa);
						System.out.println(CCE1.ToString());
						CuentasEmpresariales[0] = CCE1;
						CuentaCreada = true;
					}
				} else {
					e.printStackTrace();
				}
				scan.close();
			}
			if (CuentaCreada == true) {
				System.out.println("La Cuenta Ha Sido Creada Exitosamente.");
			} else {
				System.err.println("No Se Ha Realizado La Cuenta.");
			}
		}
		return CuentaCreada;

	}

	public static void listadoCuenta() {
		System.out.println("Cuentas De Ahorro: ");
		System.out.println(Cuentas[0].ToString());
		System.out.println("Cuentas Corrientes Personales: ");
		System.out.println(CuentasPersonales[0].ToString());
		System.out.println("Cuentas Corrientes Empresariales: ");
		System.out.println(CuentasEmpresariales[0].ToString());
	}

	public static String informacionCuenta() throws Exception {
		Scanner scan = new Scanner(System.in);
		Exception e = new Exception();
		System.out.println("¿Que Cuenta Deseas Ver?");
		String DNi = scan.nextLine();
		if (DNi.matches(Cuentas[0].getDNi())) {
			System.out.println(Cuentas[0].ToString());
		} else if (DNi.equals(CuentasPersonales[0].getDNi())) {
			System.out.println(CuentasPersonales[0].ToString());
		} else if (DNi.equals(CuentasEmpresariales[0].getDNi())) {
			System.out.println(CuentasEmpresariales[0].ToString());
		} else {
			e.printStackTrace();
		}
		scan.close();
		return DNi;
	}

	public static boolean ingresoCuenta() throws Exception {
		boolean CuentaIngresada = false;
		Scanner scan = new Scanner(System.in);
		Exception e = new Exception();
		System.out.println("¿Que Cuenta Deseas Ver?");
		String DNi = scan.nextLine();
		if (DNi.matches(Cuentas[0].getDNi())) {
			System.out.println("¿Cuanto Dinero Deseas Retirar?");
			float dineroretirado = scan.nextFloat();
			if (dineroretirado > Cuentas[0].getSaldoactual()) {
				e.printStackTrace();
			} else {
				float i = (float) (Cuentas[0].getSaldoactual());
				i = i + dineroretirado;
			}
		} else if (DNi.equals(CuentasPersonales[0].getDNi())) {
			System.out.println("¿Cuanto Dinero Deseas Retirar?");
			float dineroretirado = scan.nextFloat();
			if (dineroretirado > CuentasPersonales[0].getSaldoactual()) {
				e.printStackTrace();
			} else {
				float i = (float) (CuentasPersonales[0].getSaldoactual());
				i = i + dineroretirado;
			}
		} else if (DNi.equals(CuentasEmpresariales[0].getDNi())) {
			System.out.println("¿Cuanto Dinero Deseas Retirar?");
			float dineroretirado = scan.nextFloat();
			if (dineroretirado > CuentasEmpresariales[0].getSaldoactual()) {
				e.printStackTrace();
			} else {
				float i = (float) (CuentasEmpresariales[0].getSaldoactual());
				i = i + dineroretirado;
			}
		} else {
			e.printStackTrace();
		}
		scan.close();
		if (CuentaIngresada == true) {
			System.out.println("Se ha logrado ingresar dinero de la cuenta con exito.");
		} else {
			System.err.println("No se ha logrado encontrar la cuenta.");
		}
		return CuentaIngresada;

	}

	public static boolean retiradaCuenta() throws Exception {
		boolean CuentaRetirada = false;
		Scanner scan = new Scanner(System.in);
		Exception e = new Exception();
		System.out.println("¿Que Cuenta Deseas Ver?");
		String DNi = scan.nextLine();
		if (DNi.matches(Cuentas[0].getDNi())) {
			System.out.println("¿Cuanto Dinero Deseas Retirar?");
			float dineroretirado = scan.nextFloat();
			if (dineroretirado > Cuentas[0].getSaldoactual()) {
				e.printStackTrace();
			} else {
				float i = (float) (Cuentas[0].getSaldoactual());
				i = i - dineroretirado;
			}
		} else if (DNi.equals(CuentasPersonales[0].getDNi())) {
			System.out.println("¿Cuanto Dinero Deseas Retirar?");
			float dineroretirado = scan.nextFloat();
			if (dineroretirado > CuentasPersonales[0].getSaldoactual()) {
				e.printStackTrace();
			} else {
				float i = (float) (CuentasPersonales[0].getSaldoactual());
				i = i - dineroretirado;
			}
		} else if (DNi.equals(CuentasEmpresariales[0].getDNi())) {
			System.out.println("¿Cuanto Dinero Deseas Retirar?");
			float dineroretirado = scan.nextFloat();
			if (dineroretirado > CuentasEmpresariales[0].getSaldoactual()) {
				e.printStackTrace();
			} else {
				float i = (float) (CuentasEmpresariales[0].getSaldoactual());
				i = i - dineroretirado;
			}
		} else {
			e.printStackTrace();
		}
		scan.close();

		if (CuentaRetirada == true) {
			System.out.println("Se ha logrado retirar dinero de la cuenta con exito.");
		} else {
			System.err.println("No se ha logrado encontrar la cuenta.");
		}
		return CuentaRetirada;

	}

	public static String obtenerSaldo() throws Exception {
		Scanner scan = new Scanner(System.in);
		Exception e = new Exception();
		System.out.println("¿Que Saldo Deseas Ver?");
		String DNi = scan.nextLine();
		if (DNi.matches(Cuentas[0].getDNi())) {
			System.out.println(Cuentas[0].getSaldoactual());
		} else if (DNi.equals(CuentasPersonales[0].getDNi())) {
			System.out.println(CuentasPersonales[0].getSaldoactual());
		} else if (DNi.equals(CuentasEmpresariales[0].getDNi())) {
			System.out.println(CuentasEmpresariales[0].getSaldoactual());
		} else {
			e.printStackTrace();
		}
		scan.close();
		return DNi;
	}

	protected static String generaIBAN() {
		Random random = new Random();
		long numero1 = random.nextLong(999999999) + 1;
		long numero2 = random.nextLong(999999999) + 1;
		long numero3 = random.nextLong(99) + 1;
		String numerocuentaIBAN = "ES" + numero1 + numero2 + numero3;
		while (numerocuentaIBAN.length() < 24) {
			numerocuentaIBAN = "0" + numerocuentaIBAN;
		}
		return numerocuentaIBAN;

	}

	private static String generaDNi() {
		// 8 numeros y una letra
		Random random = new Random();
		int numero = random.nextInt(99999999) + 1;
		char letra = Utilidades.LETRAS.charAt(numero % 23);
		String DNi = numero + String.valueOf(letra);
		while (DNi.length() < 9) {
			DNi = "0" + DNi;
		}
		return DNi;
	}
}
