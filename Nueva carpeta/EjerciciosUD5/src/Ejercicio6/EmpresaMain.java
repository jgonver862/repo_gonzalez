package Ejercicio6;

public class EmpresaMain {

	public static void main(String[] args) {
		try {
			Empleado emp = new Empleado("Carmen", "Martínez García", "44072328G", 1800f);
			System.out.println(emp);
			Empresa empresaIesT = new Empresa("IES Trafalgar", "B2367483J");
			Empleado empCarmen = new Empleado("Carmen", "Martínez García", "44072328G", 1800f);
			Empleado empManuel = new Empleado("Manuel", "Moreno Luján", "19964529T", 1625f);
			empresaIesT.anadirEmpleado(empManuel);
			empresaIesT.anadirEmpleado(empCarmen);
			empresaIesT.mostrarInfoEmpleados();
			System.out.println("Total de sueldos brutos: " + empresaIesT.sumaSueldoBrutoEmpleados());
		} catch (EmpresaCompletaException e) {
			e.printStackTrace();
		} catch (EmpresaEmpleadoExistenteException e) {
			e.printStackTrace();
		} catch (EmpleadoInvalidoException e) {
			e.printStackTrace();
		}

	}

}