package cl.generetion.f20220527;

public class Auto {

		// TODO Auto-generated method stub
		
		
		//clase es un modelo o prototipo
		// objeto, nace a partir de la clase, caracteristica o atributo,
		//tiene metodos o funciones
		//algo concreto, lo convertios en abstracto (Algo no tangible)
		//tangible: usamoos los 5 sentidos para describir. 
		
		
		//atributo 
		//Atributo de colaboracion 
		//accesadot tipo nombreDelAtributo
		private String color;
		private String marca;
		private String modelo;
        private Double velocidad;
        
        //constructor vacio 
    	public Auto() {
			
		}
        //Conatructor con paramentros
        public Auto(String color, String marca, String modelo, Double velocidad) {
			this.color = color;
			this.marca = marca;
			this.modelo = modelo;
			this.velocidad = velocidad;
		}
	
        //accesadores y mutadores (get y set)
    	public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
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
		public Double getVelocidad() {
			return velocidad;
		}
		public void setVelocidad(Double velocidad) {
			this.velocidad = velocidad;
		}

		
		//metodos o funciones personalizada
		
		public  void  aumentarVelocidad(){
			this.velocidad = 10d;
		}
		
		
	
        
	
		
		
	    
			
		
	}


