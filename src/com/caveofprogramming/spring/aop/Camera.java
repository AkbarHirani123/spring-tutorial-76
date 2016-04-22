package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	public void snap() throws Exception{
		System.out.println("Snap!");
		
		throw new Exception("Bye bye");
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
