/*package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.Employee;
import acc.pojo.StoreAccountsPayable;

public class StoreAccountsPayableDao {
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveStoreAccountPayable(StoreAccountsPayable payables){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(payables);
		em.getTransaction().commit();
		em.close();
	}
	public StoreAccountsPayable search(Long payablesId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreAccountsPayable payables=em.find(StoreAccountsPayable.class,payablesId);
		return payables;
	}
	//for deleting
	public void remove(Long payablesId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreAccountsPayable payables=em.find(StoreAccountsPayable.class,payablesId);
		em.remove(payables);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update(long payablesId,String accType,
			double amount, Date paymentDate, Employee empPaid) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreAccountsPayable payables=em.find(StoreAccountsPayable.class,payablesId);
		payables.setAccType(accType);
		payables.setAmount(amount);
		payables.setPaymentDate(paymentDate);
		payables.setEmpPaid(empPaid);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<StoreAccountsPayable>listStoreAccountsPayable(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<StoreAccountsPayable> query=em.createQuery("Select b from StoreAccountsPayable s",StoreAccountsPayable.class);
        List<StoreAccountsPayable> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/