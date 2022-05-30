package cl.generetion.f20220526;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ConexionArrayList {

	public static void main(String[] args) {
		// ArrayList
		//vamos a crear una instacia de un objeto 
		//es un arreglo tipo objeto 
		// dinamicos, podemos seguir modificando su tamaño 
		//List es una interfaz
		
		/*n ArrayList tiene un tamaño dinámico, mientras que el de un Array es definido en su creación.
		Un ArrayList no puede contener datos primitivos, sólo Objetos.
		El ArrayList permite comprobar que los datos que se añaden a la colección son del tipo correcto en tiempo de compilación.
		El Array puede ser de varias dimensiones, el ArrayList es unidimensional (aunque pueda ser un ArrayList de ArrayLists)*/
	    ArrayList<String> colores = new ArrayList<String>();
	    ArrayList<Integer> numerosPares =  new ArrayList<Integer>();

	    
	    
	    //agregar un elemento a la lista 
	    colores.add("Azul");
	    colores.add("Rojo");
	    colores.add(2,"verde");
	    colores.add(1,"negro");
	    System.out.println(colores);
	    
	    
	    //acceder a un elemento 
	    System.out.println(colores.get(2));
	    
	    //ver tamaño de la array.
	    System.out.println(colores.size());
	    
	    //para modificar un elemento
	    colores.set(2, "rosado");
	    System.out.println(colores);
	    
	    //quitar un elemento 
	    colores.remove(2);
	    System.out.println(colores);
	    
	    //quitar todos los elementos 
	    //colores.clear();
	    //System.out.println(colores);
	    System.out.println("\n");
        
	    // se puede obtener el valor unico y posicion del elemento. 
	    for (int i = 0; i < colores.size(); i++) {
	    	System.out.println(colores.get(i));	
	    }
	    System.out.println("\n");
	    
	    //Foreach 
	    for (String i : colores) { 
	    	System.out.println(i);
	    	
	    }
	    
	    
	    //ordenar el arreglo de forma asedentemente, impacta el arreglo no es temporal 
	    Collections.sort(colores);
	    System.out.println(colores);
	    
	    
	         
	    numerosPares.add(3);
	    numerosPares.add(1);
	    numerosPares.add(8);
	    numerosPares.add(12);
	    numerosPares.add(32);
	    numerosPares.add(344);
	    numerosPares.add(31);
	    numerosPares.add(93);
	    System.out.println(numerosPares);
	    
	    //inveritir los valores 
	    Collections.reverse(numerosPares);
	    
	    System.out.println("\n");
	    System.out.println("\n");
	 
	    
	    
	    // de acá la array va a cambiar 
	    Collections.sort(numerosPares);
	    System.out.println(numerosPares);
	    
	    System.out.println("\n");
	    
	    //no ordena de forma descendete  
	    Collections.reverse(numerosPares);
	    System.out.println(numerosPares);
	    
	    
	    
	    
	    
	  
	   
	  
	
	}
}
