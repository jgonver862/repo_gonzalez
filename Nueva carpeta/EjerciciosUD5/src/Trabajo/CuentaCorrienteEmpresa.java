package Trabajo;

public class CuentaCorrienteEmpresa extends CuentaCorriente {
	private float maximodescubierto;
	private int tipointeres;

	public CuentaCorrienteEmpresa(String nombre, String apellido, String DNi, double saldoactual,
			String numerocuentaIBAN, String[] ListaEmpresas, float maximodescubierto, int tipointeres) {
		super(nombre, apellido, DNi, saldoactual, numerocuentaIBAN, ListaEmpresas);
		this.maximodescubierto = maximodescubierto;
		this.tipointeres = tipointeres;
	}

	public float getMaximodescubierto() {
		return maximodescubierto;
	}

	public void setMaximodescubierto(float maximodescubierto) {
		this.maximodescubierto = maximodescubierto;
	}

	public int getTipointeres() {
		return tipointeres;
	}

	public void setTipointeres(int tipointeres) {
		this.tipointeres = tipointeres;
	}

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(getNombre()).append("\nApellido: ").append(getApellido()).append("\nDNI: ")
				.append(getDNi()).append("\nSaldo Actual: ").append(getSaldoactual())
				.append("\nNúmero de cuenta (IBAN): ").append(generaIBAN())
				.append("\nLista De Las Empresas Autorizadas Para Cobrar Recibos De La Cuenta: ")
				.append(getListaEmpresas()).append("\nMaximo Descubierto:").append(maximodescubierto)
				.append("\nTipo De Interes: ").append(tipointeres);
		return sb.toString();
	}

	@Override
	public void devolverInfoString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(getNombre()).append("\nApellido: ").append(getApellido()).append("\nDNI: ")
				.append(getDNi()).append("\nSaldo Actual: ").append(getSaldoactual())
				.append("\nNúmero de cuenta (IBAN): ").append(generaIBAN())
				.append("\nLista De Las Empresas Autorizadas Para Cobrar Recibos De La Cuenta: ")
				.append(getListaEmpresas()).append("\nMaximo Descubierto:").append(maximodescubierto)
				.append("\nTipo De Interes: ").append(tipointeres);
	}
}
