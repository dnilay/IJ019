package org.example.demo;

import java.util.List;

import org.example.demo.model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			/*
			 * Employee employee=new Employee(102, "Rahul", "Dravid", "rahul@email.com");
			 * session.getTransaction().begin(); session.save(employee);
			 * session.getTransaction().commit();
			 * System.out.println("One Employee Inserted Sucessfully....");
			 */
			session.getTransaction().begin();
			Query<Employee> query = session.createQuery("FROM Employee", Employee.class);
			List<Employee> list = query.getResultList();
			session.getTransaction().commit();

			for (Employee e : list) {
				System.out.println(e);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
