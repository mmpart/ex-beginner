package com.example9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@RequestMapping("")
	public String indx() {
		return "exam02";
	}
	
	@RequestMapping("/result")
	public String result(Model model,String num1,String num2) {
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		
		String answer = num1+num2;
		model.addAttribute("answer", answer);
		
		return "exam02-result";
	}
	
	@RequestMapping("/result2")
	public String result2() {
		return "exam02-result2";
	}
}
