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

import acc.dao.CustomerPaymentsDao;
import acc.pojo.AccountPayment;
import acc.pojo.CustomerPayments;

@Path("/CustomerPayments")
public class CustomerPaymentsRest {
	
	CustomerPaymentsDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public CustomerPayments addCustomerPayments(CustomerPayments payments){
		dao = new CustomerPaymentsDao();
		dao.saveCustomerPayments(payments);
		return payments;		
	}
	
	//for updating
	@PUT
	@Path("{PaymentID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	/*public void update(@PathParam("PaymentID")long paymentId,@PathParam("Date") 
    Date date,@PathParam("cusPayment") List<AccountPayment> accountsPaid) {
	*/
	//not sure wich 1 works best
	public void update(@QueryParam("PaymentID") int custId,@QueryParam("Date") 
    Date date,@QueryParam("cusPayment") List<AccountPayment> accountsPaid) {
		
		
		dao = new CustomerPaymentsDao();
		dao.update(custId, date,accountsPaid);
	}
	
	
	//for deleting
	
	@DELETE 
	@Path("{PaymentID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("PaymentID") Long paymentId) {
		dao = new CustomerPaymentsDao();
		dao.remove(paymentId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<CustomerPayments> findAll() {
	   dao = new CustomerPaymentsDao();
	  return dao.listCustomerPayments();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
