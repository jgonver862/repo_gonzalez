package Ejercicio4;

import java.util.Date;

public class Coche extends Vehiculo {
	// Atributos
	private String marca;
	private String modelo;
	private String color;
	private Double Precio;
	// Constructores
	public Coche(String marca, String modelo, String color, Double Precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.Precio = Precio;
	}

	// Getters And Setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}
	
}
