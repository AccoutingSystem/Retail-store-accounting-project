package acc.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * 
 * When are we meeeting guys
 * */
@Entity
@Table(name = "Customer")
public class Customer 
{
	@Id
	@GeneratedValue
	@Column(name = "CustomerID")
	private int custID;
	
	@Column(name = "CustomerName")
	private String custName;
	
	@Column(name = "CustomerSurname")
	private String custSurname;

	@Column(name = "CustomerAddress")
	private String custAddress;
	
	@Column(name = "ContactNr")
	private String contactNr;

	@Column(name = "Occupation")
	private String occupation;

	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "IdentityNr")
	private long idNr;

	@Column(name = "Income")
	private double income;

	@Column(name = "MonthlyExpences")
	private double monthlyExpenses;

	@Column(name = "BranchCode")
	private int branchCode;

	@Column(name = "BankName")
	private String bankName;

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
		int i, double d, double e, int j,
		String bankName, String email) {
	super();
	
	this.custName = custName;
	this.custSurname = custSurname;
	this.custAddress = custAddress;
	this.contactNr = contactNr;
	this.occupation = occupation;
	this.gender = gender;
	this.idNr = i;
	this.income = d;
	this.monthlyExpenses = e;
	this.branchCode = j;
	this.bankName = bankName;
	this.email = email;
}

public int getCustID() {
	return custID;
}

public void setCustID(int custID) {
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

public int getBranchCode() {
	return branchCode;
}

public void setBranchCode(int branchCode) {
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
