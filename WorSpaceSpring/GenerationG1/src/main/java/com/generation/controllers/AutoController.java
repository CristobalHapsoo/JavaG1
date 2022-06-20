package com.generation.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Auto;

import com.generation.services.AutoService;

@Controller
@RequestMapping("/auto")
public class AutoController {
	//inyeccion de dependecia 
		@Autowired
		AutoService autoService;
		
	@RequestMapping("")
	public String inicio(@ModelAttribute("auto") Auto auto){
	      return "auto.jsp";
		}
	
	@PostMapping("/guardar")
	public String guardarAuto(@Valid@ModelAttribute("auto") Auto auto, 
			BindingResult resultado, Model model){
		if(resultado.hasErrors())  {
			model.addAttribute("msgError", "Debes ingesar los datos correctos");
			return "auto.jsp";
		} else { 
			autoService.guardarAuto(auto);
			List<Auto> listaAutos = autoService.findAll();
			model.addAttribute("autosCapturados", listaAutos);
			return "disenoTablas.jsp";
			  
		}
		
		
	}
	//solo mostrar el listado de autos
		@RequestMapping("/mostrar")
		public String mostrar(Model model) {
			//obtener una lista de autos
			List<Auto> listaAutos = autoService.findAll();
			//pasamos la lista de autos al jsp
			model.addAttribute("autosCapturados", listaAutos);
			return "disenoTablas.jsp";
		}
		
		@RequestMapping("/editar/{id}") //editar para el despliegue 
		public String editar(@PathVariable("id") Long id,
				Model model) {
			System.out.println("el id es: "+id);
			
			Auto auto = autoService.buscarId(id);
			model.addAttribute("auto", auto);//pasar al jsp
			
			return "editarAuto.jsp";//redireccionar a otra url o path
		} 
		
		//localhost:8080/auto/actualizar/{id} -> //actualizar para la persistencia en la bd
		
		@PostMapping("/actualizar/{id}")
		public String actualizarAuto(@PathVariable("id") Long id,@Valid @ModelAttribute("auto") Auto auto,
				BindingResult resultado,
				Model model) {
			System.out.println("el id al actualizar es: "+id +" getId "+auto.getId());
			

			if(resultado.hasErrors()) {
				model.addAttribute("msgError","Datos erroneos");
				return "editarAuto.jsp";
			}else {
				auto.setId(id); //-> agregar el id al objeto
				
				//enviamos el obeto a persistir en base datos
				autoService.guardarAuto(auto);
				//obtener una lista de autos
				//List<Auto> listaAutos = autoService.findAll();
				//pasamos la lista de autos al jsp
				//model.addAttribute("autosCapturados", listaAutos);
				return "redirect:/auto/mostrar";
			}
		}

		
		
		
		
		@RequestMapping("/eliminar/{id}")
		public String eliminarAuto (@PathVariable("id")long id) {
		
		autoService.eliminarPorId(id);
	
		return "redirect:/auto/mostrar";
		
		
		}	
	}

		
// clase 202200616
	
	//capturamos el objeto con los atributos llenos.
		//System.out.println(auto.getMarca() + " " +  auto.getModelo() + " " +  auto.getAnio() + " " + auto.getVelocidad());
		
		//enviar el objeto al service 
		//autoService.saveAuto(auto);
		
		//return "index.jsp"; //la pagina a desplegar 
	

