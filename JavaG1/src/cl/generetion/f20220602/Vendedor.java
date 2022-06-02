package cl.generetion.f20220602;

public class Vendedor extends Usuario  {
    
	
	private Boolean puedePublicar;
	private int cantPublicaciones;
 
    //C. Vacio
	 public Vendedor() {
	    }

    
    
    // get and set 
    public Boolean getPuedePublicar() {
		return puedePublicar;
	}
	public void setPuedePublicar(Boolean puedePublicar) {
		this.puedePublicar = puedePublicar;
	}
	public int getCantPublicaciones() {
		return cantPublicaciones;
	}
	public void setCantPublicaciones(int cantPublicaciones) {
		this.cantPublicaciones = cantPublicaciones;
	}

    
    //toString
	@Override
	public String toString() {
		return "Vendedor [puedePublicar=" + puedePublicar + ", cantPublicaciones=" + cantPublicaciones + "]";
	}
    
	//Login Vendedor
	@Override
	public Boolean login(String nombre, String password) {
		
		if (nombre.equals("vendedorPrueba")  && password.equals("test123") ) {
			System.out.println("Has iniciado Sesion como Vendedor");
			return true;
		}
		else {
			System.out.println("Acceso denegado");
			return false;
		}
			
	}
	
	//Metodo de hijo
	public String responderPreguntas(String responder) {
		System.out.println("La respuesta ha sido publicado como: " + responder);
		return responder;
	} 



}
