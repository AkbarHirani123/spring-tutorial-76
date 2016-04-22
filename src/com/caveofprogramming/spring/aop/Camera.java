package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	public void snap() {
		System.out.println("Snap! \n");
	}
	
	public void snap(int exposure) {
		System.out.println("Snap! exposure: " + exposure +"\n");
	}

	public String snap(String name) {
		System.out.println("Snap! Name: " + name+"\n");
		
		return name;
	}
	
	public void snapNightTime() {
		System.out.println("Snap! Night Mode." +"\n");
	}
}
