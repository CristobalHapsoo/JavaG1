package cl.generetion.f20220526;

public class FuncionesCalculadora {

	public static void main(String[] args) {
		
		//Math
		
		//elevar o potencia
		double numeroElevado = Math.pow(4, 2);
		System.out.println(numeroElevado);
		
		//redondear al entero mayor
		double enteroMayor = Math.ceil(numeroElevado);
		System.out.println(enteroMayor);
		
		//redondear al entero menor
		double enteroMenor = Math.floor(numeroElevado);
		System.out.println(enteroMenor);
		
		//redondeo
		double enteroRedondeado = Math.round(numeroElevado);
		System.out.println(enteroRedondeado);
		
		double num1 = 12;
		double num2 = 5;
		double div  = num1/num2;
		System.out.println(div);
		
		
		//numero aleatorios desde el 0.0 al 1.0
		double aleatorio = Math.random();
		System.out.println(aleatorio);
		
		//numeros aleatorios entre o y 10
		double num010 = Math.random() * 10;
		System.out.println(num010);
		
		//numero aleatios entre 2 y 8
		double num28 = (Math.random() * (8-2)) + 2;
		System.out.println(Math.abs(num28));
		System.out.println(Math.round(num28));
		System.out.println(Math.floor(num28));
		//numero aleatios entre -4 y 4
		double numNegPos = (Math.random() * (4 - -2)) + -4;
		System.out.println(numNegPos);
	}
	

}
