package EJERCICIOS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UtilidadesObject {

	public static String FechaActual(Calendar fecha) {
		Calendar Fecha = Calendar.getInstance();
		LocalDate dia = LocalDate.now();
		LocalTime horario = LocalTime.now();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String diaSemana = "";
		String mesActual = "";
		switch (Fecha.get(Calendar.DAY_OF_WEEK)) {

		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Lunes";
			break;
		case 3:
			diaSemana = "Martes";
			break;
		case 4:
			diaSemana = "Miercoles";
			break;
		case 5:
			diaSemana = "Jueves";
			break;
		case 6:
			diaSemana = "Viernes";
			break;
		case 7:
			diaSemana = "Sabado";
			break;
		// TODO:Completar con el resto de los días de la semana
		default:
			break;
		}

		switch (Fecha.get(Calendar.MONTH)) {
		case 0:
			mesActual = "Enero";
			break;
		case 1:
			mesActual = "Febrero";
			break;
		case 2:
			mesActual = "Marzo";
			break;
		case 3:
			mesActual = "Abril";
			break;
		case 4:
			mesActual = "Mayo";
			break;
		case 5:
			mesActual = "Junio";
			break;
		case 6:
			mesActual = "Julio";
			break;
		case 7:
			mesActual = "Agosto";
			break;
		case 8:
			mesActual = "Septiembre";
			break;
		case 9:
			mesActual = "Octubre";
			break;
		case 10:
			mesActual = "Noviembre";
			break;
		case 11:
			mesActual = "Diciembre";
			break;
		default:
			break;

		}
		String FechaActual = Fecha.get(Calendar.DAY_OF_MONTH) + "/" + (Fecha.get(Calendar.MONTH) + 1) + "/"
				+ Fecha.get(Calendar.YEAR) + " " + horario.getHour() + ":" + horario.getMinute() + ":"
				+ horario.getSecond() + " \nDia De La Semana: " + diaSemana + "\nMes En El Que Estamos: " + mesActual
						+ "\nAño En El Que Estamos: " + Fecha.get(Calendar.YEAR);

		
		try {
			Date FechaAct = sdf.parse(FechaActual);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return FechaActual;
		
	}
	
	public static String AveriguarFecha (String FechaIntro, Calendar FechaActu) throws ParseException {
		Scanner scan = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		FechaIntro = scan.nextLine();
		if (FechaIntro.length() != 10) {
			System.out.println("Has introducido una fecha erronea");
		} else {
			try {
			Date FechaIntroDate = sdf.parse(FechaIntro);
			Calendar FechaIntroCal = Calendar.getInstance();
			FechaIntroCal.setTime(FechaIntroDate);
			FechaActu = Calendar.getInstance();
			if (FechaIntroCal.equals(FechaActu)) {
				System.out.println("Has Introducido La Fecha Correcta");
			} else {
				System.err.println("Has introducido Una Fecha Erronea");
			}
			
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			scan.close();
			
		}
		return FechaIntro;
		
		
	}

	public static int digitos(long numero) {
		int numCifras = 1;
		while (numero / 10 != 0) {
			numCifras++;
			numero = numero / 10;
		}
		return numCifras;
	}
}
