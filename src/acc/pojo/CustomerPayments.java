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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@Entity
@Table(name = "CustomerPayments")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerPayments {

	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "PaymentID")
	private long paymentID;
	
	@XmlAttribute
	@Column(name = "Date")
	private Date date;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "cusPayment")
	private List<AccountPayment> accountsPaid;
	
	
	public CustomerPayments() {
		super();
	}

	public CustomerPayments(Date date) {
		super();
		this.date = date;
	}

	public CustomerPayments(Date date, List<AccountPayment> accountsPaid) {
		super();
		this.date = date;
		this.accountsPaid = accountsPaid;
	}

	public long getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(long paymentID) {
		this.paymentID = paymentID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<AccountPayment> getAccountsPaid() {
		return accountsPaid;
	}

	public void setAccountsPaid(List<AccountPayment> accountsPaid) {
		this.accountsPaid = accountsPaid;
	}	
	
}
*/