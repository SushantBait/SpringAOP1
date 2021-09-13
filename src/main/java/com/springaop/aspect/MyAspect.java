package com.springaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.springaop.service.PaymentServiceImpl.makePayment())")
	public void printBefore(){
		System.out.println("Before Payment......");
	}
	
	@After("execution(* com.springaop.service.PaymentServiceImpl.makePayment())")
	public void printAfter(){
		System.out.println("Before Payment......");
	}
}
