package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/testJenkins")
	public String testJenkins() {
		return "test jenkins";
	}
}
