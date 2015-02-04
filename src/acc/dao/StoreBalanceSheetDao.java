package acc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;

import acc.pojo.StoreBalanceSheet;

public class StoreBalanceSheetDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveStoreBalanceSheet(StoreBalanceSheet balance){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(balance);
		em.getTransaction().commit();
		em.close();
	}
	public StoreBalanceSheet search(Long balanceId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreBalanceSheet balance=em.find(StoreBalanceSheet.class,balanceId);
		return balance;
	}
	//for deleting
	public void remove(Long balanceId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreBalanceSheet balance=em.find(StoreBalanceSheet.class,balanceId);
		em.remove(balance);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update(long balanceId,double checkingAcc,
			double investment, double accReceivable, double accPayable,
			double loansPayable, double salariesPayable, double taxesPayable,
			double ownersEquity, double profit, double loss) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreBalanceSheet balance=em.find(StoreBalanceSheet.class,balanceId);
		balance.setCheckingAcc(checkingAcc);
		balance.setInvestment(investment);
		balance.setAccReceivable(accReceivable);
		balance.setAccPayable(accPayable);
		balance.setLoansPayable(loansPayable);
		balance.setSalariesPayable(salariesPayable);
		balance.setTaxesPayable(taxesPayable);
		balance.setOwnersEquity(ownersEquity);
		balance.setProfit(profit);
		balance.setLoss(loss);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<StoreBalanceSheet>listStoreBalanceSheet(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<StoreBalanceSheet> query=em.createQuery("Select b from StoreBalanceSheet s",StoreBalanceSheet.class);
        List<StoreBalanceSheet> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
