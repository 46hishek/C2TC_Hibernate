package com.cg.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//Create One Employee
		Employee employee = new Employee();
		employee.setName("SHYAM");
		employee.setSalary(4000);
		em.persist(employee);
		
		//Create One Manager
		Manager manager= new Manager();
		manager.setName("Arsh");
		manager.setSalary(6000);
		manager.setDepartmentName("CSE");
		em.persist(manager);
		
		
		em.getTransaction().commit();
		
		System.out.println("Successfully an Employee and a Manager");
		
		em.close();
		
		factory.close();

	}

}
