package org.springboot.framework.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.springboot.framework.service")
public class HelloServiceAutoConfiguration {

}
