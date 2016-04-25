package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements ICar {

	@Override
	public void start() {
		System.out.println("Car is now starting.\n");
	}
}
