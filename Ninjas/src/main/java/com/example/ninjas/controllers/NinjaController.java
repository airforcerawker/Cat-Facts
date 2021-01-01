package com.example.ninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ninjas.models.Ninja;
import com.example.ninjas.services.NinjaServices;
import com.example.ninjas.services.TechniqueService;

@Controller
public class NinjaController {
	
	private NinjaServices ninServ;
	private TechniqueService techServ;
	
	public NinjaController(NinjaServices ninServ) {
		this.ninServ = ninServ;
		this.techServ = techServ;
	}
	
	//this is the route to get to the home page.
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("ninjas", ninServ.getAll());
		model.addAttribute("newNinja", new Ninja());
		return "index.jsp";
	}
	
	//posting a new ninja to the database with validations.
	@RequestMapping(value="/ninjas", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("newNinja")Ninja newNinja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("ninjas", ninServ.getAll());
			return "index.jsp";
		} else {
			ninServ.create(newNinja);
			return "redirect:/";
		}
	}
	
	//this is how you edit a ninja.	
	@GetMapping("/ninjas/{id}")
	public String ninjaDetails(@PathVariable("id")Long id, Model model) {
		model.addAttribute("singleNinja", ninServ.getOne(id));
		return "ninja.jsp";
	}
	
	//this is how you update a ninja.
	@PostMapping("/ninjas/{id}/update")
	public String updateNinja(@PathVariable("id")Long id, @Valid @ModelAttribute("singleNinja")Ninja singleNinja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninja.jsp";
		} else {
			ninServ.update(singleNinja, id);
			return "redirect:/ninjas/" + id;
		}
	}
	@GetMapping("/ninjas/{id}/delete")
	public String removeNinja(@PathVariable("id")Long id) {
		ninServ.delete(id);
		return "redirect:/";
	}
	
	@GetMapping("/ninjas/{id}/show")
	public String show(@PathVariable("id")Long id, Model model) {
		model.addAttribute("singleNinja", ninServ.getOne(id));
		return "show.jsp";
	}
	
}
