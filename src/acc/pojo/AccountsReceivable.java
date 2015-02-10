package acc.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "tbl_ReceivableAccounts")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountsReceivable {
 
 @XmlAttribute
 @Id
 @Column(name = "Folio_Number")
 private long folioNr;
 
 @XmlAttribute
 @Column(name = "Amount_Received")
 private double amount;
 
 @XmlAttribute
 @Column(name = "Receivable_Date")
 private Date receivablesDate;
 
 @XmlAttribute
 @Column(name = "Receivable_Type")
 private String receivableType;
 
 @ManyToOne()
 @JoinColumn(name = "Chart_Code")
 private ChartOfAccouts charts;

 public AccountsReceivable() {
  super();
 }

 public AccountsReceivable(long folioNr, double amount,
   Date receivablesDate, String receivableType, ChartOfAccouts charts) {

  this.folioNr = folioNr;
  this.amount = amount;
  this.receivablesDate = receivablesDate;
  this.receivableType = receivableType;
  this.charts = charts;
 }

 /**
  * @return the folioNr
  */
 public long getFolioNr() {
  return folioNr;
 }

 /**
  * @param folioNr the folioNr to set
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
  * @param amount the amount to set
  */
 public void setAmount(double amount) {
  this.amount = amount;
 }

 /**
  * @return the receivablesDate
  */
 public Date getReceivablesDate() {
  return receivablesDate;
 }

 /**
  * @param receivablesDate the receivablesDate to set
  */
 public void setReceivablesDate(Date receivablesDate) {
  this.receivablesDate = receivablesDate;
 }

 /**
  * @return the receivableType
  */
 public String getReceivableType() {
  return receivableType;
 }

 /**
  * @param receivableType the receivableType to set
  */
 public void setReceivableType(String receivableType) {
  this.receivableType = receivableType;
 }

 /**
  * @return the charts
  */
 public ChartOfAccouts getCharts() {
  return charts;
 }

 /**
  * @param charts the charts to set
  */
 public void setCharts(ChartOfAccouts charts) {
  this.charts = charts;
 }
 
 
 
 
 
}