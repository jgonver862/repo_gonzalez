package com.JuanAntonioGV.tareau4;

import java.util.Scanner;


public class MaquinaExpendedora {

	public static void main(String[] args) {
		String[][] productos = {
				{"Coca-Cola", "Sprite", "Fanta naranja"},
				{"Fanta limón", "Red Bull", "Monster"},
				{"Pepsi", "Schweppes tónica", "Agua mineral"},
				{"Cruzcampo", "Heineken", "Zumo de piña"}
				};
		Integer[][] unidades;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Pedir bebida");
		System.out.println("2. Mostrar bebidas");
		System.out.println("3. Apagar maquina");
		System.out.println("Elige una opcion");
		int unidadesrestantes = 5;
		boolean devolver = false;
		do {
			int opcion = scan.nextInt();
			int pedido = 0;
			switch(opcion) {
			case 1:
				System.out.println("¿Que Bebida Quieres Pedir?");
				pedido = scan.nextInt();
				if (pedido == 11) {
					System.out.println("Has Pedido Coca Cola");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 11;
				}
				if (pedido == 21) {
					System.out.println("Has Pedido Sprite");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 21;
				}
				if (pedido == 31) {
					System.out.println("Has Pedido Fanta naranja");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 31;
				}
				if (pedido == 12) {
					System.out.println("Has Pedido Fanta limón");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 12;
				}
				if (pedido == 22) {
					System.out.println("Has Pedido Red Bull");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 22;
				}
				if (pedido == 32) {
					System.out.println("Has Pedido Monster");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 32;
				}
				if (pedido == 13) {
					System.out.println("Has Pedido Pepsi");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 13;
				}
				if (pedido == 23) {
					System.out.println("Has Pedido Schweppes tónica");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 23;
				}
				if (pedido == 33) {
					System.out.println("Has Pedido Agua mineral");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 33;
				}
				if (pedido == 14) {
					System.out.println("Has Pedido Cruzcampo");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 14;
				}
				if (pedido == 24) {
					System.out.println("Has Pedido Heineken");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 24;
				}
				if (pedido == 34) {
					System.out.println("Has Pedido Zumo de piña");
					unidadesrestantes = unidadesrestantes - 1;
					pedido = 34;
				}
				if (unidadesrestantes == 0) {
					System.err.println("No puedes pedir mas bebidas.");
				}
				System.out.println("Has pedido el pedido numero " + pedido + ". Quedan " + unidadesrestantes + " unidades.");
				break;
			case 2:
				System.out.println("11 - Coca-Cola");
				System.out.println("21 - Sprite");
				System.out.println("31 - Fanta naranja");
				System.out.println("12 - Fanta limón");
				System.out.println("22 - Red Bull");
				System.out.println("32 - Monster");
				System.out.println("13 - Pepsi");
				System.out.println("23 - Schweppes tónica");
				System.out.println("33 - Agua mineral");
				System.out.println("14 - Cruzcampo");
				System.out.println("24 - Heineken");
				System.out.println("34 - Zumo de piña");
				break;
			case 3:
				System.out.println("Hasta Luego");
				devolver = true;
				break;
			default:
				System.err.println("No has introducido una opcion correcta.");
				break;
			}
			
		} while (devolver = true);
		
	}

	
		
	}

	

