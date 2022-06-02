package cl.generetion.f20220602;

public class Usuario {
    private String nombre;
    private String password;
    private String correo;
    private String rut;
    private String direccion;
    private String genero;
    private int edad;
    private int id;
    boolean esPremiun;
    boolean usuarioBloqueado;

   
    
    // C. Vacio
    public Usuario() {
    }

	
    // get and sett
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEsPremiun() {
		return esPremiun;
	}

	public void setEsPremiun(boolean esPremiun) {
		this.esPremiun = esPremiun;
	}

	public boolean isUsuarioBloqueado() {
		return usuarioBloqueado;
	}

	public void setUsuarioBloqueado(boolean usuarioBloqueado) {
		this.usuarioBloqueado = usuarioBloqueado;
	}

	//toString 
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", password=" + password + ", correo=" + correo + ", rut=" + rut
				+ ", direccion=" + direccion + ", genero=" + genero + ", edad=" + edad + ", id=" + id + ", esPremiun="
				+ esPremiun + ", usuarioBloqueado=" + usuarioBloqueado + "]";
	}
 
	//usuario prueba = nombre: usuarioPrueba password: test123 
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

}







