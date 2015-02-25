package acc.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Type;

@XmlRootElement
@Entity
@Table(name = "tbl_PayableAccounts")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountsPayable {
	
	@XmlAttribute
	@Id
	@Column(name = "Folio_Number")
	private long folioNr;

	@XmlAttribute
	@Column(name = "Amount_Paid")
	private double amount;

	@XmlAttribute
	@Column(name = "Payment_Date")
	@Type(type = "date")
	private Date paymentDate;

	@XmlAttribute
	@Column(name = "Payment_Type")
	private String paymentType;

	@Transient
	private Long c;

	@ManyToOne()
	@JoinColumn(name = "Chart_Code")
	private ChartOfAccounts charts;
	
	// default constructor
	public AccountsPayable() {

	}
	
	// constructor
	public AccountsPayable(long folioNr, double amount, Date paymentDate,
			String paymentType, ChartOfAccounts charts) {

		this.folioNr = folioNr;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.paymentType = paymentType;
		this.charts = charts;
	}
	
	// getters & setters
	/**
	 * @return the folioNr
	 */
	public long getFolioNr() {
		return folioNr;
	}

	/**
	 * @param folioNr
	 *            the folioNr to set
	 */
	public void setFolioNr(long folioNr) {
		this.folioNr = folioNr;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate
	 *            the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType
	 *            the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @return the charts
	 */
	public ChartOfAccounts getCharts() {
		return charts;
	}

	public Long getC() {
		return c;
	}

	public void setC(Long c) {
		this.c = c;
	}

	/**
	 * @param charts
	 *            the charts to set
	 */
	public void setCharts(ChartOfAccounts charts) {
		this.charts = charts;
	}

}