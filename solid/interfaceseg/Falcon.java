package com.qa.community.solid.interfaceseg;

public class Falcon implements FlyingCreature, EggLayingCreature {

	private String currentLocation;
	private int numberOfEggs;
	
	public Falcon(int initalNumberOfEggs) {
		this.setNumberOfEggs(numberOfEggs);
	}
	
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public int getNumberOfEggs() {
		return numberOfEggs;
	}
	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canFly() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
