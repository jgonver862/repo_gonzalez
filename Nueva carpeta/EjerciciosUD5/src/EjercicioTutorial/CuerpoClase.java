package EjercicioTutorial;

public class CuerpoClase {
	private String marca = "";
	private float potencia = 0f;
	private float costo = 0f;
	private String estado = "";
	
	public CuerpoClase (String marca,float potencia,float costo) {
		this.marca = marca;
		this.potencia = potencia;
		this.costo = costo;
		this.estado = "apagado";
	}
	
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPotencia() {
		return this.potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public float getCosto() {
		return this.costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public String isEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void encender() {
		this.estado = "encendido";
	}
	public void apagar() {
		this.estado = "apagado";
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Bombilla:\n").append("marca: ").append(this.marca)
		.append("\n").append("precio: ").append(this.costo).append(" €")
		.append("\n").append("potencia: ").append(this.potencia).append(" W")
		.append("\n").append("estado: ").append(this.estado);
		System.out.println("__________________________________________________");
		return sb.toString();
}
}