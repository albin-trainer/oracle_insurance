package com.oracle.iostreams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
public static void main(String[] args) {
	try  (FileOutputStream fo=new FileOutputStream("D:/oracleData/buffer.txt");
		BufferedOutputStream buffer=new BufferedOutputStream(fo,2);) {
		//FileOutputStream fo=new FileOutputStream("D:/oracleData/buffer.txt");
		//BufferedOutputStream buffer=new BufferedOutputStream(fo,2);
		buffer.write('A');
		buffer.write('B'); //buffer is full
		buffer.write('C');//no space in  buffer, so its flush the buffer & c is added in buffer
		System.out.println("Done ...");
		//buffer.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
