package Ejercicio3;

public class Ave extends Animal {
	private boolean volador;
	private Integer Alas;
	
	public boolean poneHuevos() {
		boolean macho = true;
		boolean hembra = false;
		boolean PoneHuevos = false;
		if (hembra == true && macho == false) {
			PoneHuevos = true;
		}else {
			PoneHuevos = false;
		}
		return PoneHuevos;
		
	}

	public Ave(String lugarNacimiento, Integer numPatas, boolean volador, Integer Alas) {
		super(lugarNacimiento, numPatas);
	}
	public void vuela() {
		System.out.println("El animal está volando");
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Es un Ave.\n").append(super.toString());
		return sb.toString();
	}
}