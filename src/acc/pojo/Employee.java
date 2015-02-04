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
	@Column(name = "BranchCode")
	private long brachCode;

	@XmlAttribute
	@Column(name = "BranchName")
	private String BranchName;

	@ManyToOne()
	@JoinColumn(name = "PayrollNumber")
	private PayrolExpenses payrolls;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "empPaid")	
	private List<StoreAccountsPayable> accountsPayable;
		
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "employee")
	private List<StoreSalesRecord> storeSalesRec;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "employees")
	private List<SupplierPayment> supplierPayments;
	
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
			List<StoreSalesRecord> storeSalesRec,
			List<SupplierPayment> supplierPayments) {
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
		this.supplierPayments = supplierPayments;
	}

	/**
	 * @return the empID
	 */
	public long getEmpID() {
		return empID;
	}

	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(long empID) {
		this.empID = empID;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empSurname
	 */
	public String getEmpSurname() {
		return empSurname;
	}

	/**
	 * @param empSurname the empSurname to set
	 */
	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}

	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}

	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	/**
	 * @return the empContactNr
	 */
	public String getEmpContactNr() {
		return empContactNr;
	}

	/**
	 * @param empContactNr the empContactNr to set
	 */
	public void setEmpContactNr(String empContactNr) {
		this.empContactNr = empContactNr;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the idNumber
	 */
	public long getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the taxNumber
	 */
	public String getTaxNumber() {
		return taxNumber;
	}

	/**
	 * @param taxNumber the taxNumber to set
	 */
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the empAccNr
	 */
	public long getEmpAccNr() {
		return empAccNr;
	}

	/**
	 * @param empAccNr the empAccNr to set
	 */
	public void setEmpAccNr(long empAccNr) {
		this.empAccNr = empAccNr;
	}

	/**
	 * @return the brachCode
	 */
	public long getBrachCode() {
		return brachCode;
	}

	/**
	 * @param brachCode the brachCode to set
	 */
	public void setBrachCode(long brachCode) {
		this.brachCode = brachCode;
	}

	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return BranchName;
	}

	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	/**
	 * @return the payrolls
	 */
	public PayrolExpenses getPayrolls() {
		return payrolls;
	}

	/**
	 * @param payrolls the payrolls to set
	 */
	public void setPayrolls(PayrolExpenses payrolls) {
		this.payrolls = payrolls;
	}

	/**
	 * @return the accountsPayable
	 */
	public List<StoreAccountsPayable> getAccountsPayable() {
		return accountsPayable;
	}

	/**
	 * @param accountsPayable the accountsPayable to set
	 */
	public void setAccountsPayable(List<StoreAccountsPayable> accountsPayable) {
		this.accountsPayable = accountsPayable;
	}

	/**
	 * @return the storeSalesRec
	 */
	public List<StoreSalesRecord> getStoreSalesRec() {
		return storeSalesRec;
	}

	/**
	 * @param storeSalesRec the storeSalesRec to set
	 */
	public void setStoreSalesRec(List<StoreSalesRecord> storeSalesRec) {
		this.storeSalesRec = storeSalesRec;
	}

	/**
	 * @return the supplierPayments
	 */
	public List<SupplierPayment> getSupplierPayments() {
		return supplierPayments;
	}

	/**
	 * @param supplierPayments the supplierPayments to set
	 */
	public void setSupplierPayments(List<SupplierPayment> supplierPayments) {
		this.supplierPayments = supplierPayments;
	}

}
