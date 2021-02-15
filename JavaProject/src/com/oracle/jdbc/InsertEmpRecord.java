package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmpRecord {
public static void main(String[] args) {

	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter empid ");
	int id=scanner.nextInt();
	System.out.println("Enter Emp name");
	String name=scanner.next();
	System.out.println("Enter email id ");
	String email=scanner.next();
	
	String sql="insert into emp values(?,?,?)";
	try (Connection con=DBConnection.getConnect();){
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1,id);
		pstmt.setString(3, email);
		pstmt.setString(2, name);
		int c=pstmt.executeUpdate();//insert,update,delete queries
		System.out.println(c+"  no of rows affected ..");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
