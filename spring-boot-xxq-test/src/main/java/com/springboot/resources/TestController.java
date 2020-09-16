package com.springboot.resources;

import org.springboot.framework.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	HelloService helloService;

	@RequestMapping("/")
	String home() {
		return helloService.sayHello();
	}
}
