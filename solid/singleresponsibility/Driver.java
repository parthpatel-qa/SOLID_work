package com.qa.community.solid.singleresponsibility;

public class Driver {

	private int mileage;
	
	
	
	public Driver(int mileage) {
		super();
		this.mileage = mileage;
	}



	public int getMileage() {
		return mileage;
	}



	public void setMileage(int mileage) {
		this.mileage = mileage;
	}



	public void drive(int milesDriven) {
		this.setMileage(this.getMileage() + milesDriven);
	}
}
