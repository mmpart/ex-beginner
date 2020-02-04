package com.example9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {

	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/input")
	public String inPut() {
		return "exam04-result";
	}
}
