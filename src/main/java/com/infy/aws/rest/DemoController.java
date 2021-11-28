package com.infy.aws.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo")
	public String success() {
		return "Hello World . New version D!!";
	}
}
