package cl.generetion.f20220531.manager;

import java.util.ArrayList;
import java.util.List;

import cl.generetion.f20220531.Cliente;

public class ClienteManager {

	 
	 //recorrer el arreglo e imprimir 
	
	public void recorrerArregloCliente(List<Cliente> listaCliente ) {
		for (Cliente objetoCliente: listaCliente) {
	    	objetoCliente.getNombre();
	        System.out.println(objetoCliente.getNombre());
	   System.out.println(objetoCliente.toString);
	  
	    
	    	// System.out.println(objetoAlumno);
	    	

	    	
	    
		}
	}
}
	
