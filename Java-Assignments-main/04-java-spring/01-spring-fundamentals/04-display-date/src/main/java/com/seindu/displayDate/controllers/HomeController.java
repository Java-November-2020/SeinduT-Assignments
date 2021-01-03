package com.seindu.displayDate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		Date date = new Date();
		model.addAttribute("now", date);
		return "index.jsp";
	}
	
	@RequestMapping ("/{dt}")
	public String dateTime(@PathVariable("dt") String dt, Model model) {
		if(!dt.equals("date") && !dt.equals("time"))
			return "redirect:/";
		SimpleDateFormat df = (dt.equals("date"))
				? new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY")
				: new SimpleDateFormat("h:mm a");
			model.addAttribute("dtFormat", df.format(new java.util.Date()));
			model.addAttribute("dt", dt);
			return "datetime.jsp";
	}
}
