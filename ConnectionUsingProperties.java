package OtherTypesSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUsingProperties {

	public static void main(String[] args) {
	
		
		try {
			FileInputStream fin = new FileInputStream("student_db.properties");
			
			Properties pro=new Properties();
			pro.load(fin);
			
			//step 1
			String driver1= pro.getProperty("driver");
	        Class.forName(driver1);
	        
	        //step 2
	        String url1=pro.getProperty("url");
	        Connection con=DriverManager.getConnection(url1, pro);
	        
	        //step 3
	        Statement stm=con.createStatement();
	        
	        String sql="Insert into student_info values(331,'Kaju','kaju@gmail.com',1235433)";
	        
	        //step 4
	        stm.execute(sql);
	        
	        //step 5
	        con.close();
	        System.out.println("Data Inserted...");
	        
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
