package com.qa.community.solid.liskov;

public class Penthouse {

	private int numOfBedrooms;
	
	public void addBedroom() {
		this.setNumOfBedrooms(this.getNumOfBedrooms()+1);
	}

	public int getNumOfBedrooms() {
		return numOfBedrooms;
	}

	public void setNumOfBedrooms(int numOfBedrooms) {
		this.numOfBedrooms = numOfBedrooms;
	}
	
	
}
