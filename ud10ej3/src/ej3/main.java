package ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int naleatorio = 0;
		GenerarNumero gnumero = new GenerarNumero();

		try {
			System.out.println("Generando numero aleatorio...");
			 naleatorio = gnumero.generarNumero();
			System.out.println("El numero aleatorio generado es: "+gnumero.getNumeroAleatorio());

			gnumero.comprobarNumero(naleatorio);

		} catch (MiException e) {
			System.out.println(e.getMessage());
		}

	}
}
