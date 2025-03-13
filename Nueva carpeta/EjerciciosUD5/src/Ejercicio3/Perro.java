package Ejercicio3;

public class Perro extends Mamifero {
	public Perro(String lugarNacimiento) {
		super(lugarNacimiento, 4, Boolean.TRUE);
	}
	public void ladra() {
		System.out.println("Guau Guau");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		String domestico = this.isDomestico() ? "doméstico" : "salvaje";
		sb.append("El animal es un perro. Que es un animal ").append(domestico).append("\n").append(super.toString());
		return sb.toString();
	}

}