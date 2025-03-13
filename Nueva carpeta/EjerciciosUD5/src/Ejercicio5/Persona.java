package Ejercicio5;

import java.util.Random;

public class Persona {
	private String nombre = "";
	private Integer edad = 0;
	private String dni = "";
	private char sexo;
	private Double peso = 0d;
	private Double altura = 0d;

	public Persona() {

	}

	public Persona(String nombre, Integer edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, Integer edad, String dni, char sexo, Double peso, Double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = this.generaDNI();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public void CalcularIMC(Integer edad, char sexo, Double peso, Double altura) {
		boolean opcionincorrecta = false;
		do {
			switch (sexo) {
			case 'H':
				double pesoidealH = (((this.altura * 100) - 150) * 0.75) + 50;

				if (pesoidealH == this.peso) {
					System.out.println("Altura: " + this.altura);
					System.out.println("Peso: " + this.peso);
					System.out.println("Peso Ideal: " + pesoidealH);
					System.out.println("¡Enhorabuena! Estas En Tu Peso Ideal. Sigue Asi ;)");
				} else {
					System.out.println("Altura: " + this.altura);
					System.out.println("Peso: " + this.peso);
					System.out.println("Peso Ideal: " + pesoidealH);
					System.err.println("No Estas En Tu Peso Ideal. La Proxima Vez Sera ;,(");
				}
				break;
			case 'M':
				double pesoidealM = (((this.altura * 100) - 150) * 0.6) + 50;

				if (pesoidealM == this.peso) {
					System.out.println("Altura: " + this.altura);
					System.out.println("Peso: " + this.peso);
					System.out.println("Peso Ideal: " + pesoidealM);
					System.out.println("¡Enhorabuena! Estas En Tu Peso Ideal. Sigue Asi ;)");
				} else {
					System.out.println("Altura: " + this.altura);
					System.out.println("Peso: " + this.peso);
					System.out.println("Peso Ideal: " + pesoidealM);
					System.err.println("No Estas En Tu Peso Ideal. La Proxima Vez Sera ;,(");
				}
				break;

			default:
				System.out.println("No Se Puede Realizar El Calculo");
				opcionincorrecta = true;
				break;
			}

		} while (opcionincorrecta);
	}

	public void esMayorDeEdad(Integer edad) {
		boolean Mayorde18 = false;
		if (this.edad >= 18) {
			Mayorde18 = true;
			System.out.println("Es Mayor De Edad.");
		} else {
			System.err.println("No Es Mayor De Edad. Le Quedan " + (18 - this.edad) + " años para tener 18 años.");
		}
	}

	public char comprobarSexo(char sexo) {
		char sexoFinal = 'N';
		sexo = Character.toUpperCase(sexo);
		if (sexo == 'H' || sexo == 'M') {
			sexoFinal = sexo;
		}
		return sexoFinal;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(this.nombre).append("\nEdad: ").append(this.edad).append("\nDNI: ")
				.append(this.dni).append("\nSexo: ").append(this.sexo).append("\nPeso: ").append(this.peso)
				.append("\nAltura: ").append(this.altura);
		return sb.toString();
	}

	public String generaDNI() {
		Random R = new Random();
		char UltimoCaracter = (char) (R.nextInt(91) + 65);
		String Caracter = String.valueOf(UltimoCaracter);
		this.dni = R.nextInt(99999999) + Caracter.toUpperCase();
		return this.dni;
	}
	
}
