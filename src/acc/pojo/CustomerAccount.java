package acc.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class CustomerAccount {
	
	@Id
	@GeneratedValue
	@Column(name = "AccountID")
	private int accID;
	
	@Column(name = "CustomerBalance")
	private String custbalance;

	@Column(name = "Installment")
	private String installment;

	@Column(name = "Credit")
	private String custCredit;

	@Column(name = "Date")
	private Date date;

	@Column(name = "InterestRate")
	private String interestRate;
	
	//@Column(name = "CustomerID")
	@OneToOne()
	@PrimaryKeyJoinColumn
	private Customer customer;
	

	public CustomerAccount() {
		super();
	}

	public CustomerAccount(String custbalance, String installment,
			String custCredit, Date date, String interestRate) {
		super();
		
		this.custbalance = custbalance;
		this.installment = installment;
		this.custCredit = custCredit;
		this.date = date;
		this.interestRate = interestRate;
	}

	public CustomerAccount( String custbalance, String installment,
			String custCredit, Date date, String interestRate, Customer customer) {
		super();
		
		this.custbalance = custbalance;
		this.installment = installment;
		this.custCredit = custCredit;
		this.date = date;
		this.interestRate = interestRate;
		this.customer = customer;
	}

	public String getCustbalance() {
		return custbalance;
	}


	public void setCustbalance(String custbalance) {
		this.custbalance = custbalance;
	}


	public String getInstallment() {
		return installment;
	}


	public void setInstallment(String installment) {
		this.installment = installment;
	}


	public String getCustCredit() {
		return custCredit;
	}


	public void setCustCredit(String custCredit) {
		this.custCredit = custCredit;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
