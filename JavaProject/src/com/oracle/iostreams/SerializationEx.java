package com.oracle.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializationEx {
public static void main(String[] args) {
	Address address=new Address();
	address.setCity("Bangalore");
	address.setPinCode(560035);
	Emp e1=new Emp();
	e1.setId(101);
	e1.setName("Albin");
	e1.setAddress(address);
	try (FileOutputStream fo=new FileOutputStream("d:/oracleData/emp.ser");
		ObjectOutputStream objectOutput=new ObjectOutputStream(fo);){
		objectOutput.writeObject(e1);
		System.out.println("Successfully serialized ....");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
}
}

