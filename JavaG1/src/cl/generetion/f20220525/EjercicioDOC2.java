package cl.generetion.f20220525;

import java.util.Scanner;

public class EjercicioDOC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 Scanner sc = new Scanner(System.in);
			        //escribe un programa que solicite el valor inferior y superior de un rango.
			        //A continuación se van introduciendo números hasta que introduzcamos el 0.
				 int limiteInferior, limiteSuperior,numero,sumaDentro,numFuera,numDentro;
				
				 //Variables contadoras y acumuladoras debemos inicializarlas
				 sumaDentro = 0;
				 numDentro = 0;
				 numFuera = 0;
			        do {
			            System.out.println("Ingrese el limite Inferior");
			            limiteInferior = sc.nextInt();
			            System.out.println("Ingrese el limite superior");
			            limiteSuperior = sc.nextInt();
			        }while(limiteInferior > limiteSuperior);
			        System.out.println("A continuacion ingresa tus números\n,si quieres finalizar,ingresa un 0\n");
			        do {
			        	
			        	System.out.println("Ingresa tu número");
			        	numero = sc.nextInt();
			        	
			        	if(numero >= limiteInferior && numero <= limiteSuperior) { //¿consideramos limites?
			        		sumaDentro += numero;
			        	}
			        	if(numero < limiteInferior || numero > limiteSuperior) {
			        		
			        		numFuera++;
			        	}
			        	if(numero == limiteInferior || numero == limiteSuperior) {
			        		
			        		numDentro++;
			        	}
			        	
			        }while(numero!=0);
			       
			        System.out.println("La suma de los números que están dentro del rango es: " + sumaDentro);
			        System.out.println("Cuantos números están fuera del rango?\n " + numFuera);
			        System.out.println("Cuantos números son igual a los valores del rango?\n " + numDentro);
	}

}
