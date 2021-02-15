package com.oracle.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadEx {
public static void main(String[] args) {
	try (FileInputStream fi=new FileInputStream("D:/oracleData/data.txt");) {
		int ch=0;
		while(( ch=fi.read())!=-1)//read one byte at a time ....
			System.out.print((char)ch);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
