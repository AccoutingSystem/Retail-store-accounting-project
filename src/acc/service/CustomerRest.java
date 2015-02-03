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

import acc.dao.CustomerDao;
import acc.pojo.Customer;


@Path("/Customer")
public class CustomerRest {

	CustomerDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Customer addCustomer(Customer customer){
		dao = new CustomerDao();
		dao.saveCustomer(customer);
		return customer;		
	}
	
	//for updating
	@PUT
	@Path("{CustomerID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	/*public void update(@PathParam("CustomerID")int custId,@PathParam("CustomerName") 
    String custName,@PathParam("CustomerSurname") String custSurname,
    @PathParam("CustomerAddress")String custAddress,@PathParam("ContactNr") 
    String contactNr,@PathParam("Occupation") String occupation,@PathParam("Gender") 
	String gender,@PathParam("IdentityNr") String idNr,@PathParam("Income") String income,@PathParam("MonthlyExpences") String monthlyExpenses,
	@PathParam("BranchCode") String  branchCode,@PathParam("BankName") String bankName,@PathParam("E-mail") String email) {
	*/
	//not sure wich 1 works best
	public void update(@QueryParam("CustomerID") long custId,@QueryParam("CustomerName") 
    String custName,@QueryParam("CustomerSurname") String custSurname,
    @QueryParam("CustomerAddress")String custAddress,@QueryParam("ContactNr") 
    String contactNr,@QueryParam("Occupation") String occupation,@QueryParam("Gender") 
	String gender,@QueryParam("IdentityNr") long idNr,@QueryParam("Income") double income,@QueryParam("MonthlyExpences") double monthlyExpenses,
	@QueryParam("BranchCode") long  branchCode,@QueryParam("BankName") String bankName,@QueryParam("E-mail") String email) {
		
		
		dao = new CustomerDao();
		dao.update(custId, custName,custSurname,custAddress, contactNr,occupation,gender,idNr,income,monthlyExpenses,branchCode,bankName,email);
	}
	
	
	//for deleting
	
	@DELETE 
	@Path("{CustomerID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("custId") Long custId) {
		dao = new CustomerDao();
		dao.remove(custId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<Customer> findAll() {
	   dao = new CustomerDao();
	  return dao.listCustomers();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
