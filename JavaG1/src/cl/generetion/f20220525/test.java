package cl.generetion.f20220525;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 2;
		int num2 = 4;
		int num3 = 6;
		int num4 = 8;
		int num5 = 10;
		int num6 = 12;
		int num7 = 14;
		int num8 = 16;
		int num9 = 18;
		int num10 = 20;

		int oddsAddition = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		System.out.println("La suma de los primeros 10 números impares es:" + oddsAddition);
// agregar los 20 numeros impares primero. 

	}

	public static boolean isOdd(int numero) {
		return numero % 2 == 0;
	}
}
