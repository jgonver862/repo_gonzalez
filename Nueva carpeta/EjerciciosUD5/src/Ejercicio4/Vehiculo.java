package Ejercicio4;

public abstract class Vehiculo {
	private static Integer vehiculosCreados = 0;
	private static Double kilometrosTotales = 0d;
	private Double kilometrosrecorridos;

	public Vehiculo() {
		vehiculosCreados++;
		this.setKilometrosRecorridos(0d);
	}

	public Double getKilometrosRecorridos() {
		return kilometrosrecorridos;
	}

	public void setKilometrosRecorridos(Double kilometrosRecorridos) {
		this.kilometrosrecorridos = kilometrosRecorridos;
	}

	public void andar(double kilometros) {
		this.setKilometrosRecorridos(this.getKilometrosRecorridos() + kilometros);
	}
	
}