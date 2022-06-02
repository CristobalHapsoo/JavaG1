package cl.generetion.f20220602;

public class Cliente extends Usuario {
   
	
	//Atributos
	private int cantCompras;
    
	//C. Vacio 
	 public Cliente() {
	    }
	//get and set 
	
	 public int getCantCompras() {
			return cantCompras;
		}

		public void setCantCompras(int cantCompras) {
			this.cantCompras = cantCompras;
		}
	
	//toString 
		@Override
		public String toString() {
			return "Cliente [cantCompras=" + cantCompras + "]";
		}

        
		//Login Cliente 
		@Override
		public Boolean login(String nombre, String password) {
			
			if (nombre.equals("usuarioPrueba")  && password.equals("test123") ) {
				System.out.println("Has iniciado Sesion como usuario");
				return true;
			}
			else {
				System.out.println("Acceso denegado");
				return false;
			}
		}
		//Metodo de hijo
		public String hacerPreguntas(String pregunta) {
			System.out.println("La pregunta ha sido publicado como: " + pregunta);
			return pregunta;
		}

}
