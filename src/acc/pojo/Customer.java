/*package acc.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


 * 
 * When are we meeeting guys
 * 
@XmlRootElement
@Entity
@Table(name = "Customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer 
{
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "CustomerID")
	private long custID;
	
	@XmlAttribute
	@Column(name = "CustomerName")
	private String custName;
	
	@XmlAttribute
	@Column(name = "CustomerSurname")
	private String custSurname;

	@XmlAttribute
	@Column(name = "CustomerAddress")
	private String custAddress;
	
	@XmlAttribute
	@Column(name = "ContactNr")
	private String contactNr;

	@XmlAttribute
	@Column(name = "Occupation")
	private String occupation;

	@XmlAttribute
	@Column(name = "Gender")
	private String gender;
	
	@XmlAttribute
	@Column(name = "IdentityNr")
	private long idNr;

	@XmlAttribute
	@Column(name = "Income")
	private double income;

	@XmlAttribute
	@Column(name = "MonthlyExpences")
	private double monthlyExpenses;

	@XmlAttribute
	@Column(name = "BranchCode")
	private long branchCode;

	@XmlAttribute
	@Column(name = "BankName")
	private String bankName;

	@XmlAttribute
	@Column(name = "Email")
	private String email;
	
	//@Column(name = "AccountNr")
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL)
	private CustomerAccount custAccount;
	
public Customer() {
	super();
}

public Customer( String custName, String custSurname,
		String custAddress, String contactNr, String occupation, String gender,
		long idNr, double income, double monthlyExpenses, long branchCode,
		String bankName, String email) {
	super();
	
	this.custName = custName;
	this.custSurname = custSurname;
	this.custAddress = custAddress;
	this.contactNr = contactNr;
	this.occupation = occupation;
	this.gender = gender;
	this.idNr = idNr;
	this.income = income;
	this.monthlyExpenses = monthlyExpenses;
	this.branchCode = branchCode;
	this.bankName = bankName;
	this.email = email;
}

public long getCustID() {
	return custID;
}

public void setCustID(long custID) {
	this.custID = custID;
}

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public String getCustSurname() {
	return custSurname;
}

public void setCustSurname(String custSurname) {
	this.custSurname = custSurname;
}

public String getCustAddress() {
	return custAddress;
}

public void setCustAddress(String custAddress) {
	this.custAddress = custAddress;
}

public String getContactNr() {
	return contactNr;
}

public void setContactNr(String contactNr) {
	this.contactNr = contactNr;
}

public String getOccupation() {
	return occupation;
}

public void setOccupation(String occupation) {
	this.occupation = occupation;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public long getIdNr() {
	return idNr;
}

public void setIdNr(long idNr) {
	this.idNr = idNr;
}

public double getIncome() {
	return income;
}

public void setIncome(double income) {
	this.income = income;
}

public double getMonthlyExpenses() {
	return monthlyExpenses;
}

public void setMonthlyExpenses(double monthlyExpenses) {
	this.monthlyExpenses = monthlyExpenses;
}

public long getBranchCode() {
	return branchCode;
}

public void setBranchCode(long branchCode) {
	this.branchCode = branchCode;
}

public String getBankName() {
	return bankName;
}

public void setBankName(String bankName) {
	this.bankName = bankName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public CustomerAccount getCustAccount() {
	return custAccount;
}

public void setCustAccount(CustomerAccount custAccount) {
	this.custAccount = custAccount;
}



}
*/