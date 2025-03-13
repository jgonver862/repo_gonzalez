package Trabajo;

public class CuentaCorrientePersonal extends CuentaCorriente {
	private float comisionMantenimiento;

	public CuentaCorrientePersonal(String nombre, String apellido, String DNi, double saldoactual,
			String numerocuentaIBAN, String[] listaEmpresas, float comisionMantenimiento) {
		super(nombre, apellido, DNi, saldoactual, numerocuentaIBAN, listaEmpresas);
		this.comisionMantenimiento = comisionMantenimiento;
	}

	public double getComisionMantenimiento() {
		return comisionMantenimiento;
	}

	public void setComisionMantenimiento(float comisionMantenimiento) {
		this.comisionMantenimiento = comisionMantenimiento;
	}

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(getNombre()).append("\nApellido: ").append(getApellido()).append("\nDNI: ")
				.append(getDNi()).append("\nSaldo Actual: ").append(getSaldoactual())
				.append("\nNúmero de cuenta (IBAN): ").append(generaIBAN())
				.append("\nLista De Las Empresas Autorizadas Para Cobrar Recibos De La Cuenta: ")
				.append(getListaEmpresas()).append("\nComision Por Mantenimiento:").append(comisionMantenimiento);
		return sb.toString();
	}

	@Override
	public void devolverInfoString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(getNombre()).append("\nApellido: ").append(getApellido()).append("\nDNI: ")
				.append(getDNi()).append("\nSaldo Actual: ").append(getSaldoactual())
				.append("\nNúmero de cuenta (IBAN): ").append(generaIBAN())
				.append("\nLista De Las Empresas Autorizadas Para Cobrar Recibos De La Cuenta: ")
				.append(getListaEmpresas()).append("\nComision Por Mantenimiento:").append(comisionMantenimiento);
	}

}
