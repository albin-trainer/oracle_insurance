package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadRecordsEx {
public static void main(String[] args) {
	
	String sql="select * from emp";
	try (Connection con=DBConnection.getConnect();){
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet resultSet=pstmt.executeQuery();
		while(resultSet.next()) {
			int id=resultSet.getInt("empid");
			String name=resultSet.getString("empname");
			String email=resultSet.getString("email");
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("Email : "+email);
			System.out.println("************************");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
