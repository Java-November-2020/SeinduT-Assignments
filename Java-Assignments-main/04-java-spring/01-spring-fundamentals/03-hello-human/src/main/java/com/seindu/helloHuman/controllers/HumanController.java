package com.seindu.helloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value="/", method=RequestMethod.GET)
public class HumanController {
	
	@RequestMapping (value="/", method=RequestMethod.GET)
	public String hello() {
		return "index.jsp";
		}
	
	@RequestMapping (value="/{name}", method=RequestMethod.GET)
	public String human(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name);
		return "name.jsp"; 
	}
	
}