/*package acc.service;

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

import acc.dao.SupplierPaymentDao;
import acc.pojo.Employee;
import acc.pojo.SupplierPayment;
import acc.pojo.Suppliers;


@Path("/SupplierPayment")
public class SupplierPaymentRest {
	
	SupplierPaymentDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public SupplierPayment addSupplierPayment(SupplierPayment payment){
		dao = new SupplierPaymentDao();
		dao.saveSupplierPayment(payment);
		return payment;		
	}
	
	//for updating
	@PUT
	@Path("{SupplierPaymentID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	public void update(@PathParam("SupplierPaymentID")  long paymentId,@PathParam("PaymentDate") 
	Date paymentDate,@PathParam("AmountPaid")double amountPaid ,
    @PathParam("SupplierID")Suppliers supplier,@PathParam("EmployeeID") Employee employees){
	
	
	//not sure wich 1 works best
	public void update(@QueryParam("SupplierPaymentID")  long paymentId,@QueryParam("PaymentDate") 
	Date paymentDate,@QueryParam("AmountPaid")double amountPaid ,
    @QueryParam("SupplierID")Suppliers supplier,@QueryParam("EmployeeID") Employee employees){
		
		
		dao = new SupplierPaymentDao();
		dao.update(paymentId ,paymentDate, amountPaid,supplier,employees);
	}
	
	
	
	
	
	//for deleting
	
	@DELETE 
	@Path("{SupplierPaymentID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("SupplierPaymentID") Long paymentId) {
		dao = new SupplierPaymentDao();
		dao.remove(paymentId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<SupplierPayment> findAll() {
	   dao = new SupplierPaymentDao();
	  return dao.listSupplierPayments();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
*/