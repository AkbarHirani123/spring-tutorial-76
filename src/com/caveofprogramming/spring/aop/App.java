package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/spring/aop/beans.xml");

		ICamera camera = (ICamera) context.getBean("camera");
		camera.snap();

		((IMachine)camera).isMachine();
		
		ICar car = (ICar) context.getBean("car");
		car.start();

		((IMachine)car).isMachine();
		
		context.close();
	}

}
