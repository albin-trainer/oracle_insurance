package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmpDao {

	public List<Employee> readRecords(){
		List<Employee> empList=new ArrayList<Employee>();
		
		String sql="select * from emp";
		try (Connection con=DBConnection.getConnect();){
			PreparedStatement pstmt=con.prepareStatement(sql);
			ResultSet resultSet=pstmt.executeQuery();
			
			while(resultSet.next()) {
				
				int id=resultSet.getInt("empid");
				String name=resultSet.getString("empname");
				String email=resultSet.getString("email");
				
				Employee e=new Employee();
				e.setEmpid(id);
				e.setEmpName(name);
				e.setEmail(email);
				
				empList.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
		
	}
}
