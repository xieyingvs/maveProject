package com.org.cbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TmsController {
	@RequestMapping(value = "/tms", method = RequestMethod.GET)
	public String add(Model mm) {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		mm.addAttribute("tms", "Hello World!");
		return "tms";
	}

}
