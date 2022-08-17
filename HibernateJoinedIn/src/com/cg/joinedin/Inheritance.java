package com.cg.joinedin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//Create One Employee
		Employee employee = new Employee();
		employee.setName("raj");
		employee.setSalary(8800);
		em.persist(employee);
		
		//Create One Manager
		Manager manager= new Manager();
		manager.setName("dilip");
		manager.setSalary(23400);
		manager.setDepartmentName("ece");
		em.persist(manager);
		
		
		em.getTransaction().commit();
		
		System.out.println("Added One Employee and Manager");
		
		em.close();
		
		factory.close();

	}

}
