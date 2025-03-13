package Trabajo;

public class CuentaAhorro extends CuentaBancaria {
	private int tipointeresanual;

	public CuentaAhorro(String nombre, String apellido, String DNi, double saldoactual, String numerocuentaIBAN,
			int tipointeresanual) {
		super(nombre, apellido, DNi, saldoactual, numerocuentaIBAN);
		this.tipointeresanual = tipointeresanual;
	}

	public int getTipointeresanual() {
		return tipointeresanual;
	}

	public void setTipointeresanual(int tipointeresanual) {
		this.tipointeresanual = tipointeresanual;
	}

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(getNombre()).append("\nApellido: ").append(getApellido()).append("\nDNI: ")
				.append(getDNi()).append("\nSaldo Actual: ").append(getSaldoactual())
				.append("\nNúmero de cuenta (IBAN): ").append(generaIBAN()).append("\nTipo De Interes Anual: ")
				.append(tipointeresanual);
		return sb.toString();
	}

	@Override
	public void devolverInfoString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(getNombre()).append("\nApellido: ").append(getApellido()).append("\nDNI: ")
				.append(getDNi()).append("\nSaldo Actual: ").append(getSaldoactual())
				.append("\nNúmero de cuenta (IBAN): ").append(generaIBAN()).append("\nTipo De Interes Anual: ")
				.append(tipointeresanual);

	}
}
