package acc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import acc.pojo.ChartOfAccounts;
import Helper.databaseHelper;

public class ChartOfAccountsDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;

	// for adding
	public void saveChartOfAccounts(ChartOfAccounts accounts) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(accounts);
		em.getTransaction().commit();
		em.close();
	}
	
	// for searching
	public ChartOfAccounts search(Long accountsId) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		ChartOfAccounts accounts = em.find(ChartOfAccounts.class, accountsId);
		return accounts;
	}

	// for deleting
	public void remove(Long accountsId) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		ChartOfAccounts accounts = em.find(ChartOfAccounts.class, accountsId);
		em.remove(accounts);
		em.getTransaction().commit();
		em.close();
	}

	// for updating
	public void update(ChartOfAccounts updateChart) {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		long accountsId = updateChart.getChartCode();
		String chartDescription = updateChart.getChartDescription();
		String chartType = updateChart.getChartType();
		ChartOfAccounts accounts = em.find(ChartOfAccounts.class, accountsId);
		accounts.setChartDescription(chartDescription);
		accounts.setChartType(chartType);

		em.getTransaction().commit();
		em.close();
	}

	// for displaying
	public List<ChartOfAccounts> listChartOfAccounts() {
		
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		TypedQuery<ChartOfAccounts> query = em.createQuery("Select b" + " from ChartOfAccounts b", ChartOfAccounts.class);
				
		List<ChartOfAccounts> results = query.getResultList();
		return results;
	}

}