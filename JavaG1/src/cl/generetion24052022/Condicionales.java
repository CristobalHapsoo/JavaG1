package cl.generetion24052022;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {

		/*
		 * Pedir: Primero solicitar todos los String sc.nextLine(); nombre, apellido,
		 * direccion
		 * 
		 * Segundo solicitar todos los datos numericos edad, numero Direccion
		 * 
		 * Saldo ($)
		 * 
		 * Validar que usuario: - Mayor de edad - Saldo minimo $50.000 else
		 * "No puede apostar" - Cuanto apostara Minimo $10.000 Si quiere apostar más
		 * avisar que no tiene más.
		 *
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		// Variables String
		System.out.println("Ingrese su nombre:");
		String nombre = sc.nextLine();

		System.out.println("Ingrese su apellido:");
		String apellido = sc.nextLine();

		System.out.println("Ingrese su direccion:");
		String dirección = sc.nextLine();

		// Variables Int
		int mayoriaEdad = 18; // con esto establecemos la edad minima para participar

		System.out.println("Ingrese su edad:");
		int edad = sc.nextInt();// esto es para capturar el ingreso por consola y se guarda en una variable
		int saldoMinimo = 50000;
		int apuestaMinima = 10000;

		// Validar edad
		if (edad >= mayoriaEdad) {
			System.out.println("Bienvido al casino.");

			// Dentro del cacino
			System.out.println("¿Cuánto es su saldo inicial?");
			int saldoInicial = sc.nextInt();

			// validar Saldo mayor a 50.000
			if (saldoInicial >= saldoMinimo) {
				// Cuanto apostara
				System.out.println("¿Cuanto quiere apostar?");
				int apuesta = sc.nextInt();

				if (apuesta >= apuestaMinima) {
					if (apuesta > saldoInicial) {
						System.out.println("No tiene saldo suficiente");
					} else {
						System.out.println("Su apuesta fue de: " + apuesta);
					}
				} else {
					System.out.println("Apuesta tiene que se mayor de 10000");
				}
			} else {
				System.out.println("No tiene saldo suficiente. Anda al cajero!");
			}

		} else {
			System.out.println("Usted no esta permitido a entrar, no me haga llamar a sus padres");
		}

	}

}

