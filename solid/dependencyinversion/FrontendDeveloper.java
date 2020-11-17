package com.qa.community.solid.dependencyinversion;

public class FrontendDeveloper implements Developer{

	public void develop() {
		writeJavascript();
		
		
	}
	public void writeJavascript() {
		System.out.println("JS is used everywhere");
	}

}
