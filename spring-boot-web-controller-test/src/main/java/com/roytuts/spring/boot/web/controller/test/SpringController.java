package com.roytuts.spring.boot.web.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

	@ResponseBody
	@GetMapping("/")
	public String greeting() {
		return "Hello World!";
	}

}
