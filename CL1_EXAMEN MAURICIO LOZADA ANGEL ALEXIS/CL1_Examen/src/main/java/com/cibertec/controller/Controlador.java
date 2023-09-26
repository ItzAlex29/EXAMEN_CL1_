package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.interfacesService.IempleadoService;
import com.cibertec.model.Empleado;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IempleadoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empleado>empleados=service.listar();
		model.addAllAttributes(empleados);
		return "index";
	}
}
