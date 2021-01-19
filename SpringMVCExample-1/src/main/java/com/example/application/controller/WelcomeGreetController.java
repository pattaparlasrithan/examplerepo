package com.example.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeGreetController {
	@RequestMapping("/welcome")
	public ModelAndView getWelcome() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome Raju Pattaparla");
		mav.setViewName("index");
		return mav;
	}

}
