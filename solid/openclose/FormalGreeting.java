package com.qa.community.solid.openclose;

public class FormalGreeting implements Greeting{

	@Override
	public String greetPerson() {
		return ("Why hello there good sir");
	}

}
