package org.springboot.framework.config;


import com.springboot.TestClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("org.springboot.framework.service")
@Import(TestClass.class)
public class HelloServiceAutoConfiguration {

}
