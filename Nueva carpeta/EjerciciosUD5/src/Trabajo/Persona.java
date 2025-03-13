package Trabajo;

public class Persona implements Imprimible {
	private String nombre;
	private String apellido;
	private String DNi;

	public Persona(String nombre, String apellido, String DNi) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNi = DNi;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDNi() {
		return DNi;
	}

	public void setDNi(String dNi) {
		DNi = dNi;
	}

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(nombre).append("/nApellido: ").append(apellido).append("/nDNI: ").append(DNi);
		return sb.toString();
	}

	@Override
	public void devolverInfoString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(nombre).append("/nApellido: ").append(apellido).append("/nDNI: ").append(DNi);
	}

}
