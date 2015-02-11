/*package acc.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@Entity
@Table(name = "CustomerAccount")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerAccount {
	
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "AccountID")
   // @GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="customer"))
	private long accID;
	
	@XmlAttribute
	@Column(name = "CustomerBalance")
	private double custbalance;

	@XmlAttribute
	@Column(name = "Installment")
	private double installment;

	@XmlAttribute
	@Column(name = "Credit")
	private double custCredit;

	@XmlAttribute
	@Column(name = "Date")
	private Date date;

	@XmlAttribute
	@Column(name = "InterestRate")
	private double interestRate;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "cusAccount")	
	private List<AccountPayment> accountsPaid;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Customer customer;
	
	public CustomerAccount() {
		super();
	}
	
	public CustomerAccount(double custbalance, double installment,
			double custCredit, Date date, double interestRate) {
		super();

		this.custbalance = custbalance;
		this.installment = installment;
		this.custCredit = custCredit;
		this.date = date;
		this.interestRate = interestRate;
	}
	
	public CustomerAccount( double custbalance, double installment,
			double custCredit, Date date, double interestRate, Customer customer) {
		super();
		
		this.custbalance = custbalance;
		this.installment = installment;
		this.custCredit = custCredit;
		this.date = date;
		this.interestRate = interestRate;
		this.customer = customer;
	}


	public long getAccID() {
		return accID;
	}


	public void setAccID(long accID) {
		this.accID = accID;
	}


	public double getCustbalance() {
		return custbalance;
	}


	public void setCustbalance(double custbalance) {
		this.custbalance = custbalance;
	}


	public double getInstallment() {
		return installment;
	}


	public void setInstallment(double installment) {
		this.installment = installment;
	}


	public double getCustCredit() {
		return custCredit;
	}


	public void setCustCredit(double custCredit) {
		this.custCredit = custCredit;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
}

*/