package com.oracle.exceptions;

import java.sql.SQLException;

public class ThrowsEx {
public static void main(String[] args) throws SQLException {
	//try {
		System.out.println("main starts ..");
		myMethod();
	//} catch (SQLException e) {
	//	System.out.println("in catch ...");
//	}
	System.out.println("main ends ..");
}

static void myMethod() throws SQLException {
	yourMethod();
}
static void yourMethod()   throws SQLException{
	//There is a chance of getting SQL exceptin since this method connecting with database
	throw new SQLException();
	//only b logic ...
	//no need to worry abt exception and exception handing ...
}
}
