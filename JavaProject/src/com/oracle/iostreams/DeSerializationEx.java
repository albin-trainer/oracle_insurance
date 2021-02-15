package com.oracle.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {
public static void main(String[] args) {
	try (FileInputStream fi = new FileInputStream("d:/oracleData/emp.ser");
		ObjectInputStream objInp=new ObjectInputStream(fi);){
		Object obj=objInp.readObject();
		if(obj instanceof Emp) {
			Emp e1=(Emp)obj;
			System.out.println("Successfully restored ..");
			System.out.println(e1.getId()+" "+e1.getName());
			System.out.println(e1.getAddress().getCity());
			System.out.println(e1.getAddress().getPinCode());
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
}
}
