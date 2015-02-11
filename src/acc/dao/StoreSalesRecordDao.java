/*package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.Employee;
import acc.pojo.Sales;
import acc.pojo.StoreSalesRecord;


public class StoreSalesRecordDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveStoreSalesRecord(StoreSalesRecord record){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(record);
		em.getTransaction().commit();
		em.close();
	}
	public StoreSalesRecord search(Long recordId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreSalesRecord record=em.find(StoreSalesRecord.class,recordId);
		return record;
	}
	//for deleting
	public void remove(Long recordId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreSalesRecord record=em.find(StoreSalesRecord.class,recordId);
		em.remove(record);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating *
	public void update(long recordId,double deptSalesAmounts,
			Date salesRecDate, Employee employee, Sales sales) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		StoreSalesRecord record=em.find(StoreSalesRecord.class,recordId);
		record.setDeptSalesAmounts(deptSalesAmounts);
		record.setSalesRecDate(salesRecDate);
		record.setEmployee(employee);
		record.setSales( sales);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<StoreSalesRecord>listStoreSalesRecords(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<StoreSalesRecord> query=em.createQuery("Select b from StoreSalesRecord e",StoreSalesRecord.class);
        List<StoreSalesRecord> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/