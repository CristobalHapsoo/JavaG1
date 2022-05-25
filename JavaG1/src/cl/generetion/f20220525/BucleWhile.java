package cl.generetion.f20220525;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese la opcion (1) Entrar ; (0) Salir");
		int opcion = sc.nextInt();// capturando el ingreso por consola
		int termino = 0;

		while (termino <= 10) {
			System.out.println("el valor de termino es " + termino);
			termino++;

			// while valida que la condicion sea verdadera
			while (opcion != 1 && opcion != 0) {// desde aqui

				System.out.println("ingrese la opcion (1) Entrar ; (0) Salir");
				opcion = sc.nextInt();

			} // hasta aca
		}

	}

}
