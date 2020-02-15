package com.hibernateapp.main;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@GetMapping("/")
	public String index(Model model) throws ParseException {
		model.addAttribute("msg", getMessage());
		return "index";
	}

	private String getMessage() {
		return "Hello World";
	}

}