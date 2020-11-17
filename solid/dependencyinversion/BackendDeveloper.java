package com.qa.community.solid.dependencyinversion;

public class BackendDeveloper implements Developer{

	public void develop() {
		writeJava();
		
	}
	public void writeJava() {
		System.out.println("java is great");
	}

}
