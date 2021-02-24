package com.tts.firstProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/index")
	public String home() {
		return "index.html";
	}

	@GetMapping("/about")
	public String about() {
		return "about.html";
	}
	@GetMapping("/perche")
	public String why() {
		return "perche.html";
	}
}

