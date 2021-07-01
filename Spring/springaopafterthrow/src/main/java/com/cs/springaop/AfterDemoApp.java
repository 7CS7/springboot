package com.cs.springaop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cs.springaop.dao.Account;
import com.cs.springaop.dao.AccountDao;
import com.cs.springaop.dao.MembershipDao;
import com.cs.springaop.demo.DemoConfig;

/**
 * Hello world!
 *
 */
public class AfterDemoApp 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDao dao=con.getBean("accountDao",AccountDao.class);
        MembershipDao mdao=con.getBean("membershipDao",MembershipDao.class);
       List<Account> acc=dao.findAccount();
        con.close();
        System.out.println("-----------");
        System.out.println(acc);
    }
}
