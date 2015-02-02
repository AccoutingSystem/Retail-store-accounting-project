package acc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "AccountPayment")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountPayment {
	
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "AccountPaymentID")
	private long accPaymentID;
	
	@XmlAttribute
	@Column(name = "Amount")
	private double amount;
	
	@ManyToOne()
	@JoinColumn(name = "AccountID")
	private CustomerAccount cusAccount;
	
	@ManyToOne()
	@JoinColumn(name = "PaymentID")
	private CustomerPayments cusPayment;

	public AccountPayment() {
		super();
	}

	public AccountPayment( double amount) {
		super();
		this.amount = amount;
	}

	public AccountPayment(double amount,
			CustomerAccount cusAccount, CustomerPayments cusPayment) {
		super();
		this.amount = amount;
		this.cusAccount = cusAccount;
		this.cusPayment = cusPayment;
	}

	public long getAccPaymentID() {
		return accPaymentID;
	}

	public void setAccPaymentID(long accPaymentID) {
		this.accPaymentID = accPaymentID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public CustomerAccount getCusAccount() {
		return cusAccount;
	}

	public void setCusAccount(CustomerAccount cusAccount) {
		this.cusAccount = cusAccount;
	}

	public CustomerPayments getCusPayment() {
		return cusPayment;
	}

	public void setCusPayment(CustomerPayments cusPayment) {
		this.cusPayment = cusPayment;
	}
	
	
	
}
