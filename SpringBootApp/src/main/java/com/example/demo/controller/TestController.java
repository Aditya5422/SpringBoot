package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TestController {

	@RequestMapping("/foo")
	public String foo() {
		return  "Hello world";
	}
}
