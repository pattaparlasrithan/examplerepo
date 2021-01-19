package com.example.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeGreetController {
	@RequestMapping("/welcome")
	public ModelAndView getWelcome() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Most Welcome Raju Pattaparla");
		mav.setViewName("index");
		return mav;
	}
	@RequestMapping("/greeting")
	public ModelAndView getGreet() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Greet-Congratulations...!");
		mav.setViewName("index");
		return mav;
	}

}
