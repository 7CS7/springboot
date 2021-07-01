package com.cs.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cs.springaop.dao.Account;
import com.cs.springaop.dao.AccountDao;
import com.cs.springaop.dao.MembershipDao;
import com.cs.springaop.demo.DemoConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDao dao=con.getBean("accountDao",AccountDao.class);
        MembershipDao mdao=con.getBean("membershipDao",MembershipDao.class);
        Account a=new Account();
        //dao.addAccount(a);
        dao.addAccount(a, true);
        mdao.addAccount();
        mdao.addAnything();
        con.close();
    }
}
