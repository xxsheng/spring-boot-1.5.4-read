package org.springboot.framework.service.impl;

import org.springboot.framework.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
	@Override
	public String sayHello() {
		return "hello!!";
	}
}
