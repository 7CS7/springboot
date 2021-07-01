package com.cs.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
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
	@Pointcut("execution(* com.cs.springaop.dao.*.*(..)))")
	private void forDaoPackage() {
		
	}
	
	@Pointcut("execution(* com.cs.springaop.dao.*.get*(..))")
	private void setter() {}
	@Pointcut("execution(* com.cs.springaop.dao.*.set*(..))")
	private void getter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void noGetterSetter() {}
	
	@Before("forDaoPackage()")
	public void beforeAddAccount() {
		System.out.println(">>>>executing @before");
	}
	@Before("noGetterSetter()")
	public void performApiAnalytics() {
		System.out.println(">>>>performing API Analytics");
	}
	
	
}
