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

import acc.dao.StoreSalesRecordDao;
import acc.pojo.Employee;
import acc.pojo.Sales;
import acc.pojo.StoreSalesRecord;

@Path("/StoreSalesRecord")
public class StoreSalesRecordRest {

	StoreSalesRecordDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public StoreSalesRecord addStoreSalesRecord(StoreSalesRecord record){
		dao = new StoreSalesRecordDao();
		dao.saveStoreSalesRecord(record);
		return record;		
	}
	
	//for updating
	@PUT
	@Path("{SalesRecordID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	public void update(@PathParam("SalesRecordID") long recordId,Path@Param("SalesAmounts") 
	double deptSalesAmounts,@PathParam("SalesRecordDate")Date salesRecDate ,
    @PathParam("EmployeeID")Employee employee,@PathParam("SalesID")Sales sales){
	 * 
	 * *
	
	
	//not sure wich 1 works best
	public void update(@QueryParam("SalesRecordID") long recordId,@QueryParam("SalesAmounts") 
	double deptSalesAmounts,@QueryParam("SalesRecordDate")Date salesRecDate ,
    @QueryParam("EmployeeID")Employee employee,@QueryParam("SalesID")Sales sales){
		
		
		dao = new StoreSalesRecordDao();
		dao.update(recordId,deptSalesAmounts,salesRecDate,employee,sales);
	}
	
	 
	
	
	
	
	//for deleting
	
	@DELETE 
	@Path("{SalesRecordID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("SalesRecordID") Long recordId) {
		dao = new StoreSalesRecordDao();
		dao.remove(recordId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<StoreSalesRecord> findAll() {
	   dao = new StoreSalesRecordDao();
	  return dao.listStoreSalesRecords();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
*/