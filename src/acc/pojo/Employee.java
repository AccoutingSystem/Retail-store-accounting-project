package acc.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "Employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "EmployeeID")
	private long empID;
	
	@XmlAttribute
	@Column(name = "EmployeeName")
	private String empName;
	
	@XmlAttribute
	@Column(name = "EmployeeSurname")
	private String empSurname;
	
	@XmlAttribute
	@Column(name = "EmployeeAddress")
	private String empAddress;
	
	@XmlAttribute
	@Column(name = "ContactNr")
	private String empContactNr;
	
	@XmlAttribute
	@Column(name = "JobTitle")
	private String jobTitle;
	
	@XmlAttribute
	@Column(name = "StartDate")
	private Date startDate;
	
	@XmlAttribute
	@Column(name = "IDNumber")
	private long idNumber;

	@XmlAttribute
	@Column(name = "Gender")
	private String gender;

	@XmlAttribute
	@Column(name = "Race")
	private String race;

	@XmlAttribute
	@Column(name = "Email")
	private String email;

	@XmlAttribute
	@Column(name = "Password")
	private String password;

	@XmlAttribute
	@Column(name = "TaxNumber")
	private String taxNumber;

	@XmlAttribute
	@Column(name = "Qualification")
	private String qualification;

	@XmlAttribute
	@Column(name = "AccountNr")
	private long empAccNr;

	@XmlAttribute
	@Column(name = "EmployeeName")
	private long brachCode;

	@XmlAttribute
	@Column(name = "EmployeeName")
	private String BranchName;

	@ManyToOne()
	@JoinColumn(name = "PayrollNumber")
	private PayrolExpenses payrolls;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "accPayable")	
	private List<StoreAccountsPayable> accountsPayable;
		
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "storeSalesRec")
	private List<StoreSalesRecord> storeSalesRec;
	
	public Employee() {
		super();
	}

	public Employee(String empName, String empSurname, String empAddress,
			String empContactNr, String jobTitle, Date startDate,
			long idNumber, String gender, String race, String email,
			String password, String taxNumber, String qualification,
			long empAccNr, long brachCode, String branchName,
			PayrolExpenses payrolls,
			List<StoreAccountsPayable> accountsPayable,
			List<StoreSalesRecord> storeSalesRec) {
		super();
		this.empName = empName;
		this.empSurname = empSurname;
		this.empAddress = empAddress;
		this.empContactNr = empContactNr;
		this.jobTitle = jobTitle;
		this.startDate = startDate;
		this.idNumber = idNumber;
		this.gender = gender;
		this.race = race;
		this.email = email;
		this.password = password;
		this.taxNumber = taxNumber;
		this.qualification = qualification;
		this.empAccNr = empAccNr;
		this.brachCode = brachCode;
		BranchName = branchName;
		this.payrolls = payrolls;
		this.accountsPayable = accountsPayable;
		this.storeSalesRec = storeSalesRec;
	}


	public long getEmpID() {
		return empID;
	}


	public void setEmpID(long empID) {
		this.empID = empID;
	}


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


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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


	public String getTaxNumber() {
		return taxNumber;
	}


	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public long getEmpAccNr() {
		return empAccNr;
	}


	public void setEmpAccNr(long empAccNr) {
		this.empAccNr = empAccNr;
	}


	public long getBrachCode() {
		return brachCode;
	}


	public void setBrachCode(long brachCode) {
		this.brachCode = brachCode;
	}


	public String getBranchName() {
		return BranchName;
	}


	public void setBranchName(String branchName) {
		BranchName = branchName;
	}


	public PayrolExpenses getPayrolls() {
		return payrolls;
	}


	public void setPayrolls(PayrolExpenses payrolls) {
		this.payrolls = payrolls;
	}


	public List<StoreAccountsPayable> getAccountsPayable() {
		return accountsPayable;
	}


	public void setAccountsPayable(List<StoreAccountsPayable> accountsPayable) {
		this.accountsPayable = accountsPayable;
	}


	public List<StoreSalesRecord> getStoreSalesRec() {
		return storeSalesRec;
	}


	public void setStoreSalesRec(List<StoreSalesRecord> storeSalesRec) {
		this.storeSalesRec = storeSalesRec;
	}

}
