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

import acc.dao.SalesDao;
import acc.pojo.Sales;
import acc.pojo.StoreSalesRecord;

@Path("/Sales")
public class SalesRest {

	SalesDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Sales addSales(Sales sales){
		dao = new SalesDao();
		dao.saveSales(sales);
		return sales;		
	}
	
	//for updating
	@PUT
	@Path("{SalesID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	public void update(@PathParam("SalesID") long salesId,@PathParam("SalesDepartment") 
	String salesDepartment,@PathParam("sales") List<StoreSalesRecord> storeSales){
	
	
	//not sure wich 1 works best
	public void update(@QueryParam("SalesID") long salesId,@QueryParam("SalesDepartment") 
	String salesDepartment,@QueryParam("sales") List<StoreSalesRecord> storeSales){
    
		dao = new SalesDao();
		dao.update(salesId, salesDepartment,storeSales);
	}

		
	
	//for deleting
	
	@DELETE 
	@Path("{SalesID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("SalesID") Long salesId) {
		dao = new SalesDao();
		dao.remove(salesId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<Sales> findAll() {
	   dao = new SalesDao();
	  return dao.listSales();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/