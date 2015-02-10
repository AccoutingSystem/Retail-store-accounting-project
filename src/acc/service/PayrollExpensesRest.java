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

import acc.dao.PayrollExpensesDao;
import acc.pojo.Employee;
import acc.pojo.PayrolExpenses;

@Path("/PayrollExpenses")
public class PayrollExpensesRest {
	

	PayrollExpensesDao dao =null;
	@POST
	@Path("/Save")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public PayrolExpenses addPayrollExpenses(PayrolExpenses payroll){
		dao = new PayrollExpensesDao();
		dao.savePayrollExpenses(payroll);
		return payroll;		
	}
	
	//for updating
	@PUT
	@Path("{PayrollNumber}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	/*public void update(@PathParam("PayrollNumber") long payrollId,@PathParam("Benefits") 
	String benefits,@PathParam("SalaryRatings")double salaryRatings,@PathParam("WageRatings")double wageRatings,
	@PathParam("Bonuses") double bonuses,@PathParam("Leaves")String leave,@PathParam("TelephoneExpenses")double telExpenses ,@PathParam("payrolls") List<Employee> payrolExpense){
	 * 
	 * 
	*/
	//not sure wich 1 works best
	public void update(@QueryParam("PayrollNumber") long payrollId,@QueryParam("Benefits") 
	String benefits,@QueryParam("SalaryRatings")double salaryRatings,@QueryParam("WageRatings")double wageRatings,
	@QueryParam("Bonuses") double bonuses,@QueryParam("Leaves")String leave,@QueryParam("TelephoneExpenses")double telExpenses ,@QueryParam("payrolls") List<Employee> payrolExpense){
		
		
		dao = new PayrollExpensesDao();
		dao.update(payrollId, benefits,salaryRatings,wageRatings,bonuses,leave, telExpenses,payrolExpense);
	}
	
	
	//for deleting
	
	@DELETE 
	@Path("{PayrollNumber}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("PayrollNumber") Long payrollId) {
		dao = new PayrollExpensesDao();
		dao.remove(payrollId);
	}

	
	
//for retrieving
	
	 @GET
	 @Path("/Retrieve")
	 @Produces({ MediaType.APPLICATION_JSON})
	 public List<PayrolExpenses> findAll() {
	   dao = new PayrollExpensesDao();
	  return dao.listPayrollExpenses();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
