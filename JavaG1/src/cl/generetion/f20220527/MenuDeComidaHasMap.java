package cl.generetion.f20220527;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuDeComidaHasMap {

	public static void main(String[] args) {
			// Agregar valores a un hashmap desde un ArrayList generado por input (ingreso
				// de usuario)
				HashMap objetoHashMap = new HashMap();
				Scanner sc = new Scanner(System.in);
				System.out.println(objetoHashMap.values());
				// Creamos ArrayList
				ArrayList<String> pedido = new ArrayList<String>();
				ArrayList<String> comidas = new ArrayList<String>();
				comidas.add("Fideos");
				comidas.add("Lentejas");
				comidas.add("Poroto");
				comidas.add("arroz con pollo");
				comidas.add("Fideos con pasta");
				ArrayList<String> Postre = new ArrayList<String>();
				Postre.add("Torta de chocalate");
				Postre.add("Pie de lImon");
				boolean seguir = true;
				while (seguir) {
					System.out.println("Menu");
					System.out.println("1).Fideos");
					System.out.println("2).Lentejas ");
					System.out.println("3).Poroto ");
					System.out.println("4).Arroz ");
					System.out.println("Ingrese la opcion que desea agregar:");
					String seleccion = sc.next();
					pedido.add(seleccion);
					
					System.out.println("Desea agregar mas pedidos? 1)Si 2)No ");
					int respuesta = sc.nextInt();
					if (respuesta == 2) {
						System.out.println("saliendo del programa");
						break;
					}
				}
				objetoHashMap.put("pedidos", pedido);
				System.out.println(objetoHashMap.values());
	}

}
