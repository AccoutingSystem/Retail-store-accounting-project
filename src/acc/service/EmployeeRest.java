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

import acc.dao.EmployeeDao;
import acc.pojo.Employee;
import acc.pojo.PayrolExpenses;
import acc.pojo.StoreAccountsPayable;
import acc.pojo.StoreSalesRecord;
@Path("/Employee")
public class EmployeeRest {
	

	EmployeeDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Employee addEmployee(Employee employee){
		dao = new EmployeeDao();
		dao.saveEmployee(employee);
		return employee;		
	}
	
	//for updating
	@PUT
	@Path("{EmployeeID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	/*public void update(@PathParam("EmployeeID")int custId,@PathParam("CustomerName") 
    String custName,@PathParam("CustomerSurname") String custSurname,
    @PathParam("CustomerAddress")String custAddress,@PathParam("ContactNr") 
    String contactNr,@PathParam("Occupation") String occupation,@PathParam("Gender") 
	String gender,@PathParam("IdentityNr") String idNr,@PathParam("Income") String income,@PathParam("MonthlyExpences") String monthlyExpenses,
	@PathParam("BranchCode") String  branchCode,@PathParam("BankName") String bankName,@PathParam("E-mail") String email) {
	*/
	//not sure wich 1 works best
	public void update(@QueryParam("EmployeeID") long empId,@QueryParam("EmployeeName") 
    String empName,@QueryParam("EmployeeSurname") String empSurname,
    @QueryParam("EmployeeAddress")String empAddress,@QueryParam("ContactNr") 
    String contactNr,@QueryParam("JobTitle") String jobTitle,@QueryParam("StartDate") 
	Date startDate,@QueryParam("IDNumber") long idNr,@QueryParam("Gender")String gender,@QueryParam("Email") String email,
	@QueryParam("Password")String password ,@QueryParam("TaxNumber") String taxNumber,@QueryParam("Qualification") String qualification,
	@QueryParam("AccountNr")long empAccNr ,@QueryParam("BranchCode")long brachCode,@QueryParam("BranchName") String branchName,
	@QueryParam("PayrollNumber")PayrolExpenses payrolls,@QueryParam("empPaid")	List<StoreAccountsPayable> accountsPayable,@QueryParam("empSalesRec")List<StoreSalesRecord> storeSalesRec){
		
		
		dao = new EmployeeDao();
		dao.update(empId,empName,empSurname,empAddress,contactNr,jobTitle,startDate,idNr, gender,email,password, taxNumber,qualification, empAccNr, brachCode,branchName, payrolls,accountsPayable,storeSalesRec);
	}
	
	
	//for deleting
	
	@DELETE 
	@Path("{EmployeeID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("EmployeeID") Long empId) {
		dao = new EmployeeDao();
		dao.remove(empId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<Employee> findAll() {
	   dao = new EmployeeDao();
	  return dao.listEmployees();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
