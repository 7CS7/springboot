package com.cs.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.cs.springaop.dao.Account;

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
	public void beforeAddAccount(JoinPoint theJoinPoint) {
		System.out.println(">>>>executing @before for demo");
		MethodSignature metSig=(MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method: "+metSig);
		Object[] args=theJoinPoint.getArgs();
		for(Object tempArgs:args) {
			System.out.println(tempArgs);
			if(tempArgs instanceof Account) {
				Account theAccount=(Account) tempArgs;
				System.out.println("account name: "+theAccount.getName());
				System.out.println("account level: "+theAccount.getLevel());
			}
		}
		
	}
	
	
	
	
}
