package cl.generetion.f20220601.modelos;

public class Perro extends Mascota  {
           //Atributo
	// extends significa que estamos usando herencia
	private Integer cantPaseos;
	private float tamanioHocico;
	private String sonidoVocal;

	
	// C. Vacio 
	public Perro() {
		super();
		
	// Get and Set	
	}

	public Integer getCantPaseos() {
		return cantPaseos;
	}

	public void setCantPaseos(Integer cantPaseos) {
		this.cantPaseos = cantPaseos;
	}

	public float getTamanioHocico() {
		return tamanioHocico;
	}

	public void setTamanioHocico(float tamanioHocico) {
		this.tamanioHocico = tamanioHocico;
	}

	public String getSonidoVocal() {
		return sonidoVocal;
	}

	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}
	//ToString
	@Override //Sobre escribir 
	//super.toString se suman todos los otros atributos de la clase superior
	public String toString() {
		return "Perro [cantPaseos=" + cantPaseos + ", tamanioHocico=" + tamanioHocico + ", sonidoVocal=" + sonidoVocal
				+ super.toString() + "]";
	}
	
	public void hacerSonido() {
		System.out.println("Guau, Guau");

	}
}
