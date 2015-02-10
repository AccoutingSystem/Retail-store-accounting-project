package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import acc.pojo.AccountsPayable;
import Helper.databaseHelper;

public class AccountsPayableDao {
	 EntityManagerFactory emf = null;
	 EntityManager em = null;
	 
	 //for adding
	 public void saveAccountsPayables(AccountsPayable payable){
	  emf = databaseHelper.provideFactory();
	  em = emf.createEntityManager();
	  em.getTransaction().begin();
	  em.persist(payable);
	  em.getTransaction().commit();
	  em.close();
	 }
	 public AccountsPayable search(Long payableId){
	  emf=databaseHelper.provideFactory();
	  em=emf.createEntityManager();
	  em.getTransaction().begin();
	  AccountsPayable payable=em.find(AccountsPayable.class,payableId);
	  return payable;
	 }
	 //for deleting
	 public void remove(Long payableId){
	  emf=databaseHelper.provideFactory();
	  em=emf.createEntityManager();
	  em.getTransaction().begin();
	  AccountsPayable payable=em.find(AccountsPayable.class,payableId);
	  em.remove(payableId);
	  em.getTransaction().commit();
	  em.close();
	 }
	 
	 //for updating
	 public void update(long folioNr, double amount, Date paymentDate,
	      String paymentType) {
	     emf=databaseHelper.provideFactory();
	  em=emf.createEntityManager();
	  em.getTransaction().begin();
	  AccountsPayable payable=em.find(AccountsPayable.class,folioNr);
	  payable.setAmount(amount);
	  payable.setPaymentDate(paymentDate);
	  payable.setPaymentType(paymentType);
	  
	  em.getTransaction().commit();
	  em.close();
	 }

	 //for displaying
	  public List<AccountsPayable>listAccountsPayables(){
	        emf=databaseHelper.provideFactory();
	        em=emf.createEntityManager();
	        TypedQuery<AccountsPayable> query=em.createQuery("Select p from AccountsPayable a",AccountsPayable.class);
	        List<AccountsPayable> results=query.getResultList();
	        return results;
	    }

	}