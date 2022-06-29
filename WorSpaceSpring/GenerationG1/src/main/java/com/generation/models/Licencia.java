package com.generation.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="licencias")
public class Licencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer numero;
	private Date fechaDeVencimiento;
	private String clase;
	private String estado;
	
	//Guardar en la fecha de creacion y el otro en la de actualizacion 
	@Column (updatable = false)
	private Date createdAt;
	private Date updateAt;
	
	
	//relaciones  oneToOne 1a1
	@OneToOne (fetch=FetchType.LAZY) // buscar la lincencia, cuando la vas a consumir // el eager trae todas las relaciones
 	@JoinColumn(name="usuario_id")  //Fk de la otra entidad
	private Usuario usuario;
	
	  //C. vacio 
		public Licencia() {
		 super();
	    }
	
		
		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public Integer getNumero() {
			return numero;
		}


		public void setNumero(Integer numero) {
			this.numero = numero;
		}


		public Date getFechaDeVencimiento() {
			return fechaDeVencimiento;
		}


		public void setFechaDeVencimiento(Date fechaDeVencimiento) {
			this.fechaDeVencimiento = fechaDeVencimiento;
		}


		public String getClase() {
			return clase;
		}


		public void setClase(String clase) {
			this.clase = clase;
		}


		public String getEstado() {
			return estado;
		}


		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updateAt = new Date();
	    }
		
		
		
		
		
		
}
