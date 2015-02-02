package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.Customer;
import acc.pojo.CustomerAccount;


public class CustomerAccountDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveCustomerAccount(CustomerAccount customerAccount){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(customerAccount);
		em.getTransaction().commit();
		em.close();
	}
	public CustomerAccount search(Long id){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		CustomerAccount customerAccount=em.find(CustomerAccount.class,id);
		return customerAccount;
	}
	//for deleting
	public void remove(Long id){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		CustomerAccount customerAccount=em.find(CustomerAccount.class,id);
		em.remove(customerAccount);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update(int accId, String custbalance, String installment,
			String custCredit, Date date, String interestRate, Customer customer) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		CustomerAccount customerAccount=em.find(CustomerAccount.class,accId);
		customerAccount.setCustbalance(accId);
		customerAccount.setInstallment(accId);
		customerAccount.setCustCredit(accId);
		customerAccount.setDate(date);
		customerAccount.setInterestRate(accId);
		customerAccount.setCustomer(customer);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<CustomerAccount>listCustomerAccounts(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<CustomerAccount> query=em.createQuery("Select b from CustomerAccount b",CustomerAccount.class);
        List<CustomerAccount> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
