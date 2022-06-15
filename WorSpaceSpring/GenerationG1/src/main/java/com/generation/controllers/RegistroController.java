package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.models.Usuario;

@Controller
@RequestMapping("/registro")
public class RegistroController {


	@RequestMapping("")
	public String registro(@ModelAttribute("usuario") Usuario usuario) {
      return "registro.jsp";
	}

	@PostMapping("/Usuario/respaldo")
	public String registroUsuario() {
      System.out.println("Estamos en el metodo de registro de usuario");
		return "registro.jsp";
	}

	@PostMapping("/Usuario")  // para conntrolar valid se usa BindingResult
    public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult resultado, Model model) {
		//capturando si existe un error en el ingreso de datosdesde el jsp
		if(resultado.hasErrors())  {
			model.addAttribute("msgError", "Debes ingesar los datos correctos");
			return "registro.jsp";
		}
		
		//capturamos el objeto con los atributos llenos.
		System.out.println(usuario.getNombre() + " " +  usuario.getApellido() + " " +  usuario.getEdad());
		return "index.jsp"; //la pagina a desplegar 
	   
			}
}





