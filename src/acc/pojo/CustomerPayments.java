package acc.pojo;

import java.util.Date;

@Entity
@Table(name = "CustomerPayments")
public class CustomerPayments {

	@Id
	@GeneratedValue
	@Column(name = "PaymentID")
	private long paymentID;
	
	@Column(name = "Date")
	private Date date;
	

	public CustomerPayments() {
		super();
	}

	public CustomerPayments(int paymentID, Date date) {
		super();
		this.paymentID = paymentID;
		this.date = date;
	}
	
	
	

}
