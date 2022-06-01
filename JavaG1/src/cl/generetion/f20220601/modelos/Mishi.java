package cl.generetion.f20220601.modelos;

public class Mishi extends Gato {

	private Boolean  famosoEnInternet;


	
	//C. Vacio 
	public Mishi() {
		super();
	}
	
	
	//get and set 
	public Boolean getFamosoEnInternet() {
		return famosoEnInternet;
	}

	public void setFamosoEnInternet(Boolean famosoEnInternet) {
		this.famosoEnInternet = famosoEnInternet;
	}

	//tostring
	@Override
	public String toString() {
		return "Mishi [famosoEnInternet=" + famosoEnInternet + super.toString()+ "]";
		
	}
	
	//tostring

}


