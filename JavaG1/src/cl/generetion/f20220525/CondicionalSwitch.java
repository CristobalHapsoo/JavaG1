package cl.generetion.f20220525;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// menu

		System.out.println("Ingrese Opción");
		System.out.println(" 1 sumar \n 2 restar \n 3 multiplicar \n 4 dividir");
		int opcion = sc.nextInt();
		while (opcion < 0 || opcion > 4) { // V i V = V

			System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
			opcion = sc.nextInt();
		}
		System.out.println(" fuera del while");
		// switch (key)
		switch (opcion) {
		// case value:
		case 1:// sumar
				// accion para la opcion 1
			System.out.println("** Suma");
			break;
		case 2:
			System.out.println("** Resta");
			break;
		case 3:
			System.out.println("** Multiplicacion");
			break;
		case 4:// division
			System.out.println("** Division");
			break;
		default:
			System.out.println("opcion invalida");
			break;
		}
		System.out.println("Fuera del Switch");
	}

}
