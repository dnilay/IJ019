package org.example.demo;

import org.example.demo.model.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Coach myCoach=context.getBean("theCoach",Coach.class);
    	System.out.println(myCoach.getDailyWorkout());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
