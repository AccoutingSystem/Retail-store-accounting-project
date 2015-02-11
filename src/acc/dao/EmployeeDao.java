/*package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.Employee;
import acc.pojo.PayrolExpenses;
import acc.pojo.StoreAccountsPayable;
import acc.pojo.StoreSalesRecord;

public class EmployeeDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveEmployee(Employee employee){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
	}
	public Employee search(Long empId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee=em.find(Employee.class,empId);
		return employee;
	}
	//for deleting
	public void remove(Long empId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee=em.find(Employee.class,empId);
		em.remove(employee);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void updateg(long empId,String empName, String empSurname, String empAddress,
	String empContactNr, String jobTitle, Date startDate,
	long idNumber, String gender, String race, String email,
	String password, String taxNumber, String qualification,
	long empAccNr, long brachCode, String branchName,
	PayrolExpenses payrolls,
	List<StoreAccountsPayable> accountsPayable,
	List<StoreSalesRecord> storeSalesRec) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee=em.find(Employee.class,empId);
		employee.setEmpName(empName);
		employee.setEmpSurname(empSurname);
		employee.setEmpAddress(empAddress);
		employee.setEmpContactNr(empContactNr);
		employee.setJobTitle(jobTitle);
		employee.setStartDate(startDate);
		employee.setIdNumber(idNumber);
		employee.setGender(gender);
		employee.setRace(race);
		employee.setEmail( email);
		employee.setPassword( password);
		employee.setTaxNumber(taxNumber);
		employee.setQualification(qualification);
		employee.setEmpAccNr(empAccNr);
		employee.setBrachCode(brachCode);
		employee.setBranchName( branchName);
		employee.setPayrolls(payrolls);
		employee.setAccountsPayable(accountsPayable);
		employee.setStoreSalesRec(storeSalesRec);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Employee>listEmployees(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Employee> query=em.createQuery("Select b from Employee e",Employee.class);
        List<Employee> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/