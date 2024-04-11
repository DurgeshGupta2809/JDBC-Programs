package OtherTypesSteps;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.postgresql.Driver;

public class RegisterDriver {
 
	public static void main(String[] args) {
	
	//Driver driver = new Driver();
	
	try {
		DriverManager.registerDriver(new Driver());
		System.out.println("Driver Register...");
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
		
    }
}
