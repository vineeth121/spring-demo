package com.infy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	public A() {
		System.out.println("Inside A()");
	}

	@Autowired
	private B b1;

	public B getB1() {
		return b1;
	}

	public void setB1(B b) {
		this.b1 = b;
	}

}
