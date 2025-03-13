package Trabajo;

import java.util.Random;

public abstract class CuentaBancaria extends Persona implements Imprimible {
	private double saldoactual;
	private String numerocuentaIBAN;

	public CuentaBancaria(String nombre, String apellido, String DNi, double saldoactual, String numerocuentaIBAN) {
		super(nombre, apellido, DNi);
		this.saldoactual = saldoactual;
		this.numerocuentaIBAN = numerocuentaIBAN;
	}

	public double getSaldoactual() {
		return saldoactual;
	}

	public void setSaldoactual(double saldoactual) {
		this.saldoactual = saldoactual;
	}

	public String getNumerocuentaIBAN() {
		return numerocuentaIBAN;
	}

	public void setNumerocuentaIBAN(String numerocuentaIBAN) {
		this.numerocuentaIBAN = numerocuentaIBAN;
	}

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(getNombre()).append("\nApellido: ").append(getApellido()).append("\nDNI: ")
				.append(getDNi()).append("\nSaldo Actual: ").append(saldoactual).append("\nNúmero de cuenta (IBAN): ")
				.append(numerocuentaIBAN);
		return sb.toString();
	}

	protected String generaIBAN() {
		Random random = new Random();
		long numero1 = random.nextLong(999999999) + 1;
		long numero2 = random.nextLong(999999999) + 1;
		long numero3 = random.nextLong(99) + 1;
		String numerocuentaIBAN = "ES" + "" + numero1 + " " + numero2 + " " + numero3;
		while (numerocuentaIBAN.length() < 24) {
			numerocuentaIBAN = "0" + numerocuentaIBAN;
		}
		return numerocuentaIBAN;

	}

}
