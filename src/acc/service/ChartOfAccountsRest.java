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

import acc.dao.ChartOfAccountsDao;
import acc.pojo.ChartOfAccounts;

@Path("/ChartOfAccounts")
public class ChartOfAccountsRest {

  ChartOfAccountsDao dao =null;
 @POST
 @Path("/Save")
 @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 public  ChartOfAccounts addChartOfAccounts( ChartOfAccounts accounts){
  dao = new ChartOfAccountsDao();
  dao.saveChartOfAccounts(accounts);
  return accounts;  
 }
 
 //for updating
 @PUT
 @Path("{Chart_Code}")
 @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
 @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 
 /*public void update(@PathParam("Chart_Code") long accountsId,@PathParam("Chart_Description") 
 String chartDescription,@PathParam("Chart_Type")String chartType ){
 */ 
 
 //not sure wich 1 works best
 public void update(@QueryParam("Chart_Code") long accountsId,@QueryParam("Chart_Description") 
 String chartDescription,@QueryParam("Chart_Type")String chartType ){
  
  dao = new ChartOfAccountsDao();
  dao.update(accountsId,chartDescription,chartType);
 }
 
 
 //for deleting
 
 @DELETE 
 @Path("{Chart_Code}")
 @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
 @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 public void remove(@PathParam("Chart_Code") Long accountId) {
  dao = new  ChartOfAccountsDao();
  dao.remove(accountId);
 }

 
 
//for retrieving
 
  @GET
  @Path("/Retrieve")
  @Produces({ MediaType.APPLICATION_JSON})
  public List< ChartOfAccounts> findAll() {
    dao = new  ChartOfAccountsDao();
   return dao.listChartOfAccounts();
  }
 
}