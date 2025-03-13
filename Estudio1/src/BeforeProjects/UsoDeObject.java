package BeforeProjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UsoDeObject {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner (System.in);
		
				Date fechaNac = new Date();
				System.out.println("Introduce Tu Fecha De Nacimiento Con El Formato \"dd-MM-yyyy\"");
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String input = scan.nextLine();
				fechaNac = sdf.parse(input);
				System.out.println(Utilidades.calcularEdad(fechaNac));
		
				
				
		scan.close();
	}

}
