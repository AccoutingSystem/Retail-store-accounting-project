package acc.pojo;

import java.util.Date;

@Entity
@Table(name = "Account")
public class CustomerAccount {
	
	@Id
	@GeneratedValue
	@Column(name = "AccountID")
	private int accID;
	
	@Column(name = "CustomerBalance")
	private String custbalance;

	@Column(name = "Installment")
	private String installment;

	@Column(name = "Credit")
	private String custCredit;

	@Column(name = "Date")
	private Date date;

	@Column(name = "InterestRate")
	private String interestRate;

	public CustomerAccount() {
		super();
	}

	public CustomerAccount(int accID, String custbalance, String installment,
			String custCredit, Date date, String interestRate) {
		super();
		this.accID = accID;
		this.custbalance = custbalance;
		this.installment = installment;
		this.custCredit = custCredit;
		this.date = date;
		this.interestRate = interestRate;
	}

	public int getAccID() {
		return accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public String getCustbalance() {
		return custbalance;
	}

	public void setCustbalance(String custbalance) {
		this.custbalance = custbalance;
	}

	public String getInstallment() {
		return installment;
	}

	public void setInstallment(String installment) {
		this.installment = installment;
	}

	public String getCustCredit() {
		return custCredit;
	}

	public void setCustCredit(String custCredit) {
		this.custCredit = custCredit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	

}
