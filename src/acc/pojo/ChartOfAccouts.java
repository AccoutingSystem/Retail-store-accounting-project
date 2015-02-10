package acc.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "tbl_ChartOfAccouts")
@XmlAccessorType(XmlAccessType.FIELD)
public class ChartOfAccouts {
 
 @XmlAttribute
 @Id
 @Column(name = "Chart_Code")
 private long chartCode;
 
 @XmlAttribute
 @Column(name = "Chart_Description")
 private String chartDescription;
 
 @XmlAttribute
 @Column(name = "Chart_Type")
 private String chartType;
 
 @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "charts") 
 private List<AccountsPayable> payable;
 
 @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "charts")
 private List<AccountsReceivable> receivable;

 public ChartOfAccouts() {
 
 }

public ChartOfAccouts(long chartCode, String chartDescription, String chartType) {
	super();
	this.chartCode = chartCode;
	this.chartDescription = chartDescription;
	this.chartType = chartType;
}

public ChartOfAccouts(long chartCode, String chartDescription,
		String chartType, List<AccountsPayable> payable,
		List<AccountsReceivable> receivable) {
	super();
	this.chartCode = chartCode;
	this.chartDescription = chartDescription;
	this.chartType = chartType;
	this.payable = payable;
	this.receivable = receivable;
}

/**
 * @return the chartCode
 */
public long getChartCode() {
	return chartCode;
}

/**
 * @param chartCode the chartCode to set
 */
public void setChartCode(long chartCode) {
	this.chartCode = chartCode;
}

/**
 * @return the chartDescription
 */
public String getChartDescription() {
	return chartDescription;
}

/**
 * @param chartDescription the chartDescription to set
 */
public void setChartDescription(String chartDescription) {
	this.chartDescription = chartDescription;
}

/**
 * @return the chartType
 */
public String getChartType() {
	return chartType;
}

/**
 * @param chartType the chartType to set
 */
public void setChartType(String chartType) {
	this.chartType = chartType;
}

/**
 * @return the payable
 */
public List<AccountsPayable> getPayable() {
	return payable;
}

/**
 * @param payable the payable to set
 */
public void setPayable(List<AccountsPayable> payable) {
	this.payable = payable;
}

/**
 * @return the receivable
 */
public List<AccountsReceivable> getReceivable() {
	return receivable;
}

/**
 * @param receivable the receivable to set
 */
public void setReceivable(List<AccountsReceivable> receivable) {
	this.receivable = receivable;
}



}
