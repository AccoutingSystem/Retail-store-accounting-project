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

import acc.dao.StoreBalanceSheetDao;
import acc.pojo.StoreBalanceSheet;


@Path("/StoreBalanceSheet")
public class StoreBalanceSheetRest {

	StoreBalanceSheetDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public StoreBalanceSheet addStoreBalanceSheet(StoreBalanceSheet balance){
		dao = new StoreBalanceSheetDao();
		dao.saveStoreBalanceSheet(balance);
		return balance;		
	}
	
	//for updating
	@PUT
	@Path("{BalanceSheetID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	/*public void update(@PathParam("BalanceSheetID")long balanceId,@PathParam("CheckingAccounts") double checkingAcc,
	@PathParam("Investment")double investment ,@PathParam("AccountsReceivable")double accReceivable,
		@PathParam("AccountsPayable") double accPayable,@PathParam("LoansPayable")double loansPayable,
		@PathParam("SalariesPayable") double salariesPayable,@PathParam("TaxesPayable")double taxesPayable,
		@PathParam("OwnersEquity") double ownersEquity,@PathParam("Profit")double profit,@PathParam("Loss")double loss){
	    
	 * 
	 * 
	 * 
    
	*/
	
	//not sure wich 1 works best
	public void update(@QueryParam("BalanceSheetID")long balanceId,@QueryParam("CheckingAccounts") double checkingAcc,
	@QueryParam("Investment")double investment ,@QueryParam("AccountsReceivable")double accReceivable,
		@QueryParam("AccountsPayable") double accPayable,@QueryParam("LoansPayable")double loansPayable,
		@QueryParam("SalariesPayable") double salariesPayable,@QueryParam("TaxesPayable")double taxesPayable,
		@QueryParam("OwnersEquity") double ownersEquity,@QueryParam("Profit")double profit,@QueryParam("Loss")double loss){
	    
		
		dao = new StoreBalanceSheetDao();
		dao.update(balanceId,checkingAcc,investment,accReceivable,accPayable,loansPayable,salariesPayable,taxesPayable,ownersEquity,profit,loss);
	}
	
	
	//for deleting
	
	@DELETE 
	@Path("{BalanceSheetID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void remove(@PathParam("BalanceSheetID") Long balanceId) {
		dao = new StoreBalanceSheetDao();
		dao.remove(balanceId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<StoreBalanceSheet> findAll() {
	   dao = new StoreBalanceSheetDao();
	  return dao.listStoreBalanceSheet();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
