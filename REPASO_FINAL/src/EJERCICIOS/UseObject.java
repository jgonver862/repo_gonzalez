package EJERCICIOS;



public class UseObject {

	public static void main(String[] args) throws ParseException {
		int[] Array = new int[100];
		
		int numeroentero = 0;
		
		for (int i = 0; i < 100; i+=1) {
			Array[i] = numeroentero;
			numeroentero += 1;
			System.out.println("Array[" + i + "] = " + numeroentero);
		}
			

	}

}
