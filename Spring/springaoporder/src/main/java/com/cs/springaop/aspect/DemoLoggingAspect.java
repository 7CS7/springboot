package com.cs.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class DemoLoggingAspect {

	/*@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("Executing @Before");
	}*/
	/*@Before("execution(public void com.cs.springaop.dao.AccountDao.addAccount())")
	public void beforeAddAccount() {
		System.out.println("Executing @Before");
	}*/
	//@Before("execution(public void add*())")
	//@Before("execution(void add*())")
	//@Before("execution(* add*())")
	//@Before("execution(* add*(com.cs.springaop.dao.Account))")
	//@Before("execution(* add*(com.cs.springaop.dao.Account,..))")
	//@Before("execution(* add*(..))")
	
	
	@Before("com.cs.springaop.aspect.AopExpressions.forDaoPackage()")
	public void beforeAddAccount() {
		System.out.println(">>>>executing @before for demo");
	}
	
	
	
	
}
