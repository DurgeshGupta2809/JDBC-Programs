package com.ty.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertLibInfo {

	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/student";
		String user="postgres";
		String password="root";
		String driver="org.postgresql.Driver";
		
          try {
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url, user, password);
			
			Statement stm=con.createStatement();
			
			String sql="update lib_card set subject='Polytecnics' where id=301";
			
			stm.execute(sql);
			
			con.close();
			System.out.println("Data Updated...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
	}

}
