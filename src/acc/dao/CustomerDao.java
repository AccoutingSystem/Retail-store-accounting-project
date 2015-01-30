package acc.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import acc.pojo.Customer;
import Helper.databaseHelper;





public class CustomerDao {
	
	
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveCustomer(Customer customer){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		em.close();
	}
	public Customer search(Long id){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Customer customer=em.find(Customer.class,id);
		return customer;
	}
	//for deleting
	public void remove(Long id){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Customer customer=em.find(Customer.class,id);
		em.remove(customer);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update( int custId,String custName, String custSurname,
			String custAddress, String contactNr, String occupation, String gender,
			String idNr, String income, String monthlyExpenses, String branchCode,
			String bankName, String email) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Customer customer=em.find(Customer.class,custId);
		customer.setCustName(custName);
		customer.setCustSurname(custSurname);
		customer.setCustAddress(custAddress);
		customer.setContactNr(contactNr);
		customer.setOccupation(occupation);
		customer.setGender(gender);
		customer.setIdNr(idNr);
		customer.setIncome(income);
		customer.setEmail(email);
		customer.setMonthlyExpenses(monthlyExpenses);
		customer.setBranchCode(branchCode);
		customer.setBankName(bankName);

		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Customer>listCustomers(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Customer> query=em.createQuery("Select b from Customer b",Customer.class);
        List<Customer> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
