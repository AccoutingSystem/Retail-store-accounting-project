package acc.service;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Helper.HashCreator;
import acc.dao.AccountsReceivableDao;
import acc.dao.EmployeeDao;
import acc.pojo.AccountsReceivable;
import acc.pojo.Employee;

@Path("/Employee")
public class EmployeeRest {

	EmployeeDao dao = null;

	@POST
	@Path("/Save")
	@Produces(MediaType.TEXT_HTML)
	public void addEmployee(Employee employee) throws NoSuchAlgorithmException,
			InvalidKeySpecException {

		System.out.println("45454545454545454545454545454");
		// dao = new EmployeeDao();
		// dao.saveEmployee(employee);
		// salt code
		dao = new EmployeeDao();
		String saltedPassword = HashCreator.createHash(employee.getPassword());
		employee.setPassword(saltedPassword);
		dao.saveEmployee(employee);

	}

}
