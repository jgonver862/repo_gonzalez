package com.JuanAntonioGV.tareau4;


import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Ahorcado {

		public static void main(String[] args) {
			String[] palabras = new String[10];
			palabras[0] = "zanahoria";
			palabras[1] = "mandarina";
			palabras[2] = "limón";
			palabras[3] = "aguacate";
			palabras[4] = "patata";
			palabras[5] = "espinaca";
			palabras[6] = "fresa";
			palabras[7] = "mango";
			palabras[8] = "manzana";
			palabras[9] = "coliflor";
			Scanner scan = new Scanner(System.in);
			Random R = new Random();
			System.out.println("-------- JUEGO: AHORCADO --------");
			System.out.println("|1.- Jugar \t\t\t |");
			System.out.println("|2.- Finalizar el juego \t |");
			System.out.println("---------------------------------");
			System.out.println("Elige Una Opcion: ");
			boolean opcionincorrecta = false;
			do {
				int opcion = scan.nextInt();
				int contador = 5;
				switch(opcion) {
				case 1:
					int aleatorio = R.nextInt(10);
					String palabrasecreta = palabras[aleatorio];
					String secreto = "";
					if (palabrasecreta.equals(palabras[0])) {
						secreto = palabrasecreta.replace( "zanahoria", " _ _ _ _ _ _ _ _ _ ");
						System.out.println(secreto);
					}
					
					if (palabrasecreta.equals(palabras[1])) {
						secreto = palabrasecreta.replace( "mandarina", " _ _ _ _ _ _ _ _ _ ");
						System.out.println(secreto);
					}
					
					if (palabrasecreta.equals(palabras[2])) {
						secreto = palabrasecreta.replace( "limón", " _ _ _ _ _ ");
						System.out.println(secreto);
					}
					
					if (palabrasecreta.equals(palabras[3])) {
						secreto = palabrasecreta.replace( "aguacate", " _ _ _ _ _ _ _ _ ");
						System.out.println(secreto);
					}
					
					if (palabrasecreta.equals(palabras[4])) {
						secreto = palabrasecreta.replace( "patata", " _ _ _ _ _ _ ");
						System.out.println(secreto);
					}
					
					if (palabrasecreta.equals(palabras[5])) {
						secreto = palabrasecreta.replace( "espinaca", " _ _ _ _ _ _ _ _ ");
						System.out.println(secreto);
					}
					
					if (palabrasecreta.equals(palabras[6])) {
						secreto = palabrasecreta.replace( "fresa", " _ _ _ _ _ ");
						System.out.println(secreto);
					}
					
					if (palabrasecreta.equals(palabras[7])) {
						secreto = palabrasecreta.replace( "mango", " _ _ _ _ _");
						System.out.println(secreto);
					}
					
					if (palabrasecreta.equals(palabras[8])) {
						secreto = palabrasecreta.replace( "manzana", " _ _ _ _ _ _ _ ");
						System.out.println(secreto);
					}
					
					if (palabrasecreta.equals(palabras[9])) {
						secreto = palabrasecreta.replace( "coliflor", " _ _ _ _ _ _ _ _ ");
						System.out.println(secreto);
					}
					System.out.println("L.- Probar letra");
					System.out.println("R.- Resolver palabra");
					System.out.println("S.- Salir");
					System.out.println("Elige una opción: ");
					boolean opcionincorrecta2 = false;
					do {
						String opcion2 = scan.nextLine();
						switch(opcion2) {
						case "L":
							System.out.print("\nIntroduce una letra: ");
							String letra = scan.nextLine();
							if (StringUtils.contains(palabrasecreta, letra)) {
								System.out.println("Enhorabuena. La Letra Esta En El Indice " + StringUtils.indexOf(palabrasecreta, letra));
							} else {
								System.out.println("NO CONTIENE ESA LETRA.");
							}
							contador--;
							break;
						case "R":
							System.out.print("\nIntroduce la palabra: ");
							String descubrirpalabra = scan.nextLine();
							if (descubrirpalabra.equals(palabrasecreta)) {
								System.out.println("Enhorabuena, Has Descubierto La Palabra");
							} else {
								System.err.println("No es la palabra que has escrito.");
								opcionincorrecta2 = true;
								contador--;
							}
							break;
						case "S":
							mostrarMenu();
							break;
						default:
							opcionincorrecta2 = true;
							break;
						}
						
						if (contador == 0) {
							System.err.println("NO TIENES MAS INTENTOS. LA PALABRA ERA " + palabrasecreta);
							break;
						}
						
					} while (opcionincorrecta2);
					
					break;
				case 2:
					System.out.println("Hasta Pronto! ;)");
					break;
				default:
					opcionincorrecta = true;
					System.err.println("Has introducido la opcion incorrecta");
					break;
				}
			} while (opcionincorrecta);
			scan.close();
		}

		
		private static void mostrarMenu() {
			System.out.println("-------- JUEGO: AHORCADO --------");
			System.out.println("|1.- Jugar \t\t\t |");
			System.out.println("|2.- Finalizar el juego \t |");
			System.out.println("---------------------------------");
			System.out.print("\nElige Una Opcion: ");
			
		}
}