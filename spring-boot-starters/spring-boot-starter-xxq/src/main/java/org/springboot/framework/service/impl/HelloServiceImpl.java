package org.springboot.framework.service.impl;

import org.springboot.framework.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	@Value("${study.testStr}")
	private String test;

	@Override
	public String sayHello() {
		return "hello!!" + test;
	}
}
