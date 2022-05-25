package cl.generetion.f20220525;

import java.util.Scanner;

public class ejercicio2f20220525 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int edad,edadDescNinos,edadDescMayores,cantidadDeTickets;  //Declarar variables en una sola línea
		double descNinos,descMayores,descDesdeDos,precio;
		
		//Estáticas
		
		edadDescNinos = 15;
		edadDescMayores = 60;
		precio = 3500;
		descNinos = 0.4;
		descMayores = 0.45;
		descDesdeDos = 0.7;
		
		System.out.println("Por favor, ingrese su edad");
		edad = entrada.nextInt();
		
		if(edad<=edadDescNinos){
		
		precio = precio * descNinos;
		System.out.println("El costo de su entrada es de: $" + precio);
		
		}else if(edad>edadDescNinos && edad<=edadDescMayores){
					System.out.println("Cuantos tickets deseas comprar?");
					cantidadDeTickets = entrada.nextInt();
					if(cantidadDeTickets > 1){
						precio = precio * cantidadDeTickets*descDesdeDos;
						System.out.println("El costo de su entrada es de: $" + precio);
						}
		
		}
		
		else if(edad>edadDescMayores){
		
		precio = precio * descMayores;
		System.out.println("El costo de su entrada es de: $" + precio);
		}
		}
	
	
	}

