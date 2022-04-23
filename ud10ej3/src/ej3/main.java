package ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		try {
			System.out.println("Generando número aleatiorio... ");
			int numeroAleatorio;
			numeroAleatorio = (int) Math.floor(Math.random() * (1 - 900 + 1) + 900);
			System.out.println("El numero aleatorio generado es: "+numeroAleatorio);

			
			// resuelve codigo con excepcion
			
			

			if (numeroAleatorio % 2 == 0) {
				throw new MiException(1);
			} else  {
				throw new MiException(2);
			}

		} catch (MiException e) {
			System.out.println(e.getMessage());
		}

	}
}
