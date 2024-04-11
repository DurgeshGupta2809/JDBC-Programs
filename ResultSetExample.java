package OtherTypesSteps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/student?user=postgres&password=root");
			
			Statement stm= con.createStatement();
			
			String sql= "SELECT * FROM student_info";
			
			ResultSet rs=stm.executeQuery(sql);
	
			while(rs.next()) {
				
			int id=	rs.getInt("sid");
			String name= rs.getString("sname");
			String email= rs.getString("semail");
			long phone= rs.getLong("sphone");
			
			System.out.println(id);
			System.out.println(name);
			System.out.println(email);
			System.out.println(phone);
			}
			System.out.println("Fatch All the Data...");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
