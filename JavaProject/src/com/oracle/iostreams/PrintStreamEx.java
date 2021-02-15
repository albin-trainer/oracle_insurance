package com.oracle.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamEx {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
 	try  (FileOutputStream fo=new FileOutputStream("D:/oracleData/names.txt");
		PrintStream ps=new PrintStream(fo);) {
		
		ps.println("Kaushik");
		ps.println("Nitin");
		ps.println("asdfasdfasfasdasdasdkasdbmsdDJakdsjnAKJSDSDSDSD");//EVERY TIME IT FLUSH..
		System.out.println("done ...");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
