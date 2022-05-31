package cl.generetion.f20220531;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cl.generetion.f20220530.Alumno;
import cl.generetion.f20220531.manager.ClienteManager;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cliente> listaCliente = new ArrayList<>();
		
	
		
		// crear una instacia de cliente 
		//Estamos llamando a un constructor vacio por defaulf
        Cliente cliente = new Cliente();
        cliente.setId(1234);
        cliente.setNombre("Anton");
        cliente.setRut("123456789-0");
        int opcion = 0;
        
        
       do { 
        //excepciones 
        //error comun: NullPointerExceptionno se puede sumar con un null
        Cliente clienteDatosDinamicos = new Cliente();
        
        //id
        System.out.println("ingree el id de cliente");
        Integer id = sc.nextInt();
        clienteDatosDinamicos.setId(id);
        sc.nextLine();
        
     
        
        //nombre
        System.out.println("ingree el nombre de cliente");
        String nombre = sc.nextLine();
        clienteDatosDinamicos.setNombre(nombre);
        
        //rut
        System.out.println("ingree el rut de cliente");
        String rut = sc.nextLine();
        clienteDatosDinamicos.setRut(rut);
        
        //correo
        System.out.println("ingree el correo de cliente");
        String correo = sc.nextLine();
        clienteDatosDinamicos.setNombre(correo);
        
        System.out.println("Desea ingresar un nuevo cliente (1) si (0) no");
        opcion = sc.nextInt();
        sc.nextLine();
  
       }while(opcion == 1);  
        
       //acceder al metodo de otra clase 
       //creando una instacia 
       ClienteManager cm = new ClienteManager();
       cm.recorrerArregloCliente(listaCliente);
       
	}

}
