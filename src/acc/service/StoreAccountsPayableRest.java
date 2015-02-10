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

import acc.dao.StoreAccountsPayableDao;
import acc.pojo.Employee;
import acc.pojo.StoreAccountsPayable;

@Path("/StoreAccountsPayables")
public class StoreAccountsPayableRest {
	
	StoreAccountsPayableDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public StoreAccountsPayable addStoreAccountsPayables(StoreAccountsPayable payables){
		dao = new StoreAccountsPayableDao();
		dao.saveStoreAccountPayable(payables);
		return payables;		
	}
	
	//for updating
	@PUT
	@Path("{AccPayableID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	/*public void update(@PathParam("AccPayableID") long payablesId,@PathParam("AccountType") 
	String accType,@PathParam("PayableAmount")double amount,@PathParam("PaymentDate")Date paymentDate,
	@PathParam("EmployeeID")Employee empPaid){
	*/
	
	//not sure wich 1 works best
	public void update(@QueryParam("AccPayableID") long payablesId,@QueryParam("AccountType") 
	String accType,@QueryParam("PayableAmount")double amount,@QueryParam("PaymentDate")Date paymentDate,
	@QueryParam("EmployeeID")Employee empPaid){
    
		dao = new StoreAccountsPayableDao();
		dao.update(payablesId,accType,amount, paymentDate,empPaid);
	}
	
	
	
	//for deleting
	
	@DELETE 
	@Path("{AccPayableID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void remove(@PathParam("AccPayableID") Long payablesId) {
		dao = new StoreAccountsPayableDao();
		dao.remove(payablesId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<StoreAccountsPayable> findAll() {
	   dao = new StoreAccountsPayableDao();
	  return dao.listStoreAccountsPayable();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
