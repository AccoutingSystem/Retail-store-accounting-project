package acc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlAttribute;

@XmlRootElement
@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "EmployeeID")
	private long empID;

	@Column(name = "EmployeeName")
	private String empName;

	@Column(name = "EmployeeSurname")
	private String empSurname;

	@Column(name = "EmployeeAddress")
	private String empAddress;

	@Column(name = "ContactNr")
	private String empContactNr;

	@Column(name = "IDNumber")
	private long idNumber;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "Race")
	private String race;

	@Column(name = "Email")
	private String email;

	@Column(name = "Password")
	private String password;
	
	// default constructor
	public Employee() {
		super();
	}
	
	// constructor
	public Employee(String empName, String empSurname, String empAddress,
			String empContactNr, long idNumber, String gender, String race,
			String email, String password) {
		super();
		this.empName = empName;
		this.empSurname = empSurname;
		this.empAddress = empAddress;
		this.empContactNr = empContactNr;
		this.idNumber = idNumber;
		this.gender = gender;
		this.race = race;
		this.email = email;
		this.password = password;
	}
	
	// getters & setters
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSurname() {
		return empSurname;
	}

	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpContactNr() {
		return empContactNr;
	}

	public void setEmpContactNr(String empContactNr) {
		this.empContactNr = empContactNr;
	}

	public long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}