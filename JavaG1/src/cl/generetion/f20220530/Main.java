package cl.generetion.f20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Alumno> listaGrupo = new ArrayList<Alumno>();
		//lo agregamos de una forma dinamica
	
		
		//instacia de una clase 
		//Es una definición de un objeto y que invocamos un objet

		

		//Definiendo una instacia de un objeto
		//No es una función
		//El () es el  llamando al constructo vacio
		
		Alumno alumno2 = new Alumno (" Cristobal", " Hapsoo", 23," G1");
		Alumno alumno3 = new Alumno (" Cristian", " Yañez", 26," G1");
		Alumno alumno4 = new Alumno (" Alejandro", " Heredia", 29," G1");
		Alumno alumno5 = new Alumno (" Luis", " García", 28," G1");
		Alumno alumno6 = new Alumno (" Joao", " Aranda", 28," G1");
		
		Alumno alumno =  new Alumno ();
		listaGrupo.add(alumno);
		listaGrupo.add(alumno2);
		listaGrupo.add(alumno3);
		listaGrupo.add(alumno4);
		listaGrupo.add(alumno5);
		listaGrupo.add(alumno6);
		for (int i = 0; i < listaGrupo.size(); i++) {
			//van con (), ya que son fucnciones get
			//era una variable ahora es un objeto
	    	//System.out.println(listaGrupo.get(i).getNombre());	
	    	//System.out.println(listaGrupo.get(i).getApellido());	
			System.out.println(listaGrupo.get(i).toString());	
	    }
	    	
	    for (Alumno objetoAlumno : listaGrupo) {
	    	objetoAlumno.getNombre();
	    	objetoAlumno.getEdad();
	    	//System.out.println(objetoAlumno.getNombre());
	    	//System.out.println(objetoAlumno.getEdad());
	    	
	    	// System.out.println(objetoAlumno);
	    	
	    	
	    	
	    
		}
	    
		
		//Definiendo valores por default 
		//Llamndo a la funcion del get(Atributos) y set (Aignar un valor al atributo
		
		
		//setter podremos asignar un valor 
		// estamos pasando un dato "this.nombre" = nombre;
		//no retorna nada 
		//llamado a la funcion
		
		/*System.out.println("--------- Grupo 3 --------");
		System.out.println("Nombre Alumno 1: " + alumno2.getNombre());
		System.out.println("Nombre Alumno 2: " + alumno3.getNombre());
		System.out.println("Nombre Alumno 3: " + alumno4.getNombre());
		System.out.println("Nombre Alumno 4: " + alumno5.getNombre());
		System.out.println("Nombre Alumno 5: " + alumno6.getNombre());

		System.out.println("Apellido Alumno 1: " + alumno2.getApellido());
		System.out.println("Apellido Alumno 2: " + alumno3.getApellido());
		System.out.println("Apellido Alumno 3: " + alumno4.getApellido());
		System.out.println("Apellido Alumno 4: " + alumno5.getApellido());
		System.out.println("Apellido Alumno 5: " + alumno6.getApellido());

		System.out.println("Edad Alumno 1: " + alumno2.getEdad());
		System.out.println("Edad Alumno 2: " + alumno3.getEdad());
		System.out.println("Edad Alumno 3: " + alumno4.getEdad());
		System.out.println("Edad Alumno 4: " + alumno5.getEdad());
		System.out.println("Edad Alumno 5: " + alumno6.getEdad());

		System.out.println("Curso Alumno 1: " + alumno2.getCurso());
		System.out.println("Curso Alumno 2: " + alumno3.getCurso());
		System.out.println("Curso Alumno 3: " + alumno4.getCurso());
		System.out.println("Curso Alumno 4: " + alumno5.getCurso());
		System.out.println("Curso Alumno 5: " + alumno6.getCurso());*/
		System.out.println("--------- Grupo 3 --------");

	
		//ToString Return
	System.out.println(alumno2.toString());
	System.out.println(alumno3.toString());
	System.out.println(alumno4.toString());
	System.out.println(alumno5.toString());
	System.out.println(alumno6.toString());
	
	}
	
	
	

}
	
	

