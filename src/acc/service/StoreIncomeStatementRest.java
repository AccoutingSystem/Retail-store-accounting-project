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

import acc.dao.StoreIncomeStatementDao;
import acc.pojo.StoreIncomeStatement;
@Path("/StoreIncomeStatement")
public class StoreIncomeStatementRest {
	
	StoreIncomeStatementDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public StoreIncomeStatement addStoreIncomeStatement(StoreIncomeStatement statement){
		dao = new StoreIncomeStatementDao();
		dao.StoreIncomeStatement(statement);
		return statement;
	}
	
	//for updating
	@PUT
	@Path("{StoreIncomeStatementID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	/*public void update(@PathParam("StoreIncomeStatementID")long statementId,@PathParam("SalesIncome")double salesIncome,
	@PathParam("Investment")double investment ,@PathParam("OfficeSupplies")double officeSupplies,
		@PathParam("TelephoneExpenses") double telExpenses,@PathParam("Utilities")double utilities,
		@PathParam("Maintenance") double maintenance,@PathParam("Insurance")double insurance,
		@PathParam("MiscellaneousExpenses") double miscellExpenses,@PathParam("TravelNIntertainment")double travNIntertain,@PathParam("BankCharges")double bankCharges,
		@PathParam("TaxExpenses")double taxExpenses){
    
	*/
	
	//not sure wich 1 works best
	public void update(@QueryParam("StoreIncomeStatementID")long statementId,@QueryParam("SalesIncome")double salesIncome,
	@QueryParam("Investment")double investment ,@QueryParam("OfficeSupplies")double officeSupplies,
		@QueryParam("TelephoneExpenses") double telExpenses,@QueryParam("Utilities")double utilities,
		@QueryParam("Maintenance") double maintenance,@QueryParam("Insurance")double insurance,
		@QueryParam("MiscellaneousExpenses") double miscellExpenses,@QueryParam("TravelNIntertainment")double travNIntertain,@QueryParam("BankCharges")double bankCharges,
		@QueryParam("TaxExpenses")double taxExpenses){
	    
		
		dao = new StoreIncomeStatementDao();
		dao.update(statementId,salesIncome,investment,officeSupplies,telExpenses,utilities,maintenance,insurance,miscellExpenses,travNIntertain,bankCharges,taxExpenses);
	}
	
	
	
	//for deleting
	
	@DELETE 
	@Path("{StoreIncomeStatementID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void remove(@PathParam("StoreIncomeStatementID") Long statementId) {
		dao = new StoreIncomeStatementDao();
		dao.remove(statementId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<StoreIncomeStatement> findAll() {
	   dao = new StoreIncomeStatementDao();
	  return dao.listStoreIncomeStatement();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
