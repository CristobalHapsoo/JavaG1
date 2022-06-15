package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ParametrosRestController {
	
	
	@RequestMapping("/api")
	//localhost:8080/api?fecha=20220613
	public String fecha (@RequestParam(value="fecha") String fecha)  {
       //?q=informacion 
		return "la fecha es: " + fecha;
	}

	@RequestMapping("/api/seccion")
	//localhost:8080/api?fecha=20220613
	public String  seccion (@RequestParam(value="modulo") String modulo,
			@RequestParam(value="seccion") String seccion)  {
       //?q=informacion 
		return "el modulo es: " + modulo + "La seccion es: " + seccion; 
	}
	
	
}