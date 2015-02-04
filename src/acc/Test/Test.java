package acc.Test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import acc.pojo.Customer;
import acc.pojo.CustomerAccount;


public class Test 
{
	
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accounting");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//instantiating and object for AccountingDAO
		//CustomerDAO dao = new CustomerDAO();
		
		Date date = new Date();
		date.setMonth(1);
		
		Customer cust1 = new Customer("John","McRoy","25 Ben Street, Cape Town","021 569 2369","Developer",
				"Female",1233456789,15000.00,5000.00,33550,"Capitec","kkk@gmail.com");
		
		Customer cust2 = new Customer("Kebo","Moreng","15 Lol Street, Johannesburg","011 253 5632","Cashier",
				"Male",1233456789,15000.00,5000,35000,"Standard Bank","123@gmail.com");
		
		Customer cust3 = new Customer("Boby","Love","Kenny Street, Kimberley","021 569 2369","Manager",
				"Female",1233456789,15000.00,5000,35000,"Absa","wer@gmail.com");
		
				
		CustomerAccount cAccount1 = new CustomerAccount(10000.00,520,5000,date,0.15,cust1);
		CustomerAccount cAccount2 = new CustomerAccount(2000.00,200,893,date,0.15,cust2);
		CustomerAccount cAccount3 = new CustomerAccount(4000,600,5630,date,0.15,cust3);
		
		em.persist(cust1);
		em.persist(cust2);
		em.persist(cust3);
		
		em.persist(cAccount1);
		em.persist(cAccount2);
		em.persist(cAccount3);
		
		em.getTransaction().commit();
	}
		
}
