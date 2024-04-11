package com.ty.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResuleSet {

	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/student?user=postgres&password=root";
		String driver="org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url);
			
			String sql="Select * from lib_card";
			
			Statement stm=con.createStatement();
			
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()) {
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				long phone=rs.getLong(3);
				String subject=rs.getString(4);
				
				System.out.println(id);
				System.out.println(name);
				System.out.println(phone);
				System.out.println(subject);
			}
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
