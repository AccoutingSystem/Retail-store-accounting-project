package acc.dao;


import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.AccountPayment;
import acc.pojo.CustomerPayments;
public class CustomerPaymentsDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveCustomerPayments(CustomerPayments payments){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(payments);
		em.getTransaction().commit();
		em.close();
	}
	public CustomerPayments search(long paymentId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		CustomerPayments payments=em.find(CustomerPayments.class,paymentId);
		return payments;
	}
	//for deleting
	public void remove(long paymentId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		CustomerPayments payments=em.find(CustomerPayments.class,paymentId);
		em.remove(payments);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update( long paymentId ,Date date, List<AccountPayment> accountsPaid) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		CustomerPayments payments=em.find(CustomerPayments.class,paymentId);
		payments.setDate(date);
		payments.setAccountsPaid(accountsPaid);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<CustomerPayments>listCustomerPayments(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<CustomerPayments> query=em.createQuery("Select b from CustomerPayments p",CustomerPayments.class);
        List<CustomerPayments> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
