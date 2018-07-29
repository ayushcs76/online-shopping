package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home")
	public ModelAndView home() {
		
		System.out.println("home log");
	
		ModelAndView mv=new ModelAndView();
		mv.addObject("greeting","welcome");
		mv.setViewName("home");
		return mv;
	}

}
