package acc.pojo;

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
	@Column(name = "AccountNr")
	private long supplAccNr;
	
	@XmlAttribute
	@Column(name = "BrachCode")
	private long branchCode;
	
	@XmlAttribute
	@Column(name = "BankName")
	private String bankName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "supplier")	
	private List<SupplierPayment> supplierPayments;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "servicesOffered")	
	private List<SupplierServices> supplierServices;
	
	public Suppliers() {
		super();
	}

	public Suppliers(String supplName, String supplContactNr,
			String supplEmail, String supplAddress, long supplAccNr,
			long branchCode, String bankName,
			List<SupplierPayment> supplierPayments,
			List<SupplierServices> supplierServices) {
		super();
		this.supplName = supplName;
		this.supplContactNr = supplContactNr;
		this.supplEmail = supplEmail;
		this.supplAddress = supplAddress;
		this.supplAccNr = supplAccNr;
		this.branchCode = branchCode;
		this.bankName = bankName;
		this.supplierPayments = supplierPayments;
		this.supplierServices = supplierServices;
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

	/**
	 * @return the supplierServices
	 */
	public List<SupplierServices> getSupplierServices() {
		return supplierServices;
	}

	/**
	 * @param supplierServices the supplierServices to set
	 */
	public void setSupplierServices(List<SupplierServices> supplierServices) {
		this.supplierServices = supplierServices;
	}

	
}
