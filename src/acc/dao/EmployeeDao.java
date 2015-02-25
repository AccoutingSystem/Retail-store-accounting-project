package acc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import Helper.databaseHelper;
import acc.pojo.Employee;

public class EmployeeDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;

	// for adding
	public void saveEmployee(Employee employee) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
	}

}