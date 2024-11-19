package EjerciciosUD3;

import java.util.Calendar;
import java.util.Date;

public class FuncionesFecha {

	public static String obtenerDiaSemana (Calendar fecha) {
		String dia = "";
		switch(fecha.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "lunes";
			break;
		case 3:
			dia = "martes";
			break;
		case 4:
			dia = "miercoles";
			break;
		case 5:
			dia = "jueves";
			break;
		case 6:
			dia = "viernes";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			break;
		}
		return dia;
	}
	public static String obtenerDiaSemana (Date fecha) {
		Calendar fechaCal = Calendar.getInstance();
		fechaCal.setTime(fecha);
		String dia = obtenerDiaSemana(fechaCal);
		return dia;
	}
}
