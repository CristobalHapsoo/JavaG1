package cl.generetion.f20220526;

import java.util.Arrays;

public class ColeccionesArray {

	public static void main(String[] args) {
		// Array {}
		String[] colores = {"red", "blue", "yellow", "orange", "black"};
		Integer[] numerosPares = {2,4,6,8,10,12};
		int [] primerosNumeros = {1,2,3,4,5,6,7,8,9,0}; 
		//COLORES, NUMEROSPARESM PRIMEROSNUMEROS SON ARREGLOS
		
		
		
		//posicion inicial es cero (0);
		System.out.println(colores[0]);
		System.out.println(numerosPares[0]);
		System.out.println(primerosNumeros[0]);
		
		
		//nombreArray[Posicion]  accediendo al elemento del arreglo en esa posicion
		System.out.println(numerosPares[3]);
		
		numerosPares[3] = 14;
		///Modificando el elemento en esa posicion
		System.out.println(numerosPares[3]);
		//no podemos agregar por posicion si no existe el elemento en el array
		
		
		System.out.println("tamaño array colores " + colores.length);
		System.out.println("tamaño array numeros Pares " +numerosPares.length);
		System.out.println("tamaño array primero Numeros " + primerosNumeros.length);
		
		// [Ljava.lang.String;@442d9b6e
		//[Lj que es un arreglo 
		//lang.String tipo de datos de la array
		System.out.println(colores);
		System.out.println(numerosPares);
		System.out.println(primerosNumeros);
		
		
		// En java para imprimir es Arrays.ToString, en cambio en otros lenguajes solo toString.
		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numerosPares));
		System.out.println(Arrays.toString(primerosNumeros));
		
		//recorrer un arreglo 
        for  (int i = 0; i < primerosNumeros.length; i++) {
        	System.out.println(primerosNumeros[i]);
		}
        System.out.println("\n");
        
        
        
        
        
        //Foreach 
        for (int i : primerosNumeros) {	// {1,2,3,4,5,6,7,8,9,0}
        	//int elemento = 2, asi hasta que no exista otro elemento en la array
        	System.out.println(i);
        }
        
       
        for (String i :colores){ //"red", "blue", "yellow", "orange", "black"} 
        	//int elemento = 2, asi hasta que no exista otro elemento en la array
        	System.out.println(i);
        }
        
        for (int i : numerosPares){ //{2,4,6,8,10,12}
        	//int elemento = 2, asi hasta que no exista otro elemento en la array
        	System.out.println(i);
        }
        
	}

}
