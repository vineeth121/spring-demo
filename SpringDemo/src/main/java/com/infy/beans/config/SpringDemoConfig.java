package com.infy.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.infy.beans.B;

@Configuration
@ComponentScan(basePackages = "com.infy.beans")
public class SpringDemoConfig {

	@Bean
	public B b() {
		return new B();
	}
}
