package acc.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;

import acc.pojo.Sales;
import acc.pojo.StoreSalesRecord;


public class SalesDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveSales(Sales sales){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(sales);
		em.getTransaction().commit();
		em.close();
	}
	public Sales search(Long salesId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Sales sales=em.find(Sales.class,salesId);
		return sales;
	}
	//for deleting
	public void remove(Long salesId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Sales sales=em.find(Sales.class,salesId);
		em.remove(sales);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update(long salesId,String salesDepartment, List<StoreSalesRecord> storeSales) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Sales sales=em.find(Sales.class,salesId);
		sales.setSalesDepartment(salesDepartment);
		sales.setStoreSales(storeSales);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Sales>listSales(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Sales> query=em.createQuery("Select b from Sales s",Sales.class);
        List<Sales> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
