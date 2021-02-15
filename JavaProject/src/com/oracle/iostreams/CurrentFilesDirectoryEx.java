package com.oracle.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CurrentFilesDirectoryEx {
public static void main(String[] args) throws IOException {
	try {
	Stream<Path> fileNames=	Files.list(Paths.get("D:\\oracleData"));
	
	//fileNames.forEach(s->System.out.println(s));
	fileNames.forEach(System.out::println);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("-----------------------------------");
	Stream<Path> fileNames=
			Files.walk(Paths.get("D:\\Albin\\bckup\\MY_WORK_SPACES\\OracleInsurance17-Sep-2020\\JavaProject\\src\\com\\oracle"))
			;
	fileNames.forEach(System.out::println);
}
}
