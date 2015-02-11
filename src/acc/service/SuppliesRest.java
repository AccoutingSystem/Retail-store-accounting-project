/*package acc.service;

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

import acc.dao.SuppliersDao;
import acc.pojo.SupplierPayment;
import acc.pojo.Suppliers;


@Path("/Suppliers")
public class SuppliesRest {
	

	SuppliersDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Suppliers addSuppliers(Suppliers supplier){
		dao = new SuppliersDao();
		dao.saveSuppliers(supplier);
		return supplier;		
	}
	
	//for updating
	@PUT
	@Path("{SupplierID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	public void update(@PathParam("SupplierID")long supplierId,@PathParam("SupplierName") String supplName,
	@PathParam("ContactNr")String supplContactNr,@PathParam("Email")String supplEmail,@PathParam("Address")String supplAddress,
	@PathParam("AccountNr") long supplAccNr,@PathParam("BrachCode")long branchCode,
	@PathParam("BankName")String bankName,@PathParam("supplier")List<SupplierPayment> supplierPayments,@PathParam("servicesOffered")List<String> supplierServices) {
		
		
	
	
	//not sure wich 1 works best
	public void update(@QueryParam("SupplierID")long supplierId,@QueryParam("SupplierName") String supplName,
	@QueryParam("ContactNr")String supplContactNr,@QueryParam("Email")String supplEmail,@QueryParam("Address")String supplAddress,
	@QueryParam("AccountNr") long supplAccNr,@QueryParam("BrachCode")long branchCode,
	@QueryParam("BankName")String bankName,@QueryParam("supplier")List<SupplierPayment> supplierPayments,@QueryParam("servicesOffered")List<String> supplierServices) {
		
		dao = new SuppliersDao();
		dao.update(supplierId,supplName,supplContactNr,supplEmail,supplAddress,supplAccNr,branchCode, bankName,supplierPayments,supplierServices);
	}
	
	
	
	
	//for deleting
	
	@DELETE 
	@Path("{SupplierID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("SupplierID") Long supplierId) {
		dao = new SuppliersDao();
		dao.remove(supplierId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<Suppliers> findAll() {
	   dao = new SuppliersDao();
	  return dao.listSuppliers();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
*/