package com.controller.test.springboothelloworldwithdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/docker/say/hi/{name}")
public class HelloWorldController {

	@GetMapping
	public String sayHello(@PathVariable String name) {
		String hello = new String("Hello " + name);
		return hello;
	}

}
