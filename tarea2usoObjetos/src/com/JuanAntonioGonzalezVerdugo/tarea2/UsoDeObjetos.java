package com.JuanAntonioGonzalezVerdugo.tarea2;

import java.util.Calendar;
import java.util.Scanner;

public class UsoDeObjetos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------------| MENU TAREA UD3 |--------------------\n| 1.- Menu Matematicas\t\t\t\t\t|\n| 2.- Menu Fechas\t\t\t\t\t|\n| 0.- Salir Del Programa\t\t\t\t|\n---------------------------------------------------------");
		System.out.println("Introduce una opcion:");
		boolean opcionIncorrecta = false;
		do {
			int opcion = scan.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("-----------------------| MENU MATEMATICAS |----------------------\n| 1.- Conocer la posicion del digito\t\t\t\t|\n| 2.- Conocer el trozo de numero\t\t\t\t|\n| 3.- Juntar Numeros\t\t\t\t\t\t|\n| 4.- Factorial\t\t\t\t\t\t\t|\n| 5.- CambioExacto\t\t\t\t\t\t|\n-----------------------------------------------------------------");
			System.out.println("Introduce una opcion:");
			boolean opcionIncorrecta2 = false;
			do {
				int opcion2 = scan.nextInt();
				switch(opcion2) {
				case 1:
					int Number = 0;
					System.out.println("Introduce Un Numero");
					UtilidadesMatematicas.posicionDigito(Number);
					break;
				case 2:
					int TrozoNumero = 0;
					UtilidadesMatematicas.TrozoNumero(TrozoNumero);
					break;
				case 3:
					System.out.println("Introduce el primer numero:");
					int numero1 = scan.nextInt();
					System.out.println("Introduce el segundo numero:");
					int numero2 = scan.nextInt();
					System.out.println("El Numero Es: " + UtilidadesMatematicas.juntaNumeros(numero1, numero2));
					break;
				case 4: 
					int numeroF = 0;
					UtilidadesMatematicas.Factorial(numeroF);
					break;
				case 5:
					int Fraccion = 0;
					UtilidadesMatematicas.CambioExacto(Fraccion);
					break;
				default:
					System.err.println("Has introducido la opcion incorrecta. Vuelve a introducir la opcion: ");
					opcionIncorrecta2 = true;
					break;
				}
			} while (opcionIncorrecta2);
			break;
		case 2:
			System.out.println("---------------------| MENU FECHAS |---------------------\n| 1.- Calcular Mi Edad\t\t\t\t\t|\n| 2.- Averiguar En Que Mes Estamos\t\t\t|\n| 3.- Parsear Fecha\t\t\t\t\t|\n| 4.- Comprobar La Fecha\t\t\t\t|\n---------------------------------------------------------");
			System.out.println("Introduce una opcion:");
			boolean opcionIncorrecta3 = false;
			do {
				int opcion3 = scan.nextInt();
				switch(opcion3) {
				case 1:
					Calendar fechaADiaDeHoy = Calendar.getInstance();
					System.out.println("Introduce tu año de nacimiento");
					UtilidadesFechas.CalcularEdad(fechaADiaDeHoy);
					break;
				case 2:
					Calendar mesAnio = Calendar.getInstance();
					System.out.println("Estamos En El Mes: " + UtilidadesFechas.obtenerMes(mesAnio));
					break;
				case 3:
					Calendar FechaNow = Calendar.getInstance();
					System.out.println("La Fecha Es: ");
					UtilidadesFechas.parsearFecha(FechaNow);
					break;
				case 4: 
					Calendar Fecha = Calendar.getInstance();
					System.out.println("Introduce El Dia, Mes, Y Año: ");
					UtilidadesFechas.comprobarFecha(Fecha);
					break;
				default:
					System.err.println("Has introducido la opcion incorrecta. Vuelve a introducir la opcion: ");
					opcionIncorrecta3 = true;
					break;
				}
			} while (opcionIncorrecta3);
			break;
		case 0:
			System.out.println("¡Hasta Luego!");
			break;
		default:
			System.err.println("Has introducido la opcion incorrecta. Vuelve a introducir la opcion: ");
			opcionIncorrecta = true;
			break;
		}
			
		} while (opcionIncorrecta);
			
		scan.close();
		
	}

}