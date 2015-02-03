package acc.pojo;

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
@Table(name = "Suppliers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Suppliers {
	
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "SupplierID")
	private long supplID;
	
	@XmlAttribute
	@Column(name = "SupplierName")
	private String supplName;
	

	@XmlAttribute
	@Column(name = "ContactNr")
	private String supplContactNr;
	
	@XmlAttribute
	@Column(name = "Email")
	private String supplEmail;

	@XmlAttribute
	@Column(name = "Address")
	private String supplAddress;
	
	@XmlAttribute
	@Column(name = "StartDate")
	private Date startDate;
	
	@XmlAttribute
	@Column(name = "AccountNr")
	private long supplAccNr;
	
	@XmlAttribute
	@Column(name = "BrachCode")
	private long branchCode;
	
	@XmlAttribute
	@Column(name = "BankName")
	private String bankName;
	
	@XmlAttribute
	@Column(name = "StartDate")
	private Date endDate;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "supplier")	
	private List<SupplierPayment> supplierPayments;

	public Suppliers() {
		super();
	}

	public Suppliers(String supplName, String supplContactNr,
			String supplEmail, String supplAddress, Date startDate,
			long supplAccNr, long branchCode, String bankName, Date endDate,
			List<SupplierPayment> supplierPayments) {
		super();
		this.supplName = supplName;
		this.supplContactNr = supplContactNr;
		this.supplEmail = supplEmail;
		this.supplAddress = supplAddress;
		this.startDate = startDate;
		this.supplAccNr = supplAccNr;
		this.branchCode = branchCode;
		this.bankName = bankName;
		this.endDate = endDate;
		this.supplierPayments = supplierPayments;
	}

	/**
	 * @return the supplID
	 */
	public long getSupplID() {
		return supplID;
	}

	/**
	 * @param supplID the supplID to set
	 */
	public void setSupplID(long supplID) {
		this.supplID = supplID;
	}

	/**
	 * @return the supplName
	 */
	public String getSupplName() {
		return supplName;
	}

	/**
	 * @param supplName the supplName to set
	 */
	public void setSupplName(String supplName) {
		this.supplName = supplName;
	}

	/**
	 * @return the supplContactNr
	 */
	public String getSupplContactNr() {
		return supplContactNr;
	}

	/**
	 * @param supplContactNr the supplContactNr to set
	 */
	public void setSupplContactNr(String supplContactNr) {
		this.supplContactNr = supplContactNr;
	}

	/**
	 * @return the supplEmail
	 */
	public String getSupplEmail() {
		return supplEmail;
	}

	/**
	 * @param supplEmail the supplEmail to set
	 */
	public void setSupplEmail(String supplEmail) {
		this.supplEmail = supplEmail;
	}

	/**
	 * @return the supplAddress
	 */
	public String getSupplAddress() {
		return supplAddress;
	}

	/**
	 * @param supplAddress the supplAddress to set
	 */
	public void setSupplAddress(String supplAddress) {
		this.supplAddress = supplAddress;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the supplAccNr
	 */
	public long getSupplAccNr() {
		return supplAccNr;
	}

	/**
	 * @param supplAccNr the supplAccNr to set
	 */
	public void setSupplAccNr(long supplAccNr) {
		this.supplAccNr = supplAccNr;
	}

	/**
	 * @return the branchCode
	 */
	public long getBranchCode() {
		return branchCode;
	}

	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(long branchCode) {
		this.branchCode = branchCode;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the supplierPayments
	 */
	public List<SupplierPayment> getSupplierPayments() {
		return supplierPayments;
	}

	/**
	 * @param supplierPayments the supplierPayments to set
	 */
	public void setSupplierPayments(List<SupplierPayment> supplierPayments) {
		this.supplierPayments = supplierPayments;
	}
	
}
