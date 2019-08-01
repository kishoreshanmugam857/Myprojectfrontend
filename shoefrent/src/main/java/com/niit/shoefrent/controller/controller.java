package com.niit.shoefrent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	@RequestMapping(value = { "/", "/home" })
	String dispage(Model m) {
		m.addAttribute("indexpage", true);
		return "index";
	}

	@RequestMapping(value = { "/register" })
	String registerpage(Model m) {
		m.addAttribute("registerpage", true);
		return "index";
	}

	@RequestMapping(value = { "/login" })
	String login(Model m) {
		m.addAttribute("login", true);
		return "index";
	}

	@RequestMapping(value = { "/aboutus" })
	String aboutus(Model m) {
		m.addAttribute("aboutus", true);
		return "index";
	}

	@RequestMapping(value = { "/contactus" })
	String contactus(Model m) {
		m.addAttribute("contactus", true);
		return "index";
	}
	@RequestMapping(value = { "/category" })
	String category(Model m) {
		m.addAttribute("category",new com.niit.ecombackend.model.category());
		m.addAttribute("category", true);
		return "index";
}}
