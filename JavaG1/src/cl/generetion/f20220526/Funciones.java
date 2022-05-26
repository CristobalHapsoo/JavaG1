package cl.generetion.f20220526;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		//Funciones
		//4 tipos de funciones 
		//2 que retornan, o sea, que entregan un valor
		//2 no retornan
		//nombre_funcion se escribe con minniscula la primera letra
		//no puede crear un meotodo dentro de otro metodo, si puede llamar a otro metodo
	    saludo();
	    sumadePares(23, 33, "2");
        
	    int edad = obtenerEdad(); //guardando el dato en una nueva variable y convirtiendo de Integer a int
	    System.out.println(edad);
	    
        boolean mayorOMenor = validarMayorEdad(edad);
		
		if(mayorOMenor) {
			System.out.println("Puede ingresar al curso");
		}else {
			System.out.println("No tiene la edad suficiente para acceder al curso");
		}
	    
	    

	}
    //las funciones se hacen afuera
	//las variables van dentro de las funciones 
	//los parametros se definen en los ()
	//publica es que podemos usarla desde cualquier parte
	//tipo_de_retorno nombre_funcion(parametros_a_reibir)
	//las funciones void no retornan nada, solo ejecutan el codigo
	public static void sumadePares(int numero1, Integer numero2, String numero3) {
		Integer num3 = Integer.parseInt(numero3);
		System.out.println(numero1 + numero2 + num3);
	}
	//Static nos permite acceder al metodo
	public static void saludo() {
        //Soliticar el ingreso de datos
		System.out.println("Buenos dias");
	
	
	}
	
	public static Integer obtenerEdad(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa edad");
		Integer edad = sc.nextInt();
		return edad;//Retornar el cotenido de la variable. 
		
	}
	
	public static Boolean validarMayorEdad(Integer edad){
		
		if(edad>= 18) {
			System.out.println("Es mayor de edad");
			return true;
		}else {
			System.out.println("Es menor de edad");
			return false; 
		}
		
		//return true; //False
	}
	
}
