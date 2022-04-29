package org.example.demo;

import org.example.demo.model.Coach;
import org.example.demo.model.Person;
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
    	Person thePerson=context.getBean("person",Person.class);
    	Person secondPerson=context.getBean("person",Person.class);
    	System.out.println(thePerson);
    	System.out.println(secondPerson);
    	System.out.println(thePerson==secondPerson);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
