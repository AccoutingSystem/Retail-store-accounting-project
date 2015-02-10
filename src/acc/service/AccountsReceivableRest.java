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

import acc.dao.AccountsReceivableDao;
import acc.pojo.AccountsReceivable;

@Path("/AccountsReceivable")
public class AccountsReceivableRest {
 AccountsReceivableDao dao =null;
 @POST
 @Path("/Save")
 @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 public  AccountsReceivable addAccountsReceivables(AccountsReceivable receivable){
  dao = new AccountsReceivableDao();
  dao.saveAccountsReceivables(receivable);
  return receivable;  
 }
 
 //for updating
 @PUT
 @Path("{Folio_Number}")
 @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
 @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 
/* public void update(@PathParam("Folio_Number") long folioNr,@PathParam("Amount_Received") 
  double amount,@PathParam("Receivable_Date")Date receivablesDate,@PathParam("Receivable_Type")String receivableType){
  
 */
 //not sure wich 1 works best
 public void update(@QueryParam("Folio_Number") long folioNr,@QueryParam("Amount_Received") 
  double amount,@QueryParam("Receivable_Date")Date receivablesDate,@QueryParam("Receivable_Type")String receivableType){
  
  dao = new AccountsReceivableDao();
  dao.update(folioNr, amount,receivablesDate,receivableType);
 }
 
 
 //for deleting
 
 @DELETE 
 @Path("{Folio_Number}")
 @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
 @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 public void remove(@PathParam("Folio_Number") Long receivableId) {
  dao = new  AccountsReceivableDao();
  dao.remove(receivableId);
 }

 
 
//for retrieving
 
  @GET
  @Path("/Retrieve")
  @Produces({ MediaType.APPLICATION_JSON})
  public List<AccountsReceivable> findAll() {
    dao = new AccountsReceivableDao();
   return dao.listAccountsReceivables();
  }

}