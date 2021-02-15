package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecordEx {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter empid ");
		int id=scanner.nextInt();
		System.out.println("Enter email id ");
		String email=scanner.next();
		String sql="update emp set email=? where empid=?";
		
		try (Connection con=DBConnection.getConnect();){
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setInt(2, id);
			int c=pstmt.executeUpdate();
			System.out.println(c+ " no of rows affected ...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
