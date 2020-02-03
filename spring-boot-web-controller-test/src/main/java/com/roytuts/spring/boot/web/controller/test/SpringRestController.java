package com.roytuts.spring.boot.web.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

	@ResponseBody
	@GetMapping("/greet")
	public String greeting() {
		return "Hello World!";
	}

}
