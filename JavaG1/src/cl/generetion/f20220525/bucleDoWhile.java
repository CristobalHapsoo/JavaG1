package cl.generetion.f20220525;

import java.util.Scanner;

public class bucleDoWhile {

	public static void main(String[] args) {
		// Dowhile
		// a lo menos se ejectura una vez
		 Scanner sc = new Scanner(System.in);
		 int opcion = 0;
		 int termino = 8;
		do {

			System.out.println("el valor de termino es " + termino);
			termino++; //este es por el boucle. 
		} while (termino <= 10);

		System.out.println("*****************");

		while (termino <= 10)
			;
		{
			System.out.println("While el valor de termino es " + termino);
			termino++;

		}
		System.out.println("********* fin ****************");
		
		do {

			System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
			opcion = sc.nextInt(); // es por parte del usuario. 
			
		} while (opcion < 0 || opcion > 4);
		}

}
