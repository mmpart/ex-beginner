package com.example9.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	

	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/result")
	public String result(Integer money1, Integer money2, Integer money3) {
		int sum = money1+money2+money3;
		double taxinc = sum*1.1;
		
		application.setAttribute("sum", sum);
		application.setAttribute("taxinc", taxinc);
		
		return "exam03-result";
	}
}
