//package acc.pojo;
//
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlRootElement;
//
//@XmlRootElement
//@Entity
//@Table(name = "DailySales")
//@XmlAccessorType(XmlAccessType.FIELD)
//public class Sales {
//	
//	@XmlAttribute
//	@Id
//	@GeneratedValue
//	@Column(name = "SalesID")
//	private long salesID;
//
//	@XmlAttribute
//	@Column(name = "SalesDepartment")
//	private String salesDepartment;
//	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "sales")	
//	private List<StoreSalesRecord> storeSales;
//
//	public Sales() {
//		super();
//	}
//	
//	public Sales(String salesDepartment, List<StoreSalesRecord> storeSales) {
//		super();
//		this.salesDepartment = salesDepartment;
//		this.storeSales = storeSales;
//	}
//
//	/**
//	 * @return the salesID
//	 */
//	public long getSalesID() {
//		return salesID;
//	}
//
//	/**
//	 * @param salesID the salesID to set
//	 */
//	public void setSalesID(long salesID) {
//		this.salesID = salesID;
//	}
//
//	/**
//	 * @return the salesDepartment
//	 */
//	public String getSalesDepartment() {
//		return salesDepartment;
//	}
//
//	/**
//	 * @param salesDepartment the salesDepartment to set
//	 */
//	public void setSalesDepartment(String salesDepartment) {
//		this.salesDepartment = salesDepartment;
//	}
//
//	/**
//	 * @return the storeSales
//	 */
//	public List<StoreSalesRecord> getStoreSales() {
//		return storeSales;
//	}
//
//	/**
//	 * @param storeSales the storeSales to set
//	 */
//	public void setStoreSales(List<StoreSalesRecord> storeSales) {
//		this.storeSales = storeSales;
//	}
//	
//}
