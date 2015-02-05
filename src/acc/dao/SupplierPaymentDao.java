package acc.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import Helper.databaseHelper;
import acc.pojo.Employee;
import acc.pojo.SupplierPayment;
import acc.pojo.Suppliers;

public class SupplierPaymentDao {
	
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveSupplierPayment(SupplierPayment payment){
		emf = databaseHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(payment);
		em.getTransaction().commit();
		em.close();
	}
	public SupplierPayment search(Long paymentId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		SupplierPayment payment=em.find(SupplierPayment.class,paymentId);
		return payment;
	}
	//for deleting
	public void remove(Long paymentId){
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		SupplierPayment payment=em.find(SupplierPayment.class,paymentId);
		em.remove(payment);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating *
	public void update( long paymentId ,Date paymentDate, double amountPaid,
			Suppliers supplier, Employee employees) {
		emf=databaseHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		SupplierPayment payment=em.find(SupplierPayment.class,paymentId);
		payment.setPaymentDate(paymentDate);
		payment.setAmountPaid(amountPaid);
		payment.setSupplier(supplier);
		payment.setEmployees(employees);
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<SupplierPayment>listSupplierPayments(){
        emf=databaseHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<SupplierPayment> query=em.createQuery("Select b from SupplierPayment p",SupplierPayment.class);
        List<SupplierPayment> results=query.getResultList();
        return results;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
