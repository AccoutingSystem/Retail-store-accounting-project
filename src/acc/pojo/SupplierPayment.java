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

/*The class SupplierPayment */
@XmlRootElement
@Entity
@Table(name = "SupplierPayment")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplierPayment {
	
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "SupplierPaymentID")
	private long supplPaymentID;
	
	@XmlAttribute
	@Column(name = "PaymentDate")
	private Date paymentDate;
	
	@XmlAttribute
	@Column(name = "AmountPaid")
	private double amountPaid;
	
	@ManyToOne()
	@JoinColumn(name ="SupplierID")
	private Suppliers supplier;

	@ManyToOne()
	@JoinColumn(name ="EmployeeID")
	private Employee employees;	
	
	public SupplierPayment() {
		super();
	}

	public SupplierPayment(Date paymentDate, double amountPaid,
			Suppliers supplier, Employee employees) {
		super();
		this.paymentDate = paymentDate;
		this.amountPaid = amountPaid;
		this.supplier = supplier;
		this.employees = employees;
	}

	/**
	 * @return the supplPaymentID
	 */
	public long getSupplPaymentID() {
		return supplPaymentID;
	}

	/**
	 * @param supplPaymentID the supplPaymentID to set
	 */
	public void setSupplPaymentID(long supplPaymentID) {
		this.supplPaymentID = supplPaymentID;
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
	 * @return the amountPaid
	 */
	public double getAmountPaid() {
		return amountPaid;
	}

	/**
	 * @param amountPaid the amountPaid to set
	 */
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	/**
	 * @return the supplier
	 */
	public Suppliers getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Suppliers supplier) {
		this.supplier = supplier;
	}

	/**
	 * @return the employees
	 */
	public Employee getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Employee employees) {
		this.employees = employees;
	}
	

}
