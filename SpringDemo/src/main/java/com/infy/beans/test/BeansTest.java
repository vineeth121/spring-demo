package com.infy.beans.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.beans.A;
import com.infy.beans.config.SpringDemoConfig;

public class BeansTest {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringDemoConfig.class);
		A a = context.getBean(A.class);
	}
}
