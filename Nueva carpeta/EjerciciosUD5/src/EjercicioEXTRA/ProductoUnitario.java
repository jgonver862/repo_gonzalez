package EjercicioEXTRA;

public class ProductoUnitario extends Producto implements IPrecio {

	private int cantidad;
	private double precio;
	
	public ProductoUnitario (int cantidad, double precio, String nombre, String categoria) {
		super(nombre, categoria);
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getImporteTotal(){
		double PrecioTotal = cantidad*precio;
		System.out.println(PrecioTotal);
		return PrecioTotal;
	}
	
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre Del Producto: ").append(getNombre()).append("\nCantidad: ").append(cantidad).append("\nPrecio: ").append(precio).append("\nImporte Total: ").append(getImporteTotal());
		return sb.toString();
		}
}