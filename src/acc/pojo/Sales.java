package acc.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
