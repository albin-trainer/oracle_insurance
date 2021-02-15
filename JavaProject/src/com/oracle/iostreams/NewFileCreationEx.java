package com.oracle.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFileCreationEx {
public static void main(String[] args) {
	Path path=Paths.get("d:/oracleData/hello.txt");
	Path path2=Paths.get("d:/oracleData/copyhello.txt");
	try {
	//	Files.createFile(path);
		//System.out.println("file created ...");
		Files.copy(path, path2);
		System.out.println("copied ...");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
