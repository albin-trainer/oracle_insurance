package com.oracle.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	public static void main(String[] args) {
		getConnect();
	}
public static Connection getConnect() {
	Connection con=null;
	File file=new File("db.properties");
	System.out.println(file.getAbsolutePath());
	try(FileInputStream fi=new FileInputStream(file);) {
	
		Properties prop=new Properties();
		prop.load(fi);
		String driver=prop.getProperty("driverClass");
	//	Class.forName("oracle.jdbc.driver.OracleDriver"); ///to load any class @ runtime in the JVM ..
		Class.forName(driver);
		System.out.println("Driver loaded successfully ....");
	
		String url=prop.getProperty("url");
		String uname=prop.getProperty("uname");
		String pwd=prop.getProperty("pwd");
		con=DriverManager.getConnection(url,uname,pwd);
		System.out.println("connected succesfully with mysql db");
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
}
