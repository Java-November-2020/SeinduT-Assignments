package com.seindu.dojoSurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping ("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping (path= "/results", method=RequestMethod.POST)
	public String survey(@RequestParam(value="name") String name, @RequestParam(value="dojoLocation") String dojoLocation, @RequestParam(value="favoriteLanguage") String favoriteLanguage, @RequestParam(value="comment") String comment, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("dojoLocation", dojoLocation);
		model.addAttribute("favoriteLanguage", favoriteLanguage);
		model.addAttribute("comment", comment);
		return "results.jsp";
	}
}
