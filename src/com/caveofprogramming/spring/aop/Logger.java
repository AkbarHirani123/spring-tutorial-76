package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("args(int)")
	public void somePointCut() {
	}

	@Before("somePointCut()")
	public void withinDemoAdvice() {
		System.out.println("...Before Advice...");
	}
	
}
