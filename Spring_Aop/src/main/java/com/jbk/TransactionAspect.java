package com.jbk;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionAspect {
//
//	@Before("execution (* com.jbk.BankTranscation.*(..))")
//	public void BeforeRecharge() {
//		System.out.println("Check Your Balances ");
//	}

	@After("execution (* com.jbk.BankTranscation.*(..))")
	public void afterRecharge() {
		System.out.println("Transaction completed successfully");
	}

//	@Around("execution (* com.jbk.BankTranscation.*(..))")
//	public void aroundTranscation(ProceedingJoinPoint p) {
//
//		System.out.println("Check your Balances");
//		try {
//			p.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println("Transaction completed successfully");
//	}

	
}
