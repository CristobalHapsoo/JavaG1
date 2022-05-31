package cl.generetion.f20220531;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
   //por default solo pueden entran al mismo packges.
   //con private solo puedo trabjar en la misma class, aunque con get and set se pueden llamar las funciones
   //protected
	
   private List<Integer> numerosVenta;
   private String rut; 
   protected Integer id;
   private String nombre;
   public String correo;
public char[] toString;
   
   public void modificarAtributo() {
   this.rut = "123456789-0";
   this.nombre = "Anton";
   }
   
   //vacio // asignar valores
   //los contrusctores sirven para darle valores a nuestro objeto, aunque uno es con paremetro y otro vacio. 
   public Cliente() {
		super();
	}
   
   
   
   //Get y Set
public List<Integer> getNumerosVenta() {
	return numerosVenta;
}

public void setNumerosVenta(List<Integer> numerosVenta) {
	this.numerosVenta = numerosVenta;
}
public String getRut() {
	return rut;
}
public void setRut(String rut) {
	this.rut = rut;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}

@Override
public String toString() {
	return "Cliente [numerosVenta=" + numerosVenta + ", rut=" + rut + ", id=" + id + ", nombre=" + nombre + ", correo="
			+ correo + "]";
}
   
   
   
   
   
   
   
   
   
   
}
