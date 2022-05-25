package cl.generetion.f20220523;

public class CalculoPromedio {

	public static void main(String[] args) {
		//int cantidadNotas = 12;
		//arreglo notas
		Integer[] notas = {20,50,67,99,-10,0,88,707,58,79,33,50};
		
		//variables acumuladoras
		int sumaNotas = 0;//20
		int notasFuerasDeRango = 0;
		
		
		
		//como recorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {//i=0
			//validar la nota, negativas o mayor a 100.
		if(notas[i] < 0 || notas[i] > 100)	{
			System.out.println("la nota:" +notas[i] + " en la posición "+ (i+1) + " esta fuera de rango"  );
			notasFuerasDeRango++;
		}
							
			sumaNotas = sumaNotas + notas[i];
		}
		//System.out.println("suma de notas: " + sumaNotas);
		if(notasFuerasDeRango == 0) {//no hay notas fueras de rango
			
		}
		
		//promedio-> suma todas las notas / cantidad de notas;
		float promedio = sumaNotas / notas.length;
		/* TODO validar el orden >= */
		//101
		
		//PUNTO CRITICO
		//0>repobrado<50; 50>=Aprobado<=100;
		if(promedio >= 50 && promedio <= 100) {
			System.out.println("¡Felicitaciones!, Aprobado");
			System.out.println("El promedio es: " + promedio);
		}else if(promedio >= 0 && promedio < 50) {
			System.out.println("Alumno repobrado");
			System.out.println("El promedio es: " + promedio);
		}else {
			System.out.println("Error en la suma de las notas");
		}
		// 49  49.9999999999999999999999  50 {
    	
	
	    }
} 
