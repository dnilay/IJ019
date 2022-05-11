package org.example.demo;

import java.util.UUID;

import org.example.demo.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   
    	   SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
    	   Session session=sessionFactory.openSession();
    	   Employee employee=new Employee(100, "John", "Doe", "john@email.com");
    	   session.getTransaction().begin();
    	   session.save(employee);
    	   session.getTransaction().commit();
    	   System.out.println("One Employee Inserted Sucessfully....");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
    }
}
