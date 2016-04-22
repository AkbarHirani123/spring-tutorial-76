package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements PhotoSnapper, ICamera{

	public Camera() {
		System.out.println("Camera constructor ran here.");
	}
	
	@Override
	public void snap(){
		System.out.println("Snap!\n");
	}
	
	@Override
	public void snap(int exposure) {
		System.out.println("Snap! exposure: " + exposure +"\n");
	}

	@Override
	public String snap(String name) {
		System.out.println("Snap! Name: " + name+"\n");
		
		return name;
	}
	
	@Override
	public void snapNightTime() {
		System.out.println("Snap! Night Mode." +"\n");
	}
}
