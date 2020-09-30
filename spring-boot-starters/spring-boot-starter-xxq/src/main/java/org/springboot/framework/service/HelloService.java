package org.springboot.framework.service;

import org.springframework.context.annotation.Bean;

public interface HelloService {
	public String sayHello();

	// 验证可以注入
	@Bean
	default public Object get() {
		return new Object();
	}
}
