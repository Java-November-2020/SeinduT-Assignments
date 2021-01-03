package com.seindu.theCode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	
	@RequestMapping ("/")
	public String index(@ModelAttribute("errors") String errors, Model method) {
		method.addAttribute("errors", errors);
		return "index.jsp";
	}
	
	@RequestMapping (path= "/code", method=RequestMethod.POST)
	public String code(@RequestParam(value="guess") String guess, RedirectAttributes redirectAttributes) {
		if(guess.equals("bushido")) {
			return "code.jsp";
		}
		else {
			redirectAttributes.addFlashAttribute("errors", "Wrong code, You must train harder!");
			return "redirect:/";
		}
	}
}
