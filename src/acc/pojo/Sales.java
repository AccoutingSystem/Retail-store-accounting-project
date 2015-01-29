package acc.pojo;

import java.util.Date;

@Entity
@Table(name = "DailySales")
public class Sales {
	
	@Id
	@GeneratedValue
	@Column(name = "SalesID")
	private long salesID;
	
	@Column(name = "Amounts")
	private double amounts;
	
	@Column(name = "SalesType")
	private String salesType;
	
	@Column(name = "Date")
	private Date date;
	
	
	
	
	
	
	

}
