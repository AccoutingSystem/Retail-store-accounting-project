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

import acc.dao.StoreAccountDao;
import acc.pojo.StoreAccount;
import acc.pojo.StoreAccountsPayable;


@Path("/StoreAccount")
public class StoreAccountRest {
	
	
	StoreAccountDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public StoreAccount addStoreAccounts(StoreAccount account){
		dao = new StoreAccountDao();
		dao.saveStoreAccount(account);
		return account;		
	}
	
	//for updating
	@PUT
	@Path("{StoreAccountID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	/*public void update(@PathParam("StoreAccountID") long accountId,@PathParam("StoreName") 
	String storeName,@PathParam("FixedPayment") double initialPayment,@PathParam("storeAcc ")  List<StoreAccountsPayable> storeAccounts){
    
	*/
	
	//not sure wich 1 works best
	public void update(@QueryParam("StoreAccountID") long accountId,@QueryParam("StoreName") 
	String storeName,@QueryParam("FixedPayment") double initialPayment,@QueryParam("storeAcc")  List<StoreAccountsPayable> storeAccounts){
    
		dao = new StoreAccountDao();
		dao.update(accountId, storeName,initialPayment,storeAccounts);
	}
	
	
	//for deleting
	
	@DELETE 
	@Path("{StoreAccountID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void remove(@PathParam("StoreAccountID") Long accountId) {
		dao = new StoreAccountDao();
		dao.remove(accountId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<StoreAccount> findAll() {
	   dao = new StoreAccountDao();
	  return dao.listStoreAccount();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
