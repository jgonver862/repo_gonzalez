package EjercicioEXTRA;

public class ProductoPeso extends Producto implements IPrecio {
	private double peso;
	private double precioPorPeso;
	
	public ProductoPeso(double peso, double precioPorPeso, String nombre, String categoria) {
		super(nombre, categoria);
		this.peso = peso;
		this.precioPorPeso = precioPorPeso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioPorPeso() {
		return precioPorPeso;
	}

	public void setPrecioPorPeso(double precioPorPeso) {
		this.precioPorPeso = precioPorPeso;
	}
	
	public double getImporteTotal() {
		double ImporteTotal = peso * precioPorPeso;
		System.out.println(ImporteTotal);
		return ImporteTotal;
	}
	
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre Del Producto: ").append(getNombre()).append("\nPeso: ").append(peso).append("\nPrecio Por Peso: ").append(precioPorPeso).append("\nImporte Total: ").append(getImporteTotal());
		return sb.toString();
	}
}
