/*package acc.pojo;

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

A bridge table for employee and sales table
@XmlRootElement
@Entity
@Table(name = "StoreSalesRecord")
@XmlAccessorType(XmlAccessType.FIELD)
public class StoreSalesRecord
{
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "SalesRecordID")
	private long salesRecNr;
	
	@XmlAttribute
	@Column(name = "SalesAmounts")
	private double deptSalesAmounts;
	
	@XmlAttribute
	@Column(name = "SalesRecordDate")
	private Date salesRecDate;
	
	@ManyToOne()
	@JoinColumn(name = "EmployeeID")
	private Employee employee;
	
	@ManyToOne()
	@JoinColumn(name ="SalesID")
	private Sales sales;

	public StoreSalesRecord() {
		super();
	}

	public StoreSalesRecord(double deptSalesAmounts,
			Date salesRecDate, Employee employee, Sales sales) {
		super();
		this.deptSalesAmounts = deptSalesAmounts;
		this.salesRecDate = salesRecDate;
		this.employee = employee;
		this.sales = sales;
	}

	public long getSalesRecNr() {
		return salesRecNr;
	}

	public void setSalesRecNr(long salesRecNr) {
		this.salesRecNr = salesRecNr;
	}

	public double getDeptSalesAmounts() {
		return deptSalesAmounts;
	}

	public void setDeptSalesAmounts(double deptSalesAmounts) {
		this.deptSalesAmounts = deptSalesAmounts;
	}

	public Date getSalesRecDate() {
		return salesRecDate;
	}

	public void setSalesRecDate(Date salesRecDate) {
		this.salesRecDate = salesRecDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}
	
	
}
*/