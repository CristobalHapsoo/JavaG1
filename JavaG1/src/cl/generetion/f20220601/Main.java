package cl.generetion.f20220601;

import java.util.ArrayList;
import java.util.List;

import cl.generetion.f20220601.modelos.Gato;
import cl.generetion.f20220601.modelos.Mascota;
import cl.generetion.f20220601.modelos.Mishi;
import cl.generetion.f20220601.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		//Herencia 
Mascota mascota = new Mascota();
mascota.setColor("Azul");
mascota.setNombre("Domingo");



//Crear una instacia
Perro perro = new Perro ();
perro.setColor("Blue");
perro.setNombre("Ayun");
System.out.println(perro.toString());


Gato gato = new Gato ();
gato.setEspecie("Felino");
gato.setPelaje("Pelo");
gato.setPeso(3);
System.out.println(gato.toString());


Mishi mishi = new Mishi();
System.out.println(mishi.toString());

//Polimorfismo //Se adapta 
//creando una instacia de mascota 
//Resignando los atributos // Agregando a traves del constructor 

// Sobrecarga de metodo 
List<Mascota> listaMascotas = new ArrayList<Mascota>();
Mascota regalon = new Mascota ();
listaMascotas.add(regalon);

Mascota felix = new Gato();
felix.setNombre("Felix");
felix.setColor("Negro");
felix.setPeso(3);
listaMascotas.add(felix);

Mascota chocolo = new Perro();
chocolo.setNombre("Chocolo");
chocolo.setColor("Cafe");
chocolo.setPeso(10);
listaMascotas.add(chocolo);
regalon.hacerSonido(); // llamando al metodo  en mascota
felix.hacerSonido();
chocolo.hacerSonido();


Perro perroChocolo = (Perro) chocolo;
perroChocolo.setCantPaseos(6);



System.out.println("******");
//recorrer el arreglo
for (Mascota mascota2 : listaMascotas) {
	mascota2.hacerSonido();
}
	}

}
