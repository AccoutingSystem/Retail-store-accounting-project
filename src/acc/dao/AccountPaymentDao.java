package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.AccountPayment;
import acc.pojo.CustomerAccount;
import acc.pojo.CustomerPayments;

public class AccountPaymentDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveAccountPayments(AccountPayment payments){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(payments);
		em.getTransaction().commit();
		em.close();
	}
	public AccountPayment search(long  accPaymentId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		AccountPayment payments=em.find(AccountPayment.class, accPaymentId);
		return payments;
	}
	//for deleting
	public void remove(long  accPaymentId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		AccountPayment payments=em.find(AccountPayment.class, accPaymentId);
		em.remove(payments);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update(long accPaymentId,double amount,CustomerAccount cusAccount, CustomerPayments cusPayment) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		AccountPayment payments=em.find(AccountPayment.class,accPaymentId);
		payments.setAmount(amount);
		payments.setCusPayment(cusPayment);
		payments.setCusAccount(cusAccount);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<AccountPayment>listAccountPayments(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<AccountPayment> query=em.createQuery("Select b from AccountPayment a",AccountPayment.class);
        List<AccountPayment> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
