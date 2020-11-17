package com.qa.community.solid.openclose;

public class Greeter {

	private Greeting greeting;

	//constructors
	public Greeter(Greeting greeting) {
		this.greeting = greeting;
	}

	public String greetPerson() {
		return this.greeting.greetPerson();
	}
	
	//getters and setters
	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	
}
