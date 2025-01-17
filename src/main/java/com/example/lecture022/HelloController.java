package com.example.lecture022;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("hello-word")
	public String helloWorld() {
		return "Hello Word";
	}
}
