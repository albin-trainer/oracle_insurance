package com.oracle.oops.part1;

public class Book extends Product{

	private String authourName;
	private String genre;
	
	public String getAuthourName() {
		return authourName;
	}
	public void setAuthourName(String authourName) {
		this.authourName = authourName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	//Overriding ..
	void display() {
		super.display();
		System.out.println("Authour name : "+authourName);
		System.out.println("Genre : "+genre);
	}
}
