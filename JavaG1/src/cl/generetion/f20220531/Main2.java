package cl.generetion.f20220531;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// instancia de cliente
		Cliente cliente = new Cliente();
		cliente.setId(1234);
		cliente.setNombre("Donato");
		cliente.setRut("123456789-0");

		// excepciones
		Cliente clienteDatosDinamicos = new Cliente();

		System.out.println("Ingrese el id de Cliente");
		///Integer id2 = sc.nextInt();
		String idString = sc.nextLine();

		try {
			Integer id = null;//Integer.parseInt(idString);
			clienteDatosDinamicos.setId(id+1);
			sc.nextLine();

			System.out.println("Ingrese el nombre de Cliente");
			String nombre = sc.nextLine();
			clienteDatosDinamicos.setNombre(nombre);

			// rut
			System.out.println("Ingrese el rut de Cliente");
			String rut = sc.nextLine();
			clienteDatosDinamicos.setRut(rut);
			// correo
			System.out.println("Ingrese el correo de Cliente");
			String correo = sc.nextLine();
			clienteDatosDinamicos.setCorreo(correo);
		//ArithmetcExpecption 
			Integer division = 100/0;
			System.out.println(division);
			
		}catch(ArithmeticException ae) {
			System.out.println("Error al dividir por cero");	
		} catch(NullPointerException npe) {
			System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
		} catch (InputMismatchException ime) {
			System.out.println("Error en el ingreso de un dato");
		} catch (NumberFormatException nfe) {
			System.out.println("No puede ingresar un letra como identificador " + nfe);
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error, contecte al administrador " + e);
		}

		// arreglo de clientes

	}

}

