package examen2.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilidadesExamen {
	

	public static String obtenerHoraActual (Date now) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String Hora = sdf.format(now);
		return Hora;
		
		
	}
	
	public static String obtenerDiaSemana (Calendar diaSemana) {
		String dia="";
		switch(diaSemana.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dia="Domingo";
			break;
		case 2:
			dia="Lunes";
			break;
		case 3:
			dia="Martes";
			break;
		case 4:
			dia="Miercoles";
			break;
		case 5:
			dia="Jueves";
			break;
		case 6:
			dia="Viernes";
			break;
		case 7: 
			dia="Sabado";
			break;
		default:
			break;
		}
		return dia;
	}
	
	public static String CalcularHastaVacaciones(Date now) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String Fecha = sdf.format(now);
		return Fecha;
	}
	
	
	public static double consumoKilometros(double consumoporkilometros, double consumomedio) {
		consumoporkilometros = (consumomedio * 100) / 1000;
		return consumoporkilometros;
	}
	
	
	public static double RangoEstimado (double consumomedio, double combustible) {
		double Rango = consumomedio * combustible;
		
		return Rango;
	}
	
	public static double EstRango(double consumomedio, double combustible) {
		double EstRango = RangoEstimado(consumomedio, combustible);
		if (EstRango < 100.0) {
			System.out.println("El rango es muy limitado, es recomendable repostar.");;
		} else if (EstRango >= 100.0 && EstRango <= 500.0) {
			System.out.println("El rango es adecuado para viajes cortos."); ;
		} else if (EstRango > 500.0) {
			System.out.println("El rango es suficiente para viajes largos.");
		}
		return EstRango;
	}
	
	public static String consumoEficiente (double consumomedio) {
		String consumo = "";
		if (consumomedio >= 5.0 && consumomedio <= 8.0) {
			consumo = "El consumo es eficiente.";
		} else {
			consumo = "El consumo no es eficiente. Debería estar entre 5 y 8 litros/100 km.";
		}
		return consumo;
	}
	
	
	public static String DevolverMenu (String menu) {
		menu = "------------------| MENÚ FECHAS |--------------------------------" +
				 "\n| 1 – Qué hora es? \t\t\t\t\t\t|\n| 2 – Qué día de la semana es? \t\t\t\t\t|\n| 3 – Cuántos días quedan para para las vacaciones de Navidad? \t|" +
					"\n| 0 – Cerrar el programa \t\t\t\t\t|\n-----------------------------------------------------------------";
		return menu;
	}
	
}
