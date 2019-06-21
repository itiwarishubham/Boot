package com.amiti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@GetMapping(value = "/")
	String test(){
		return "test";
	}
}
