package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.AccountsReceivable;

public class AccountsReceivableDao {
	 EntityManagerFactory emf = null;
	 EntityManager em = null;
	 
	 //for adding
	 public void saveAccountsReceivables(AccountsReceivable receivable){
	  emf = databaseHelper.provideFactory();
	  em = emf.createEntityManager();
	  em.getTransaction().begin();
	  em.persist(receivable);
	  em.getTransaction().commit();
	  em.close();
	 }
	 public AccountsReceivable search(Long receivableId){
	  emf=databaseHelper.provideFactory();
	  em=emf.createEntityManager();
	  em.getTransaction().begin();
	  AccountsReceivable receivable=em.find(AccountsReceivable.class,receivableId);
	  return receivable;
	 }
	 //for deleting
	 public void remove(Long receivableId){
	  emf=databaseHelper.provideFactory();
	  em=emf.createEntityManager();
	  em.getTransaction().begin();
	  AccountsReceivable receivable=em.find(AccountsReceivable.class,receivableId);
	  em.remove(receivable);
	  em.getTransaction().commit();
	  em.close();
	 }
	 
	 //for updating
	 public void update(long folioNr, double amount,
	      Date receivablesDate, String receivableType) {
	     emf=databaseHelper.provideFactory();
	  em=emf.createEntityManager();
	  em.getTransaction().begin();
	  AccountsReceivable receivable=em.find(AccountsReceivable.class,folioNr);
	  receivable.setAmount(amount);
	  receivable.setReceivablesDate(receivablesDate);
	  receivable.setReceivableType(receivableType);
	  em.getTransaction().commit();
	  em.close();
	 }

	 //for displaying
	  public List<AccountsReceivable>listAccountsReceivables(){
	        emf=databaseHelper.provideFactory();
	        em=emf.createEntityManager();
	        TypedQuery<AccountsReceivable> query=em.createQuery("Select p from AccountsReceivable r",AccountsReceivable.class);
	        List<AccountsReceivable> results=query.getResultList();
	        return results;
	    }
}