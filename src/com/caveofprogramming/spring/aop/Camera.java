package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements PhotoSnapper, ICamera{

	public Camera() {
		System.out.println("Camera constructor ran here.");
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snap()
	 */
	@Override
	public void snap() throws Exception{
		System.out.println("Snap!");
		
		//throw new Exception("Bye bye");
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snap(int)
	 */
	@Override
	public void snap(int exposure) {
		System.out.println("Snap! exposure: " + exposure +"\n");
	}

	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snap(java.lang.String)
	 */
	@Override
	public String snap(String name) {
		System.out.println("Snap! Name: " + name+"\n");
		
		return name;
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.spring.aop.ICamera#snapNightTime()
	 */
	@Override
	public void snapNightTime() {
		System.out.println("Snap! Night Mode." +"\n");
	}
}
