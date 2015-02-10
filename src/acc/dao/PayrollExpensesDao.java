package acc.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.Employee;
import acc.pojo.PayrolExpenses;

public class PayrollExpensesDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void savePayrollExpenses(PayrolExpenses payroll){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(payroll);
		em.getTransaction().commit();
		em.close();
	}
	public PayrolExpenses search(long payrollId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		PayrolExpenses payroll=em.find(PayrolExpenses.class,payrollId);
		return payroll;
	}
	//for deleting
	public void remove(long payrollId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		PayrolExpenses payroll=em.find(PayrolExpenses.class,payrollId);
		em.remove(payroll);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update( long payrollId ,String benefits, double salaryRatings,
			double wageRatings, double bonuses, String leave,
			double telExpenses, List<Employee> payrolExpense) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		PayrolExpenses payroll=em.find(PayrolExpenses.class,payrollId);
		payroll.setBenefits(benefits);
		payroll.setSalaryRatings(salaryRatings);
		payroll.setWageRatings(wageRatings);
		payroll.setBonuses(bonuses);
		payroll.setLeave(leave);
		payroll.setTelExpenses(telExpenses);
		payroll.setPayrolExpense(payrolExpense);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<PayrolExpenses>listPayrollExpenses(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<PayrolExpenses> query=em.createQuery("Select b from PayrolExpenses p",PayrolExpenses.class);
        List<PayrolExpenses> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
