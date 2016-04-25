package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")
//@Deprecated
public class Camera implements PhotoSnapper, ICamera{

	public Camera() {
		System.out.println("Camera constructor ran here.");
	}
	
	@Override
	@Deprecated
	public void snap(){
		System.out.println("Snap!\n");
	}
	
	@Override
	public void snap(int exposure) {
		System.out.println("Snap! exposure: " + exposure +"\n");
	}
	
	@Override
	public void snap(double exposure) {
		System.out.println("Snap! double exposure: " + exposure +"\n");
	}

	@Override
	public void snap(int i, double d) {
		System.out.println("Snap! int: " + i +"double: "+d +"\n");
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
	
	public void snapCar(Car car){
		System.out.println("Snapping CAR!\n");
	}
}
