package acc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.StoreAccount;
import acc.pojo.StoreAccountsPayable;


public class StoreAccountDao {
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveStoreAccount(StoreAccount account){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		em.close();
	}
	public StoreAccount search(Long accountId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreAccount account=em.find(StoreAccount.class,accountId);
		return account;
	}
	//for deleting
	public void remove(Long accountId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreAccount account=em.find(StoreAccount.class,accountId);
		em.remove(account);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update(long accountId,String storeName,
			double initialPayment, List<StoreAccountsPayable> storeAccounts) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreAccount account=em.find(StoreAccount.class,accountId);
		account.setStoreName(storeName);
		account.setInitialPayment( initialPayment);
		account.setStoreAccounts(storeAccounts);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<StoreAccount>listStoreAccount(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<StoreAccount> query=em.createQuery("Select b from StoreAccount s",StoreAccount.class);
        List<StoreAccount> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
