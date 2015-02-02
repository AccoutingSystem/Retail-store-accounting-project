package acc.service;


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

import acc.dao.AccountPaymentDao;
import acc.pojo.AccountPayment;
import acc.pojo.CustomerAccount;
import acc.pojo.CustomerPayments;

@Path("/AccountPayments")
public class AccountPaymentRest {
	
	

	AccountPaymentDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public AccountPayment addCustomerPayments(AccountPayment payments){
		dao = new AccountPaymentDao();
		dao.saveAccountPayments(payments);
		return payments;		
	}
	
	//for updating
	@PUT
	@Path("{AccountPaymentID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	/*public void update(@PathParam("PaymentID")long accPaymentId,@PathParam("Amount") 
    double amount,@PathParam("cusPayment")CustomerAccount cusAccount,@PathParam("PaymentID")CustomerPayments cusPayment) {
	*/
	//not sure wich 1 works best
	public void update(@QueryParam("AccountPaymentID") long accPaymentId,@QueryParam("Amount") 
	double amount,@QueryParam("AccountID")CustomerAccount cusAccount,@QueryParam("PaymentID")CustomerPayments cusPayment) {
		
		
		dao = new AccountPaymentDao();
		dao.update(accPaymentId, amount,cusAccount,cusPayment);
	}
	
	
	//for deleting
	
	@DELETE 
	@Path("{AccountPaymentID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("AccountPaymentID") Long paymentId) {
		dao = new AccountPaymentDao();
		dao.remove(paymentId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<AccountPayment> findAll() {
	   dao = new AccountPaymentDao();
	  return dao.listAccountPayments();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
