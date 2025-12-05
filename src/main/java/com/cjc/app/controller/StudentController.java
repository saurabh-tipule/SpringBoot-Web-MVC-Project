package com.cjc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.app.model.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/")
	public String landingPage() {
		System.out.println("Inside Landing page..!");
		return "index";
	}

	@RequestMapping(value = "/log")
	public String handleLogRequest() {
		System.out.println("Inside Log Page Request..!");
		return "login";
	}

	@RequestMapping(value = "/login")
	public String handleLoginRequest(@RequestParam String username, @RequestParam String password) {
		System.out.println("USERNAME :" + username);
		System.out.println("PASSWORD :" + password);
		return "success";
	}

	@RequestMapping(value = "/reg")
	public String handleRegRequest() {
		System.out.println("inside register Page reuqest..!");
		return "register";
	}

	@RequestMapping(value = "/register")
	public String handleRegisterRequest(@ModelAttribute Student student) {
		System.out.println(student);
		return "index";
	}

}
