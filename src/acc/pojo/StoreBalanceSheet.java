package acc.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/*The class StoreBalanceSheet */
@XmlRootElement
@Entity
@Table(name = "StoreBalanceSheet")
@XmlAccessorType(XmlAccessType.FIELD)
public class StoreBalanceSheet {
	

	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "BalanceSheetID")
	private long balanceSheetID;
	
	@XmlAttribute
	@Column(name = "CheckingAccounts")
	private double checkingAcc;
	
	@XmlAttribute
	@Column(name = "Investment")
	private double investment;
	
	@XmlAttribute
	@Column(name = "AccountsReceivable")
	private double accReceivable;
	
	@XmlAttribute
	@Column(name = "AccountsPayable")
	private double accPayable;

	@XmlAttribute
	@Column(name = "LoansPayable")
	private double loansPayable;

	@XmlAttribute
	@Column(name = "SalariesPayable")
	private double salariesPayable;

	@XmlAttribute
	@Column(name = "TaxesPayable")
	private double taxesPayable;

	@XmlAttribute
	@Column(name = "OwnersEquity")
	private double ownersEquity;

	@XmlAttribute
	@Column(name = "Profit")
	private double profit;

	@XmlAttribute
	@Column(name = "Loss")
	private double loss;

	public StoreBalanceSheet() {
		super();
	}

	public StoreBalanceSheet(double checkingAcc,
			double investment, double accReceivable, double accPayable,
			double loansPayable, double salariesPayable, double taxesPayable,
			double ownersEquity, double profit, double loss) {
		super();
		this.checkingAcc = checkingAcc;
		this.investment = investment;
		this.accReceivable = accReceivable;
		this.accPayable = accPayable;
		this.loansPayable = loansPayable;
		this.salariesPayable = salariesPayable;
		this.taxesPayable = taxesPayable;
		this.ownersEquity = ownersEquity;
		this.profit = profit;
		this.loss = loss;
	}

	/**
	 * @return the balanceSheetID
	 */
	public long getBalanceSheetID() {
		return balanceSheetID;
	}

	/**
	 * @param balanceSheetID the balanceSheetID to set
	 */
	public void setBalanceSheetID(long balanceSheetID) {
		this.balanceSheetID = balanceSheetID;
	}

	/**
	 * @return the checkingAcc
	 */
	public double getCheckingAcc() {
		return checkingAcc;
	}

	/**
	 * @param checkingAcc the checkingAcc to set
	 */
	public void setCheckingAcc(double checkingAcc) {
		this.checkingAcc = checkingAcc;
	}

	/**
	 * @return the investment
	 */
	public double getInvestment() {
		return investment;
	}

	/**
	 * @param investment the investment to set
	 */
	public void setInvestment(double investment) {
		this.investment = investment;
	}

	/**
	 * @return the accReceivable
	 */
	public double getAccReceivable() {
		return accReceivable;
	}

	/**
	 * @param accReceivable the accReceivable to set
	 */
	public void setAccReceivable(double accReceivable) {
		this.accReceivable = accReceivable;
	}

	/**
	 * @return the accPayable
	 */
	public double getAccPayable() {
		return accPayable;
	}

	/**
	 * @param accPayable the accPayable to set
	 */
	public void setAccPayable(double accPayable) {
		this.accPayable = accPayable;
	}

	/**
	 * @return the loansPayable
	 */
	public double getLoansPayable() {
		return loansPayable;
	}

	/**
	 * @param loansPayable the loansPayable to set
	 */
	public void setLoansPayable(double loansPayable) {
		this.loansPayable = loansPayable;
	}

	/**
	 * @return the salariesPayable
	 */
	public double getSalariesPayable() {
		return salariesPayable;
	}

	/**
	 * @param salariesPayable the salariesPayable to set
	 */
	public void setSalariesPayable(double salariesPayable) {
		this.salariesPayable = salariesPayable;
	}

	/**
	 * @return the taxesPayable
	 */
	public double getTaxesPayable() {
		return taxesPayable;
	}

	/**
	 * @param taxesPayable the taxesPayable to set
	 */
	public void setTaxesPayable(double taxesPayable) {
		this.taxesPayable = taxesPayable;
	}

	/**
	 * @return the ownersEquity
	 */
	public double getOwnersEquity() {
		return ownersEquity;
	}

	/**
	 * @param ownersEquity the ownersEquity to set
	 */
	public void setOwnersEquity(double ownersEquity) {
		this.ownersEquity = ownersEquity;
	}

	/**
	 * @return the profit
	 */
	public double getProfit() {
		return profit;
	}

	/**
	 * @param profit the profit to set
	 */
	public void setProfit(double profit) {
		this.profit = profit;
	}

	/**
	 * @return the loss
	 */
	public double getLoss() {
		return loss;
	}

	/**
	 * @param loss the loss to set
	 */
	public void setLoss(double loss) {
		this.loss = loss;
	}

}
