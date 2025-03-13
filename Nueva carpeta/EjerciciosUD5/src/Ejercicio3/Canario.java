package Ejercicio3;

public class Canario extends Ave {
	public Canario (String lugarNacimiento) {
		super(lugarNacimiento, 2, true, 2);
	}
	
	public void canta() {
		System.out.println();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("El animal es un canario.").append(super.toString());
		return sb.toString();
	}
}
