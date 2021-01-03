package com.seindu.Counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	private int getSessionCount(HttpSession sess) {
		Object sessVal = sess.getAttribute("count");
		if(sessVal == null) {
			setSessionCount(sess, 0);
			sessVal = sess.getAttribute("count");
		}
		return (Integer)sessVal;
	}
	private void setSessionCount(HttpSession sess, int val) {
		sess.setAttribute("count", val);
	}
	@RequestMapping("/")
	public String Index(HttpSession sess) {
		int currCount = getSessionCount(sess);
		setSessionCount(sess, ++currCount);
		return "index.jsp";
	}
	@RequestMapping("/reset")
	public String Reset(HttpSession sess) {
		sess.setAttribute("count", 0);
		return "redirect:/counter";
	}
	@RequestMapping("/counter")
	public String Counter(HttpSession s, Model model) {
		model.addAttribute("count", getSessionCount(s));
		return "count.jsp";
		
	}
}