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

/*the class SupplierServices*/
@XmlRootElement
@Entity
@Table(name = "SupplierServices")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplierServices {
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "ServiceID")
	private long serviceID;
	
	@XmlAttribute
	@Column(name = "ServiceName")
	private String serviceName;
	
	@XmlAttribute
	@Column(name = "Quantity")
	private String quantity;
	
	@XmlAttribute
	@Column(name = "StartDate")
	private Date startDate;
	
	@XmlAttribute
	@Column(name = "EndDate")
	private Date endDate;
	
	@ManyToOne()
	@JoinColumn(name ="SupplierID")
	private Suppliers servicesOffered;

	public SupplierServices() {
		super();
	}

	public SupplierServices(String serviceName, String quantity,
			Date startDate, Date endDate, Suppliers servicesOffered) {
		super();
		this.serviceName = serviceName;
		this.quantity = quantity;
		this.startDate = startDate;
		this.endDate = endDate;
		this.servicesOffered = servicesOffered;
	}

	/**
	 * @return the serviceID
	 */
	public long getServiceID() {
		return serviceID;
	}

	/**
	 * @param serviceID the serviceID to set
	 */
	public void setServiceID(long serviceID) {
		this.serviceID = serviceID;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
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
	 * @return the servicesOffered
	 */
	public Suppliers getServicesOffered() {
		return servicesOffered;
	}

	/**
	 * @param servicesOffered the servicesOffered to set
	 */
	public void setServicesOffered(Suppliers servicesOffered) {
		this.servicesOffered = servicesOffered;
	}

	
	
}
