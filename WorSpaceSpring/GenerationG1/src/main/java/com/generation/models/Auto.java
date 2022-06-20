package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="Auto")
public class Auto {
	//Crear Pkey y AutoIncrem.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Atributos
	private long Id;
	private String marca;
	private String modelo;
	private String anio; 
	private Double velocidad;
	
    //C. vacio 
	public Auto() {
	 super();
    }

	
	//Get and Set

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	
	
	

}
