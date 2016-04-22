package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caveofprogramming.spring.camera.accessories.Lens;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/spring/aop/beans.xml");

		Camera camera = (Camera) context.getBean("camera");
		// Lens lens = (Lens) context.getBean("lens");
		try {
			
			camera.snap();
			
		} catch (Exception ex) {
			
			System.out.println("Caught Exception: "+ ex.getMessage());
		}
		context.close();
	}

}
