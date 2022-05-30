package cl.generetion.f20220530;

public class Alumno {
     //atributos
	private String nombre; //protected o public
	private String apellido;
	private int edad; 
	private String curso; 
	//Java tiene la función de encapsulamiento. 
    //con protected podremos entrar a todos los packgs. 
	//public Cuialquiera puede entrar
	//private solo la clase o objeto. 
   
	//contructores vacio  
	public Alumno() {
		
	}
	
	
	//constructores
	public Alumno(String nombre, String apellido, int edad, String curso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}
	
    //get y set 

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	}
	
   //funciones
    
}
