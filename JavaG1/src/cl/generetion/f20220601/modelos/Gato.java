package cl.generetion.f20220601.modelos;

public class Gato extends Mascota {
          //Atributo
	// extends significa que estamos usando herencia
	private boolean garrasRetractil; 
	private boolean visionNocturna; 
	private String sonidoVocal;
	
	
	public Gato() {
		super();
	}
	
	
	
	public boolean isGarrasRetractil() {
		return garrasRetractil;
	}
	public void setGarrasRetractil(boolean garrasRetractil) {
		this.garrasRetractil = garrasRetractil;
	}
	public boolean isVisionNocturna() {
		return visionNocturna;
	}
	public void setVisionNocturna(boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}
	public String getSonidoVocal() {
		return sonidoVocal;
	}
	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}

   
	//toString
	@Override
	//super.toString se suman todos los otros atributos de la clase superior.
	//sobre escribir
	public String toString() {
		return "Gato [garrasRetractil=" + garrasRetractil + ", visionNocturna=" + visionNocturna + ", sonidoVocal="
				+ sonidoVocal +  super.toString() + " ]";
	}
	
	public void hacerSonido() {
		System.out.println("Miau, miau");
	}
}
