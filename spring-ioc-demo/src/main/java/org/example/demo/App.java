package org.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ) throws Throwable
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer=applicationContext.getBean("customer",Customer.class);
        System.out.println(customer);
       
        Customer customer1=applicationContext.getBean("customer",Customer.class);
        System.out.println(customer==customer1);
        
    }

	
    
    
}
