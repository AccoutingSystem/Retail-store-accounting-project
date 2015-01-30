package acc.service;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import acc.dao.CustomerAccountDao;
import acc.pojo.Customer;
import acc.pojo.CustomerAccount;

public class CustomerAccountRest {
	
	CustomerAccountDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public CustomerAccount addCustomer(CustomerAccount customerAccount){
		dao = new CustomerAccountDao();
		dao.saveCustomerAccount(customerAccount);
		return customerAccount;		
	}
	
	//for updating
	@PUT
	@Path("{AccountID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	/*
	public void update(@PathParam("AccountID") int accId,@PathParam("CustomerBalance") 
    String custbalance,@PathParam("Installment") String installment,
    @PathParam("Credit")String custCredit,@PathParam("Date") 
    Date date,@PathParam("InterestRate") String interestRate,@PathParam("customer") 
	Customer customer) {
	*/
	
	//not sure wich 1 works best
	public void update(@QueryParam("AccountID") int accId,@QueryParam("CustomerBalance") 
    String custbalance,@QueryParam("Installment") String installment,
    @QueryParam("Credit")String custCredit,@QueryParam("Date") 
    Date date,@QueryParam("InterestRate") String interestRate,@QueryParam("customer") 
	Customer customer) {
		
		
		dao = new CustomerAccountDao();
		dao.update(accId, custbalance,installment,custCredit,date,interestRate,customer);
	}
	
	//for deleting
	
	@DELETE 
	@Path("{AccountID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("AccountID") Long custId) {
		dao = new CustomerAccountDao();
		dao.remove(custId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<CustomerAccount> findAll() {
	   dao = new CustomerAccountDao();
	  return dao.listCustomerAccounts();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


