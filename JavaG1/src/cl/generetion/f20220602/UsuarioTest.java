package cl.generetion.f20220602;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioTest {

	  @Test
		public void testLogin() {
			Usuario usuarioPrueba = new Usuario();
			boolean consulta = usuarioPrueba.login("usuarioPrueba","test123");
			assertEquals(true , consulta);
		}
	  
	  @Test
		public void testPregunta() {
			Cliente clientePrueba = new Cliente();
			String pregunta = clientePrueba.hacerPreguntas("esta es una pregunta de prueba");
			assertEquals("esta es una pregunta de prueba", pregunta);
		}
	  @Test
			public void testRespuesta() {
				Vendedor vendedorPrueba = new Vendedor();
				String respuesta = vendedorPrueba.responderPreguntas("esta es una respuesta de prueba");
				assertEquals("esta es una respuesta de prueba", respuesta);
			}
	
}
