package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import acc.pojo.AccountsPayable;
import acc.pojo.ChartOfAccounts;
import Helper.databaseHelper;

public class AccountsPayableDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;

	// for adding
	public void saveAccountsPayables(AccountsPayable payable, long chartiD) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		AccountsPayable payments = new AccountsPayable();
		Long fn = payable.getFolioNr();
		double m = payable.getAmount();
		Date d = payable.getPaymentDate();
		String ty = payable.getPaymentType();
		payments.setFolioNr(fn);
		payments.setAmount(m);
		payments.setPaymentDate(d);
		payments.setPaymentType(ty);
		// payments.setCharts(payable.getC());

		ChartOfAccounts ach = em.find(ChartOfAccounts.class, chartiD);

		payable.setCharts(ach);

		em.persist(payable);
		em.getTransaction().commit();
		em.close();
	}
	
	// for searching
	public AccountsPayable search(Long payableId) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		AccountsPayable payable = em.find(AccountsPayable.class, payableId);
		return payable;
	}

	// for deleting
	public void remove(Long payableId) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		AccountsPayable payable = em.find(AccountsPayable.class, payableId);
		em.remove(payableId);
		em.getTransaction().commit();
		em.close();
	}

	// for updating
	public void update(AccountsPayable payable) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();

		long folioNr = payable.getFolioNr();
		AccountsPayable payable1 = em.find(AccountsPayable.class, folioNr);
		double amount = payable.getAmount();
		Date paymentDate = payable.getPaymentDate();
		String paymentType = payable.getPaymentType();

		payable1.setAmount(amount);
		payable1.setPaymentDate(paymentDate);
		payable1.setPaymentType(paymentType);

		em.getTransaction().commit();
		em.close();
	}

	// for displaying
	public List<AccountsPayable> listAccountsPayables() {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		TypedQuery<AccountsPayable> query = em.createQuery("Select a from AccountsPayable a", AccountsPayable.class);
				
		List<AccountsPayable> results = query.getResultList();
		return results;
	}

}