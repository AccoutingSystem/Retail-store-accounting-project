package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.AccountsReceivable;
import acc.pojo.ChartOfAccounts;

public class AccountsReceivableDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;

	// for adding
	public void saveAccountsReceivables(AccountsReceivable receivable, long id) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		ChartOfAccounts ach = em.find(ChartOfAccounts.class, id);
		receivable.setCharts(ach);
		em.persist(receivable);
		em.getTransaction().commit();
		em.close();
	}

	public AccountsReceivable search(Long receivableId) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		AccountsReceivable receivable = em.find(AccountsReceivable.class, receivableId);
				
		return receivable;
	}

	// for deleting
	public void remove(Long receivableId) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		AccountsReceivable receivable = em.find(AccountsReceivable.class, receivableId);
				
		em.remove(receivable);
		em.getTransaction().commit();
		em.close();
	}

	/*
	 * long accountsId = updateChart.getChartCode(); String chartDescription =
	 * updateChart.getChartDescription(); String chartType =
	 * updateChart.getChartType(); ChartOfAccounts
	 * accounts=em.find(ChartOfAccounts.class,accountsId);
	 * accounts.setChartDescription(chartDescription);
	 * accounts.setChartType(chartType);
	 */

	// for updating
	public void update(AccountsReceivable receivable) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();

		long id = receivable.getFolioNr();
		double amount = receivable.getAmount();
		Date date1 = receivable.getReceivablesDate();
		String paymentType = receivable.getReceivableType();

		AccountsReceivable rec = em.find(AccountsReceivable.class, id);
		rec.setAmount(amount);
		rec.setReceivablesDate(date1);
		rec.setReceivableType(paymentType);
		em.getTransaction().commit();
		em.close();
	}

	// for displaying
	public List<AccountsReceivable> listAccountsReceivables() {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		TypedQuery<AccountsReceivable> query = em.createQuery("Select p from AccountsReceivable p", AccountsReceivable.class);
				
		List<AccountsReceivable> results = query.getResultList();
		return results;
	}
}