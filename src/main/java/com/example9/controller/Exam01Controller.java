package com.example9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {

	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/input")
	public String inPut(String name) {
		
		return "exam01-result";
	}
}
