package Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class DadoMain {

		public static void main(String[] args) {
			try {
				Dado dadoCuatro = new Dado((short) 6);
				System.out.println(dadoCuatro);
				dadoCuatro.lanzar();
				dadoCuatro.lanzar();
				dadoCuatro.lanzar();
				dadoCuatro.lanzar();
				dadoCuatro.lanzar();
				dadoCuatro.lanzar();
				dadoCuatro.lanzar();
				dadoCuatro.lanzar();
				dadoCuatro.lanzar();
				System.out.println(dadoCuatro);
			} catch (DadoNoPermitidoException e) {
				System.out.println(e.getMessage());
			}

		}

	}