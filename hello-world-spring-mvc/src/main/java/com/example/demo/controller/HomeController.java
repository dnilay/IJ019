package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping
	public String sayHello() {
		return "index";
	}

	@GetMapping("/showForm")
	public String showForm() {
		return "showFormForStudent";
	}

	@PostMapping("/processForm")
	public String processForm(HttpServletRequest request, Model theModel) {

		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		theModel.addAttribute("fName",firstName);
		theModel.addAttribute("lName",lastName);
		theModel.addAttribute("em",email);
		return "success";
	}
}
