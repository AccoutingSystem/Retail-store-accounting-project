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
import acc.dao.AccountsPayableDao;
import acc.pojo.AccountsPayable;

@Path("/AccountsPayable")
public class AccountsPayableRest {
 AccountsPayableDao dao =null;
  @POST
  @Path("/Save")
  @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
     @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  public  AccountsPayable addAccountsPayables(AccountsPayable payable){
   dao = new AccountsPayableDao();
   dao.saveAccountsPayables(payable);
   return payable;  
  }
  
  //for updating
  @PUT
  @Path("{Folio_Number}")
  @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  
 /* public void update(@PathParam("Folio_Number") long folioNr,@PathParam("Amount_Paid") 
   double amount,@PathParam("Payment_Date") Date paymentDate,@PathParam("Payment_Type")String paymentType ){
  */
  //not sure wich 1 works best
  public void update(@QueryParam("Folio_Number") long folioNr,@QueryParam("Amount_Paid") 
   double amount,@QueryParam("Payment_Date") Date paymentDate,@QueryParam("Payment_Type")String paymentType ){
   
   dao = new AccountsPayableDao();
   dao.update(folioNr, amount,paymentDate,paymentType);
  }
  
  
  //for deleting
  
  @DELETE 
  @Path("{Folio_Number}")
  @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  public void remove(@PathParam("Folio_Number") Long payableId) {
   dao = new  AccountsPayableDao();
   dao.remove(payableId);
  }

  
  
 //for retrieving
  
   @GET
   @Path("/Retrieve")
   @Produces({ MediaType.APPLICATION_JSON})
   public List<AccountsPayable> findAll() {
     dao = new AccountsPayableDao();
    return dao.listAccountsPayables();
   }

}
