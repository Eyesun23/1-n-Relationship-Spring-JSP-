package com.aysun.ninja.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aysun.ninja.models.*;
import com.aysun.ninja.services.DojoService;
import com.aysun.ninja.services.NinjaService;


@Controller
//@RequestMapping("/")
public class Ninjas{
	
	private DojoService dojoService;
	private NinjaService ninjaService;
	
	public Ninjas(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}

	@GetMapping("/")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "New.jsp";
	}
	
	@PostMapping("dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo,BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "New.jsp";
		} else {
			dojoService.addDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	@GetMapping("ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.getAllDojos());
		return "Ninja.jsp";
	}
	
	@PostMapping("ninjas/new")
	public String createNinja(
			@RequestParam(value="dojo") Long id,
			@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos", dojoService.getAllDojos());
			return "Ninja.jsp";
		} else {
			ninjaService.addNinja(ninja);
			return "redirect:/dojos/" + id;
		}
	}
	
	@GetMapping("dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findDojoById(id);
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas", ninjaService.getNinjasAtDojo(dojo));
		return "index.jsp";
	}
}