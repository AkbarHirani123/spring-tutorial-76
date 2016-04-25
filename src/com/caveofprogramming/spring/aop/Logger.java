package com.caveofprogramming.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

//	@Pointcut("target(com.caveofprogramming.spring.aop.Camera)")
//	public void somePointCut() {
//	}
//
//	@Before("somePointCut()")
//	public void withinDemoAdvice(JoinPoint jp) {
//		System.out.println("...Before Advice...");
//		
//		for(Object obj: jp.getArgs()) {
//			System.out.println("ARG: "+obj);
//		}
//	}
	
	@Pointcut("args(exposure, aperture)")
	public void somePointCut(int exposure, double aperture) {
	}

	@Before("somePointCut(exposure, aperture)")
	public void withinDemoAdvice(int exposure, double aperture) {
		System.out.println("...Before Advice...");
		
		System.out.printf("exposure %d, aperture %.2f\n", exposure, aperture);
	}
	
}
