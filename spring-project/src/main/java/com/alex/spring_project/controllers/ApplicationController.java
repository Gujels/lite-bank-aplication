package com.alex.spring_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/page")
public class ApplicationController {
	
	@GetMapping
	public String index() {
		return "Pages/main-page";
	}
}
