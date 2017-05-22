package com.cloudstarter.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;


@RestController
public class TestController {
		
	
	@GetMapping("/test/")
	public String getCustomer() {

		return "hello world";
	}
	
	@GetMapping("/test/{id}")
	public String getCustomer(@PathVariable("id") Long id) {

		return "hello world-" + id;
	}
}
