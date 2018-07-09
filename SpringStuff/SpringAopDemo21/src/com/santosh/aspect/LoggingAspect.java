package com.santosh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	// Condition-1
//	 @Before("execution(public String getName())")
	// Condition-2
//	 @Before("execution(public String com.santosh.model.Circle.getName())")
	// Condition-3
//	 @Before("execution(public * get*())")
	// Condition-4
//	@Before("execution( * get*(..))")
	// Condition-5
	 @Before("allGetters() && allMethods())")
	public void loggingAdvice() {
		System.out.println("Advice run. Get method called");
	}

	 @Before(" allMethods())")
	 public void loggingAdvice(JoinPoint joinPoint) {
	 System.out.println(joinPoint.toString());
	 System.out.println(joinPoint.getTarget());
	 }
	//
//	@Before("execution( * get*())")
	 @Before("allGetters())")
	public void secondAdvice() {
		System.out.println("Second Advice executed.");
	}
	
	 @Pointcut("execution( * get*())")
	 public void allGetters() {
	 }
	 
	 @Pointcut("within( com.santosh.model.*)")
	 public void allMethods() {
	 }

//	// condition-1
//	// @Before("args(String)")
//	// condition-2
//	// @Before("args(name)")
//	// condition-3
	 @After("args(name)")
	// condition-4
	 @AfterReturning("args(name)")
	 public void stringArgMethod(String name) {
	 System.out.println("string arg method is called and the value is: "
	 + name);
	 }
	 
	 @AfterThrowing("args(name)")
	 public void afterThrowMethod(String name) {
	 System.out.println("An exception is thrown");
	 }
}
