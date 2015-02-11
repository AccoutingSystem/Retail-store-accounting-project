/*package acc.pojo;

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

The StoreAccount class
@XmlRootElement
@Entity
@Table(name = "StoreAccount")
@XmlAccessorType(XmlAccessType.FIELD)
public class StoreAccount {
	
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "StoreAccountID")
	private long storeAccID;
	
	@XmlAttribute
	@Column(name = "StoreName")
	private String storeName;
	
	@XmlAttribute
	@Column(name = "FixedPayment")
	private double initialPayment;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "storeAcc")
	private List<StoreAccountsPayable> storeAccounts;

	public StoreAccount() {
		super();
	}

	public StoreAccount(String storeName,
			double initialPayment, List<StoreAccountsPayable> storeAccounts) {
		super();
		this.storeName = storeName;
		this.initialPayment = initialPayment;
		this.storeAccounts = storeAccounts;
	}

	*//**
	 * @return the storeAccID
	 *//*
	public long getStoreAccID() {
		return storeAccID;
	}

	*//**
	 * @param storeAccID the storeAccID to set
	 *//*
	public void setStoreAccID(long storeAccID) {
		this.storeAccID = storeAccID;
	}

	*//**
	 * @return the storeName
	 *//*
	public String getStoreName() {
		return storeName;
	}

	*//**
	 * @param storeName the storeName to set
	 *//*
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	*//**
	 * @return the initialPayment
	 *//*
	public double getInitialPayment() {
		return initialPayment;
	}

	*//**
	 * @param initialPayment the initialPayment to set
	 *//*
	public void setInitialPayment(double initialPayment) {
		this.initialPayment = initialPayment;
	}

	*//**
	 * @return the storeAccounts
	 *//*
	public List<StoreAccountsPayable> getStoreAccounts() {
		return storeAccounts;
	}

	*//**
	 * @param storeAccounts the storeAccounts to set
	 *//*
	public void setStoreAccounts(List<StoreAccountsPayable> storeAccounts) {
		this.storeAccounts = storeAccounts;
	}

}
*/