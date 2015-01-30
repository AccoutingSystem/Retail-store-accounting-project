package acc.pojo;
/*
 * 
 * When are we meeeting guys
 * */
@Entity //creating entity kebo
@Table(name = "Customer")
public class Customer {
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
	private String idNr;

	@Column(name = "Income")
	private String income;

	@Column(name = "MonthlyExpences")
	private String monthlyExpenses;

	@Column(name = "AccountNr")
	private String accNr;

	@Column(name = "BranchCode")
	private String branchCode;

	@Column(name = "BankName")
	private String bankName;
/*
	@Column(name = "AccountID")
	private String accID;*/

	@Column(name = "E-mail")
	private String email;
	
public Customer() {
	super();
}

public Customer(int custID, String custName, String custSurname,
		String custAddress, String contactNr, String occupation, String gender,
		String idNr, String income, String monthlyExpenses, String accNr,
		String branchCode, String bankName, String email) {
	super();
	this.custID = custID;
	this.custName = custName;
	this.custSurname = custSurname;
	this.custAddress = custAddress;
	this.contactNr = contactNr;
	this.occupation = occupation;
	this.gender = gender;
	this.idNr = idNr;
	this.income = income;
	this.monthlyExpenses = monthlyExpenses;
	this.accNr = accNr;
	this.branchCode = branchCode;
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

public String getIdNr() {
	return idNr;
}

public void setIdNr(String idNr) {
	this.idNr = idNr;
}

public String getIncome() {
	return income;
}

public void setIncome(String income) {
	this.income = income;
}

public String getMonthlyExpenses() {
	return monthlyExpenses;
}

public void setMonthlyExpenses(String monthlyExpenses) {
	this.monthlyExpenses = monthlyExpenses;
}

public String getAccNr() {
	return accNr;
}

public void setAccNr(String accNr) {
	this.accNr = accNr;
}

public String getBranchCode() {
	return branchCode;
}

public void setBranchCode(String branchCode) {
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


	
	
	
	
	

}
