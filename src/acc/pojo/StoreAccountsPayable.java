package acc.pojo;

import java.util.Date;

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

/*The bridge table StoreAccountsPayable for Employee and StoreAccount tables*/
@XmlRootElement
@Entity
@Table(name = "StoreAccountsPayable")
@XmlAccessorType(XmlAccessType.FIELD)
public class StoreAccountsPayable {
	
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "AccPayableID")
	private long accPaymentID;
	
	@XmlAttribute
	@Column(name = "AccountType")
	private String accType;
	
	@XmlAttribute
	@Column(name = "PayableAmount")
	private double payableAmount;
	
	@XmlAttribute
	@Column(name = "PaymentDate")
	private Date paymentDate;
	
	@ManyToOne()
	@JoinColumn(name = "EmployeeID")
	private Employee empPaid;
	
	@ManyToOne()
	@JoinColumn(name = "StoreAccountID")
	private StoreAccount storeAcc;
	
	public StoreAccountsPayable() {
		super();
	}

	public StoreAccountsPayable(String accType,
			double amount, Date paymentDate, Employee empPaid) {
		super();
		this.accType = accType;
		this.payableAmount = amount;
		this.paymentDate = paymentDate;
		this.empPaid = empPaid;
	}

	/**
	 * @return the accPaymentID
	 */
	public long getAccPaymentID() {
		return accPaymentID;
	}

	/**
	 * @param accPaymentID the accPaymentID to set
	 */
	public void setAccPaymentID(long accPaymentID) {
		this.accPaymentID = accPaymentID;
	}

	/**
	 * @return the accType
	 */
	public String getAccType() {
		return accType;
	}

	/**
	 * @param accType the accType to set
	 */
	public void setAccType(String accType) {
		this.accType = accType;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return payableAmount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.payableAmount = amount;
	}

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the empPaid
	 */
	public Employee getEmpPaid() {
		return empPaid;
	}

	/**
	 * @param empPaid the empPaid to set
	 */
	public void setEmpPaid(Employee empPaid) {
		this.empPaid = empPaid;
	}
	
}
