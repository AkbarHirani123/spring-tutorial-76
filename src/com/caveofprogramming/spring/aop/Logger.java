package com.caveofprogramming.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.snap(..))")
	public void cameraSnap() {
	}

	@Before("cameraSnap()")
	public void beforeAdvice() {
		System.out.println("Before Advice...");
	}

//	@After("cameraSnap()")
//	public void afterAdvice() {
//		System.out.println("After Advice...");
//	}
//
//	@AfterReturning("cameraSnap()")
//	public void afterReturningAdvice() {
//		System.out.println("After Returning Advice...");
//	}
//
//	@AfterThrowing("cameraSnap()")
//	public void afterThrowingAdvice() {
//		System.out.println("After Throwing Advice...");
//	}
//
//	@Around("cameraSnap()")
//	public void aroundAdvice(ProceedingJoinPoint p) {
//		System.out.println("Around Advice (Before)...");
//		
//		// start to check the time it took here
//		try {
//			p.proceed();
//		} catch (Throwable e) {
//			System.out.println("In Around Advice: " + e.getMessage());
//		}
//		// end check the time it took here
//		 
//		System.out.println("Around Advice (After)...");
//	}
}
