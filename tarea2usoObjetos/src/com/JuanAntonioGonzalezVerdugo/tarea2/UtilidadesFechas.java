package com.JuanAntonioGonzalezVerdugo.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UtilidadesFechas {

	public static int CalcularEdad(Calendar fechaADiaDeHoy) {
		Scanner scan = new Scanner(System.in);
		int Anio = scan.nextInt();
		int Edad = fechaADiaDeHoy.get(Calendar.YEAR) - Anio;
		System.out.println("Tienes " + Edad + " años");
		scan.close();
		return Anio;
	}

	
	
	public static String obtenerMes(Calendar mesAnio) {
		String mes = "";
		switch (mesAnio.get(Calendar.MONTH)) {
		case 0:
			mes = "Enero";
			break;
		case 1:
			mes = "Febrero";
			break;
		case 2:
			mes = "Marzo";
			break;
		case 3:
			mes = "Abril";
			break;
		case 4:
			mes = "Mayo";
			break;
		case 5:
			mes = "Junio";
			break;
		case 6:
			mes = "Julio";
			break;
		case 7:
			mes = "Agosto";
			break;
		case 8:
			mes = "Septiembre";
			break;
		case 9:
			mes = "Octubre";
			break;
		case 10:
			mes = "Noviembre";
			break;
		case 11:
			mes = "Diciembre";
			break;
		default:
			break;
		}
		return mes;
	}

	public static String parsearFecha(Calendar FechaNow) {
		String dia = "";
		switch (FechaNow.get(Calendar.DAY_OF_WEEK)) {
		
		
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		LocalDate FechaActualizada = LocalDate.now();
		LocalTime HoraActualizada = LocalTime.now();
		String FechaTotal = String.valueOf(FechaNow.get(Calendar.DAY_OF_MONTH)) + "-"
				+ String.valueOf(FechaNow.get(Calendar.MONTH)) + "-" + String.valueOf(FechaNow.get(Calendar.YEAR));
		try {
			Date fechaActualizadaDate = sdf.parse(FechaTotal);
			Calendar FechaActualizada2 = Calendar.getInstance();
			FechaActualizada2.setTime(fechaActualizadaDate);
			System.out.println("Es El Dia : " + FechaTotal + " " + dia + " "
					+ HoraActualizada.getHour() + ":" + HoraActualizada.getMinute() + ":" + HoraActualizada.getSecond());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		scan.close();

		return FechaTotal;
	}

	public static String comprobarFecha(Calendar FechaActual) {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String Fecha = scan.nextLine();
		try {
			Date fechaActDate = sdf.parse(Fecha);
			Calendar FechaAct = Calendar.getInstance();
			FechaAct.setTime(fechaActDate);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		scan.close();

		return Fecha;
	}

	
	
}
