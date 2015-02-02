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
@Table(name = "PayrolExpenses")
@XmlAccessorType(XmlAccessType.FIELD)
public class PayrolExpenses {
	
	@XmlAttribute
	@Id
	@GeneratedValue
	@Column(name = "PayrollNumber")
	private long payrollNr;
	
	@XmlAttribute
	@Column(name = "Benefits")
	private String benefits;
	
	@XmlAttribute
	@Column(name = "SalaryRatings")
	private double salaryRatings;
	
	@XmlAttribute
	@Column(name = "WageRatings")
	private double wageRatings;
	
	@XmlAttribute
	@Column(name = "Bonuses")
	private double bonuses;
	
	@XmlAttribute
	@Column(name = "Leaves")
	private String leave;
	
	@XmlAttribute
	@Column(name = "TelephoneExpenses")
	private double telExpenses;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "payrolls")
	private List<Employee> payrolExpense;
	

	public PayrolExpenses() {
		super();
	}


	public PayrolExpenses(String benefits, double salaryRatings,
			double wageRatings, double bonuses, String leave,
			double telExpenses, List<Employee> payrolExpense) {
		super();
		this.benefits = benefits;
		this.salaryRatings = salaryRatings;
		this.wageRatings = wageRatings;
		this.bonuses = bonuses;
		this.leave = leave;
		this.telExpenses = telExpenses;
		this.payrolExpense = payrolExpense;
	}


	public long getPayrollNr() {
		return payrollNr;
	}


	public void setPayrollNr(long payrollNr) {
		this.payrollNr = payrollNr;
	}


	public String getBenefits() {
		return benefits;
	}


	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}


	public double getSalaryRatings() {
		return salaryRatings;
	}


	public void setSalaryRatings(double salaryRatings) {
		this.salaryRatings = salaryRatings;
	}


	public double getWageRatings() {
		return wageRatings;
	}


	public void setWageRatings(double wageRatings) {
		this.wageRatings = wageRatings;
	}


	public double getBonuses() {
		return bonuses;
	}


	public void setBonuses(double bonuses) {
		this.bonuses = bonuses;
	}


	public String getLeave() {
		return leave;
	}


	public void setLeave(String leave) {
		this.leave = leave;
	}


	public double getTelExpenses() {
		return telExpenses;
	}


	public void setTelExpenses(double telExpenses) {
		this.telExpenses = telExpenses;
	}


	public List<Employee> getPayrolExpense() {
		return payrolExpense;
	}


	public void setPayrolExpense(List<Employee> payrolExpense) {
		this.payrolExpense = payrolExpense;
	}

	

}
