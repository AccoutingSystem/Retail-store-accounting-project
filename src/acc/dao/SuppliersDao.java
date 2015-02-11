/*package acc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.SupplierPayment;
import acc.pojo.Suppliers;


public class SuppliersDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveSuppliers(Suppliers supplier){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(supplier);
		em.getTransaction().commit();
		em.close();
	}
	public Suppliers search(long  supplierId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Suppliers supplier=em.find(Suppliers.class, supplierId);
		return supplier;
	}
	//for deleting
	public void remove(long supplierId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Suppliers supplier=em.find(Suppliers.class,supplierId);
		em.remove(supplier);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	public void update( long supplierId,String supplName, String supplContactNr,
			String supplEmail, String supplAddress, long supplAccNr,
			long branchCode, String bankName,
			List<SupplierPayment> supplierPayments,
			List<String> supplierServices) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Suppliers supplier=em.find(Suppliers.class,supplierId);
		supplier.setSupplName(supplName);
		supplier.setSupplContactNr(supplContactNr);
		supplier.setSupplEmail(supplEmail);
		supplier.setSupplAddress(supplAddress);
		supplier.setSupplAccNr(supplAccNr);
		supplier.setBranchCode(branchCode);
		supplier.setBankName(bankName);
		supplier.setSupplierPayments(supplierPayments);
		supplier.setSupplierServices(supplierServices);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Suppliers>listSuppliers(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Suppliers> query=em.createQuery("Select b from Suppliers a",Suppliers.class);
        List<Suppliers> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/