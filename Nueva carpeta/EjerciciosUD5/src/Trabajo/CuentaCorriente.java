package Trabajo;

public abstract class CuentaCorriente extends CuentaBancaria {
	private String[] ListaEmpresas;

	public CuentaCorriente(String nombre, String apellido, String DNi, double saldoactual, String numerocuentaIBAN,
			String[] ListaEmpresas) {
		super(nombre, apellido, DNi, saldoactual, numerocuentaIBAN);
		this.ListaEmpresas = ListaEmpresas;
	}

	public String[] getListaEmpresas() {
		return ListaEmpresas;
	}

	public void setListaEmpresas(String[] listaEmpresas) {
		ListaEmpresas = listaEmpresas;
	}

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(getNombre()).append("\nApellido: ").append(getApellido()).append("\nDNI: ")
				.append(getDNi()).append("\nSaldo Actual: ").append(getSaldoactual())
				.append("\nNúmero de cuenta (IBAN): ").append(generaIBAN())
				.append("Lista De Las Empresas Autorizadas Para Cobrar Recibos De La Cuenta: ").append(ListaEmpresas);
		return sb.toString();
	}

}
