package com.cjc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.app.model.Student;

@Controller
public class StudentController {

	String s = "ABC";

	int a = 10;

	public boolean findEvenoddNumber(int num) {
		return (num % 2 == 0) ? true : false;
	}

	// Task : WAP to find out Prime Number In java?

	public boolean findPrimeNumber(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
			if (count == 0) {
				return true;
			}
		}
		return false;
	}

	public String findNumber(int num) {
		return (num > 0) ? "Positive Number" : "Negative Number";
	}

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
