package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class IndexController {
     //http://localhost:8000/  
	// anotacion para capturar las rutas
	@RequestMapping("/")
	public String index() {
      return "Hola mundo G1";
	}
	
	@RequestMapping("/usuario")
	public String usuario() {
      return "pagina usuario";
	}
	
	@RequestMapping("/usuario/inscrito")
	public String inscrito() {
      return "estamos en la pagina de usuario/inscrito";
	}
	
	@RequestMapping("/cliente/registrado")
	public String cliente() {
      return "Ruta de cliente";
	}
	
	@RequestMapping(value = "/registrado/proovedor", method= RequestMethod.GET)
	public String proovedor() {
      return "Ruta de proovedor";
	}
	


	 // http://localhost:8000/usuario
	//  @RequestMapping("/usuario")
}
