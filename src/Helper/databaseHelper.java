package Helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class databaseHelper {
	
	private static final EntityManagerFactory entityManagerFactory = produceObj();
	private static EntityManagerFactory produceObj() {	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("accounting");	
		return entityManagerFactory;
	}
	public static EntityManagerFactory provideFactory(){	
		return entityManagerFactory;	
	}
	
}
