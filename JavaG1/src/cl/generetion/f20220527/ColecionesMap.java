package cl.generetion.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColecionesMap {

	public static void main(String[] args) {
		// colecciones Map
		//Pares clave <-> valor  {}
	   //HashMap<K, V> map = new HashMap<K, V>();
	   //k key o clave; V value o valor
	   //HashMap mapa = new HashMap();
		
		HashMap<String, String> objHashMap = new HashMap<>();
		//HashMap objHashMap= new HashMap();
	 
		                //clave     //valor
	    objHashMap.put("Nombre", "Cristobal");
	    objHashMap.put("ApellidoP", "Hapsoo");
	    objHashMap.put("ApellidoM", "Torres");
	    objHashMap.put("edad", "23");
	    System.out.println("Elmentos del mapa");
	    System.out.println(objHashMap);
	    
	    
	    //No trabaja por la posición
	    //obetener un valor a traves de ua clave
	    objHashMap.get("ApellidoM");
	    System.out.println(objHashMap.get("ApellidoM"));
	    
	    //eliminar par 
	    objHashMap.remove("edad");
	    System.out.println(objHashMap);
	    
	    //Mostrar todas las llaves disponibles
	    System.out.println(objHashMap.keySet());
	    
	    //Mostrar solo los valores
	    System.out.println(objHashMap.values());
	    
	    
	    ArrayList<String> vocales = new ArrayList<String>();
	    vocales.add("a");
	    vocales.add("e");
	    vocales.add("i");
	    vocales.add("o");
	    vocales.add("u");
	    
	    
	    //HastMap es lo mas cercano que tenemos como una API.
	    //objHashMap.put("vocales",vocales);
	    System.out.println(objHashMap);
	    
	    //Si no encuentra la key retorna con un Null
	    System.out.println(objHashMap.get("vocales"));
	    
	    
	    //Crear un menu de comida
	    //Solicitar al usuario que elija el plato 
	    //imprimir el plato 
	    
	    
	    
	    //Recorrer un HasMap
	    for(Object clave : objHashMap.keySet()) {
			System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave)); 
			
		}
	    
	    
	
	}
	
	
	

}
