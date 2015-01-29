package acc.pojo;

@Entity
@Table(name = "AccountPayment")
public class AccountPayment {

	@Id
	@GeneratedValue
	@Column(name = "AccountPaymentID")
	private int accPaymentID;
	
	@Column(name = "Amount")
	private double amount;
	
	/*Relationships  @Column(name = "AccountPaymentID")
	private Custo accID;*/
	
	
	
	 
	
	
	

}
