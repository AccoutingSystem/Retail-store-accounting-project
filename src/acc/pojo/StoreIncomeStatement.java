package acc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/*The class StoreIncomeStatement */
@XmlRootElement
@Entity
@Table(name = "StoreIncomeStatement")
@XmlAccessorType(XmlAccessType.FIELD)
public class StoreIncomeStatement {

	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "StoreIncomeStatementID")
	private long incomeStateID;
	
	@XmlAttribute
	@Column(name = "SalesIncome")
	private double salesIncome;
	
	@XmlAttribute
	@Column(name = "Investment")
	private double investment;
	
	@XmlAttribute
	@Column(name = "OfficeSupplies")
	private double officeSupplies;
	
	@XmlAttribute
	@Column(name = "TelephoneExpenses")
	private double telExpenses;

	@XmlAttribute
	@Column(name = "Utilities")
	private double utilities;

	@XmlAttribute
	@Column(name = "Maintenance")
	private double maintenance;

	@XmlAttribute
	@Column(name = "Insurance")
	private double insurance;

	@XmlAttribute
	@Column(name = "MiscellaneousExpenses")
	private double miscellExpenses;

	@XmlAttribute
	@Column(name = "TravelNIntertainment")
	private double travNIntertain;

	@XmlAttribute
	@Column(name = "BankCharges")
	private double bankCharges;
	
	@XmlAttribute
	@Column(name = "TaxExpenses")
	private double taxExpenses;

	public StoreIncomeStatement() {
		super();
	}

	public StoreIncomeStatement(double salesIncome,
			double investment, double officeSupplies, double telExpenses,
			double utilities, double maintenance, double insurance,
			double miscellExpenses, double travNIntertain, double bankCharges,
			double taxExpenses) {
		super();
		this.salesIncome = salesIncome;
		this.investment = investment;
		this.officeSupplies = officeSupplies;
		this.telExpenses = telExpenses;
		this.utilities = utilities;
		this.maintenance = maintenance;
		this.insurance = insurance;
		this.miscellExpenses = miscellExpenses;
		this.travNIntertain = travNIntertain;
		this.bankCharges = bankCharges;
		this.taxExpenses = taxExpenses;
	}

	/**
	 * @return the incomeStateID
	 */
	public long getIncomeStateID() {
		return incomeStateID;
	}

	/**
	 * @param incomeStateID the incomeStateID to set
	 */
	public void setIncomeStateID(long incomeStateID) {
		this.incomeStateID = incomeStateID;
	}

	/**
	 * @return the salesIncome
	 */
	public double getSalesIncome() {
		return salesIncome;
	}

	/**
	 * @param salesIncome the salesIncome to set
	 */
	public void setSalesIncome(double salesIncome) {
		this.salesIncome = salesIncome;
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
	 * @return the officeSupplies
	 */
	public double getOfficeSupplies() {
		return officeSupplies;
	}

	/**
	 * @param officeSupplies the officeSupplies to set
	 */
	public void setOfficeSupplies(double officeSupplies) {
		this.officeSupplies = officeSupplies;
	}

	/**
	 * @return the telExpenses
	 */
	public double getTelExpenses() {
		return telExpenses;
	}

	/**
	 * @param telExpenses the telExpenses to set
	 */
	public void setTelExpenses(double telExpenses) {
		this.telExpenses = telExpenses;
	}

	/**
	 * @return the utilities
	 */
	public double getUtilities() {
		return utilities;
	}

	/**
	 * @param utilities the utilities to set
	 */
	public void setUtilities(double utilities) {
		this.utilities = utilities;
	}

	/**
	 * @return the maintenance
	 */
	public double getMaintenance() {
		return maintenance;
	}

	/**
	 * @param maintenance the maintenance to set
	 */
	public void setMaintenance(double maintenance) {
		this.maintenance = maintenance;
	}

	/**
	 * @return the insurance
	 */
	public double getInsurance() {
		return insurance;
	}

	/**
	 * @param insurance the insurance to set
	 */
	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}

	/**
	 * @return the miscellExpenses
	 */
	public double getMiscellExpenses() {
		return miscellExpenses;
	}

	/**
	 * @param miscellExpenses the miscellExpenses to set
	 */
	public void setMiscellExpenses(double miscellExpenses) {
		this.miscellExpenses = miscellExpenses;
	}

	/**
	 * @return the travNIntertain
	 */
	public double getTravNIntertain() {
		return travNIntertain;
	}

	/**
	 * @param travNIntertain the travNIntertain to set
	 */
	public void setTravNIntertain(double travNIntertain) {
		this.travNIntertain = travNIntertain;
	}

	/**
	 * @return the bankCharges
	 */
	public double getBankCharges() {
		return bankCharges;
	}

	/**
	 * @param bankCharges the bankCharges to set
	 */
	public void setBankCharges(double bankCharges) {
		this.bankCharges = bankCharges;
	}

	/**
	 * @return the taxExpenses
	 */
	public double getTaxExpenses() {
		return taxExpenses;
	}

	/**
	 * @param taxExpenses the taxExpenses to set
	 */
	public void setTaxExpenses(double taxExpenses) {
		this.taxExpenses = taxExpenses;
	}
	
}
