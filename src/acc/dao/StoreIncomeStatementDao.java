package acc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.StoreIncomeStatement;

public class StoreIncomeStatementDao {
	
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void StoreIncomeStatement(StoreIncomeStatement statement){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(statement);
		em.getTransaction().commit();
		em.close();
	}
	public StoreIncomeStatement search(Long statementId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreIncomeStatement statement=em.find(StoreIncomeStatement.class,statementId);
		return statement;
	}
	//for deleting
	public void remove(Long statementId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreIncomeStatement balance=em.find(StoreIncomeStatement.class,statementId);
		em.remove(balance);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update(long statementId,double salesIncome,
			double investment, double officeSupplies, double telExpenses,
			double utilities, double maintenance, double insurance,
			double miscellExpenses, double travNIntertain, double bankCharges,
			double taxExpenses) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreIncomeStatement statement=em.find(StoreIncomeStatement.class,statementId);
		statement.setSalesIncome(salesIncome);
		statement.setInvestment( investment);
		statement.setOfficeSupplies(officeSupplies);
		statement.setTelExpenses(telExpenses);
		statement.setUtilities(utilities);
		statement.setMaintenance(maintenance);
		statement.setInsurance(insurance);
		statement.setMiscellExpenses(miscellExpenses);
		statement.setTravNIntertain(travNIntertain);
		statement.setBankCharges(bankCharges);
		statement.setTaxExpenses( taxExpenses);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<StoreIncomeStatement>listStoreIncomeStatement(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<StoreIncomeStatement> query=em.createQuery("Select b from StoreIncomeStatement s",StoreIncomeStatement.class);
        List<StoreIncomeStatement> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
