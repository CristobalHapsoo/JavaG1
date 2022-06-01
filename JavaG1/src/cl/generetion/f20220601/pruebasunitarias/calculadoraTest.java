package cl.generetion.f20220601.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTest {

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		int resultado =  calc.suma(12, 42);
	
		
		//assertEquals(valorEsperado, Resultado);
		assertEquals(54, resultado);
	}

	
	@Test
	public void test2() {
		Calculadora calcr = new Calculadora();
		int resultado =  calcr.resta(12, 42);
	
		
		//assertEquals(valorEsperado, Resultado);
		assertEquals(-30, resultado);
	}
	
	@Test
	public void test3() {
		Calculadora calcrm = new Calculadora();
		int resultado =  calcrm.multiplicacion(12, 42);
	
		
		//assertEquals(valorEsperado, Resultado);
		assertEquals(504, resultado);
	}
	
	@Test
	public void test4() {
		Calculadora calcrmd = new Calculadora();
		String resultado =  calcrmd.division(12, 42);
	
		
		//assertEquals(valorEsperado, Resultado);
		assertNotNull(resultado);
	}
	@Test
	public void test5() {
		Calculadora calcrmd = new Calculadora();
		String resultado =  calcrmd.division(12, 42);
	
	}	
	
@Test
	
	void testEsPar() {
	    Calculadora calc = new Calculadora();
		boolean resultado = calc.esPar(4);
		assertTrue(resultado); // Validar que resultado sea true
		assertNotNull(resultado); //Validar que resultado no sea Null
		assertNotSame(false, resultado); //Validar que argumentos sean distintos
		
	}
	
	
	@Test
	void testEsImpar() {
		Calculadora calc = new Calculadora();
		boolean resultado = calc.esImpar(6); 
		assertFalse(resultado); //Validar que resultado sea Falso
	}
	
	
}
